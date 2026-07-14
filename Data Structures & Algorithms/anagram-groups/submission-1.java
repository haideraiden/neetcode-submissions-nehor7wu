class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        HashMap<String, List<String>> res = new HashMap<>();
        for(int i = 0 ; i<str.length ; i++)
        {
            String s= str[i];
            char[] chr = s.toCharArray();
            Arrays.sort(chr);
            String sortedchr = new String(chr);
           res.putIfAbsent(sortedchr, new ArrayList<>());
           res.get(sortedchr).add(s);

        }
        return new ArrayList<>(res.values());
        
    }
}
