//Given an array of strings strs, group the anagrams together. You can return the answer in any order.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, List<String>> myMap = new HashMap<>();
       List<List<String>> retList = new LinkedList<>();
       for(int i=0; i<strs.length; i++){
        char[] temp = strs[i].toCharArray();
        Arrays.sort(temp);
        String s = new String(temp);

        if(myMap.containsKey(s)){
            List<String> addToList = myMap.get(s);
            addToList.add(strs[i]);
            myMap.put(s, addToList);
        }
        else{
            List<String> addToList = new LinkedList<>();
            addToList.add(strs[i]);
            myMap.put(s, addToList);
        }
       }

       for(String str : myMap.keySet()){
            retList.add(myMap.get(str));
       }

       return retList;
    }
}
