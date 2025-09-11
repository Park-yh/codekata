class Solution {
    public String solution(String s) {
        String[] numbers = s.split(" ");
        
        int min = Integer.parseInt(numbers[0]);
        int max = Integer.parseInt(numbers[0]);
        
        for (int i = 1; i < numbers.length; i++) {
            int currentNum = Integer.parseInt(numbers[i]);

            if (currentNum < min) {
                min = currentNum;
            }
            
            if (currentNum > max) {
                max = currentNum;
            }
        }
        
        return min + " " + max;
    }
}