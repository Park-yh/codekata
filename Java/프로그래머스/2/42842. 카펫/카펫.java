class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for (int yellow_h = 1; yellow_h <= (int)Math.sqrt(yellow); yellow_h++) {
            
            if (yellow % yellow_h == 0) {
                int yellow_w = yellow / yellow_h;
                
                int required_brown = (yellow_w * 2) + (yellow_h * 2) + 4;
                
                if (required_brown == brown) {
                    answer[0] = yellow_w + 2;
                    answer[1] = yellow_h + 2;
                    break;
                }
            }
        }
        
        return answer;
    }
}