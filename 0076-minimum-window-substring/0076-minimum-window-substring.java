class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length() || t.isEmpty()) {
                return "";
            }
        int low = 0;
        int result = 0;
        int formed = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

            HashMap<Character,Integer> freq = new HashMap<>();
            HashMap<Character,Integer> freq_need = new HashMap<>();
            //
            for (int i = 0; i<t.length(); i++){
                char need = t.charAt(i);
                freq_need.put(need,freq_need.getOrDefault(need,0)+1);
            }
            for (int high = 0; high < s.length(); high++) {
                char have = s.charAt(high);
                freq.put(have, freq.getOrDefault(have, 0) + 1);
                //
                if (freq_need.containsKey(have) && freq.get(have).intValue() == freq_need.get(have).intValue()) {
                    formed++;
                }
                while (formed == freq_need.size()){
                    int len = high - low +1;
                    if (len < minLen){
                        minLen = len;
                        start = low;
                    }
                    char leftChar = s.charAt(low);
                    freq.put(leftChar,freq.get(leftChar)-1);
                    if (freq_need.containsKey(leftChar)&&freq.get(leftChar) < freq_need.get(leftChar)){
                        formed--;
                    }
                    low++;
                }
            }


            if (minLen == Integer.MAX_VALUE) {
                return "";
            }
            return s.substring(start,start+minLen);
    }
}