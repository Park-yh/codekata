import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int matchCount = 0;

        for (int lottoNum : lottos) {
            if (lottoNum == 0) {
                zeroCount++;
            } else {
                for (int winNum : win_nums) {
                    if (lottoNum == winNum) {
                        matchCount++;
                        break;
                    }
                }
            }
        }

        int maxMatch = matchCount + zeroCount;
        int minMatch = matchCount;

        int maxRank = getRank(maxMatch);
        int minRank = getRank(minMatch);

        return new int[]{maxRank, minRank};
    }

    public int getRank(int matchCount) {
        switch (matchCount) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}