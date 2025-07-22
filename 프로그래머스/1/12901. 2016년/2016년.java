class Solution {
    public String solution(int a, int b) {
        String[] weekDays = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        
        for(int i = 1; i < a; i++){
            totalDays += daysInMonth[i];
        }
        totalDays += b;
        int dayIndex = (totalDays - 1) % 7;
        return weekDays[dayIndex];
    }
}