class Solution {
    public int characterReplacement(String s, int k) {
        int low = 0;
        int result = 0;
        int n = s.length();
        HashMap<Character,Integer> freq = new HashMap<>();
        for (int high = 0; high<n;high++) {
            freq.put(s.charAt(high), freq.getOrDefault(s.charAt(high), 0) + 1);
            int len = high - low + 1;
            int maxInt = Collections.max(freq.values());
            int diff = len - maxInt;
            while (diff > k) {
                char c = s.charAt(low);
                freq.put(c, freq.get(c) - 1);
                low++;
                len = high -low + 1;
                diff = len - maxInt;
            }
            len = high - low +1;
            result = Math.max(result,len);
        }
        return result;
        
    }
}