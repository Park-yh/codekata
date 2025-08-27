class Solution {
    public String solution(int[] food) {
        StringBuilder arrangement = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int servings = food[i] / 2;
            for (int j = 0; j < servings; j++) {
                arrangement.append(i);
            }
        }
        String firstHalf = arrangement.toString();
        String reversedSecondHalf = arrangement.reverse().toString();
        
        return firstHalf + "0" + reversedSecondHalf;
    }
}