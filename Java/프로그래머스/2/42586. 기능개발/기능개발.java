import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int remainingProgress = 100 - progresses[i];
            int daysLeft = (int) Math.ceil((double) remainingProgress / speeds[i]);
            queue.add(daysLeft);
        }
        
        List<Integer> resultList = new ArrayList<>();
        
        while (!queue.isEmpty()) {
            int deployDay = queue.poll();
            int deployCount = 1;
            
            while (!queue.isEmpty() && queue.peek() <= deployDay) {
                queue.poll();
                deployCount++;
            }
            
            resultList.add(deployCount);
        }
        
        return resultList.stream().mapToInt(i -> i).toArray();
    }
}