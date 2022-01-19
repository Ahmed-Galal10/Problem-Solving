class kidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int[] sortedCandies = candies.clone();
        Arrays.sort(sortedCandies);
        int greatestCandies = sortedCandies[sortedCandies.length - 1];
        
        List<Boolean> iskidsHaveGreatestCandiesList = new ArrayList<>();
        
        for(int i = 0; i < candies.length; i++){
            boolean iskidsHaveGreatestCandies = (candies[i] + extraCandies) >= greatestCandies;
            iskidsHaveGreatestCandiesList.add(iskidsHaveGreatestCandies);
        }
        
        return iskidsHaveGreatestCandiesList;
    }
}