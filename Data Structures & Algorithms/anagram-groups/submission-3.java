class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            int [] count= new int[26];

            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            String charArray = Arrays.toString(count);

            res.putIfAbsent(charArray, new ArrayList<>());
            res.get(charArray).add(s);

        }

        return new ArrayList<>(res.values());
    }
}
