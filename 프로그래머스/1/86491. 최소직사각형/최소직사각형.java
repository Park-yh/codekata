class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            int longSide = Math.max(size[0], size[1]);
            int shortSide = Math.min(size[0], size[1]);

            if (longSide > maxWidth) {
                maxWidth = longSide;
            }

            if (shortSide > maxHeight) {
                maxHeight = shortSide;
            }
        }

        return maxWidth * maxHeight;
    }
}