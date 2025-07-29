class Solution {
    public int solution(int n, int m, int[] section) {
        int paintCount = 0;
        int lastPaintedPosition = 0;

        for (int currentSection : section) {
            if (currentSection > lastPaintedPosition) {
                paintCount++;
                
                lastPaintedPosition = currentSection + m - 1;
            }
        }

        return paintCount;
    }
}