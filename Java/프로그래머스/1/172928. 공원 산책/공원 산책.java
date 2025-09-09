class Solution {
    public int[] solution(String[] park, String[] routes) {
        int H = park.length;
        int W = park[0].length();

        int startRow = -1, startCol = -1;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (park[i].charAt(j) == 'S') {
                    startRow = i;
                    startCol = j;
                    break;
                }
            }
            if (startRow != -1) break;
        }

        int currentRow = startRow;
        int currentCol = startCol;

        for (String route : routes) {
            String[] parts = route.split(" ");
            char direction = parts[0].charAt(0);
            int distance = Integer.parseInt(parts[1]);

            int nextRow = currentRow;
            int nextCol = currentCol;
            boolean isMoveValid = true;

            for (int i = 0; i < distance; i++) {
                switch (direction) {
                    case 'N': nextRow--; break;
                    case 'S': nextRow++; break;
                    case 'W': nextCol--; break;
                    case 'E': nextCol++; break;
                }

                if (nextRow < 0 || nextRow >= H || nextCol < 0 || nextCol >= W) {
                    isMoveValid = false;
                    break;
                }
                if (park[nextRow].charAt(nextCol) == 'X') {
                    isMoveValid = false;
                    break;
                }
            }

            if (isMoveValid) {
                currentRow = nextRow;
                currentCol = nextCol;
            }
        }

        return new int[]{currentRow, currentCol};
    }
}