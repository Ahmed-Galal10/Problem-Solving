class ImplementStrstr {
    public int strStr(String haystack, String needle) {
            return needle.isEmpty() ? 0 : (!haystack.contains(needle) ? -1 : haystack.indexOf(needle));
    }
}