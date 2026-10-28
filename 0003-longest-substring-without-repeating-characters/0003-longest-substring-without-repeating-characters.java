class Solution {
    public int lengthOfLongestSubstring(String s) {
            int low = 0;
            int result = 0;
            int n = s.length();
            HashMap<Character,Integer> frequency = new HashMap<>();
            for (int high = 0; high < n; high++){
                frequency.put(s.charAt(high),frequency.getOrDefault(s.charAt(high),0)+1);
                int k = high - low +1;
                if (frequency.size()==k){
                   result = Math.max(result,k);
                }
                while(frequency.size()<k){
                    char c = s.charAt(low);
                    frequency.put(c, frequency.get(c)-1);
                    if (frequency.get(c)==0){
                        frequency.remove(c);
                    }
                    low ++;
                    k = high - low +1;
                }
                int len = high - low +1;
                result = Math.max(result,len);
            }
            return result;
        }
    }
