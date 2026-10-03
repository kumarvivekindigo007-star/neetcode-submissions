class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        if(shortSting(s).equals(shortSting(t))){
            return true;
        }

return false;

    }

    private String shortSting(String a){
        char[] chars = a.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
