import java.util.*;

class Solution {
    
    private int timeToMinutes(String timeStr) {
        String[] parts = timeStr.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    private int calculateFee(int totalTime, int[] fees) {
        int basicTime = fees[0];
        int basicFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];

        if (totalTime <= basicTime) {
            return basicFee;
        }

        int extraTime = totalTime - basicTime;
        
        int extraFee = (int) Math.ceil((double) extraTime / unitTime) * unitFee;
        
        return basicFee + extraFee;
    }

    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> parkingMap = new HashMap<>();
        Map<String, Integer> totalTimeMap = new TreeMap<>();

        for (String record : records) {
            String[] parts = record.split(" ");
            int time = timeToMinutes(parts[0]);
            String carNum = parts[1];
            String action = parts[2];

            if (action.equals("IN")) {
                parkingMap.put(carNum, time);
            } else {
                int inTime = parkingMap.remove(carNum);
                int duration = time - inTime;
                
                totalTimeMap.put(carNum, totalTimeMap.getOrDefault(carNum, 0) + duration);
            }
        }

        int finalExitTime = timeToMinutes("23:59");
        for (String carNum : parkingMap.keySet()) {
            int inTime = parkingMap.get(carNum);
            int duration = finalExitTime - inTime;
            
            totalTimeMap.put(carNum, totalTimeMap.getOrDefault(carNum, 0) + duration);
        }

        int[] answer = new int[totalTimeMap.size()];
        int i = 0;
        for (int totalTime : totalTimeMap.values()) {
            answer[i++] = calculateFee(totalTime, fees);
        }

        return answer;
    }
}