import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
            queue.add(new int[]{i, priorities[i]});
        }

        int executionOrder = 0;

        while (!queue.isEmpty()) {
            int[] currentProcess = queue.poll();
            int currentIndex = currentProcess[0];
            int currentPriority = currentProcess[1];

            if (currentPriority == pq.peek()) {
                executionOrder++;
                pq.poll();

                if (currentIndex == location) {
                    return executionOrder;
                }
            } else {
                queue.add(currentProcess);
            }
        }
        
        return executionOrder;
    }
}