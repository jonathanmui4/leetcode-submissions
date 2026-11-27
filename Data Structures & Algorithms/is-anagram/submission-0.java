class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<String, Integer> sChars = new HashMap<>();
        HashMap<String, Integer> tChars = new HashMap<>();

        fillHashmap(s, sChars);
        fillHashmap(t, tChars);

        if (sChars.equals(tChars)) {
            return true;
        }
        return false; 
    }

    public void fillHashmap(String str, HashMap<String, Integer> map) {
        for (char c : str.toCharArray()) {
            String key = String.valueOf(c);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
    }
}
