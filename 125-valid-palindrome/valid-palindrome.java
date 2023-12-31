class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb= new StringBuilder("");
        // making the given string to the lowe case
        String lowerCase=s.toLowerCase();
        // remove all the spaces  in the String
        for (char ch:lowerCase.toCharArray()){
            if (Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        String alphaNumeric=sb.toString();
        // reversing the sb array
        String reverse= new StringBuilder(alphaNumeric).reverse().toString();
        return alphaNumeric.equals(reverse);
    }
}