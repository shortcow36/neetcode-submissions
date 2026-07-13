class Solution {
    public boolean isPalindrome(String s) {
        int beg = 0;
        int end = s.length()-1;

        while(beg < end){
            while(beg < end && !Character.isLetterOrDigit(s.charAt(beg))){
                beg++;
            }
            while(end > beg && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(beg)) != 
            Character.toLowerCase(s.charAt(end))){
                return false;
            }
            beg++;
            end--;
        }

        return true;
    }
}
