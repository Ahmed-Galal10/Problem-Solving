public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int startVersion = 1;
        int endVersion = n;

        while(startVersion <= endVersion){
            int midVersion = startVersion +  (endVersion - startVersion) / 2;
			boolean checkIsBadVersion = isBadVersion(midVersion);
			
            if(checkIsBadVersion == false){
                startVersion = midVersion + 1;
            }
            else{
                endVersion = midVersion -1;
            }
        }
        return startVersion;
    }
}