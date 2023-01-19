class Solution {
    public String toLowerCase(String s) {
        // return s.toLowerCase();
        // or
        StringBuilder resultStr = new StringBuilder();
        for(int i=0; i < s.length(); i++)
        {
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                resultStr.append((char)(s.charAt(i) + 32));
            } else {
                resultStr.append(s.charAt(i));
            }
        }
        return resultStr.toString();  
    }
}