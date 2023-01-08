class Solution {
    public int maxPoints(int[][] points) {
        int maxVerticalPoint = 1;
        for(int[] point1 : points){
            Map<Double, Integer> slopeMap = new HashMap<>();
            double slope = 0;
            for (int[] point2 : points){
                if(point1 == point2){
                    continue;
                }
                if(point1[0] == point2[0]){
                    slope = Double.POSITIVE_INFINITY;
                } else {
                    // Calculating the scope between 2 points with (y2 - y1) / (x2 - x1)
                    slope = (point2[1] - point1[1]) / (double) (point2[0] - point1[0]);
                }
                slopeMap.put(slope, slopeMap.getOrDefault(slope, 1) + 1);
                maxVerticalPoint = Math.max(maxVerticalPoint, slopeMap.get(slope));
            }
        }
        return maxVerticalPoint;
    }
}