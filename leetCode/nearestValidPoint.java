class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minManhattanDistance = Integer.MAX_VALUE;
        int pointIndex = -1;
        int currentDistance;

        for (int i = 0; i < points.length; i++){
            if(points[i][0] == x){
                currentDistance = Math.abs(y - points[i][1]);
                if(currentDistance < minManhattanDistance){
                    minManhattanDistance = currentDistance;
                    pointIndex = i;
                }
            } else if(points[i][1] == y) {
                currentDistance = Math.abs(x - points[i][0]);
                if (currentDistance < minManhattanDistance) {
                    minManhattanDistance = currentDistance;
                    pointIndex = i;
                }
            }
        }

        return pointIndex;
    }
}