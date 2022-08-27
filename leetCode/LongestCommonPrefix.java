class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstString = strs[0];
        String lastString = strs[strs.length-1];
        int targetIndex = 0;

        while (targetIndex < firstString.length()){
            if (firstString.charAt(targetIndex) == lastString.charAt(targetIndex)){
                targetIndex++;
            } else {
                break;
            }
        }

        return targetIndex != 0 ? firstString.substring(0, targetIndex) : "";
    }
}