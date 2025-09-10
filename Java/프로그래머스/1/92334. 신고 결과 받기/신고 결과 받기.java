import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, Set<String>> reportedHistory = new HashMap<>();
        Map<String, Integer> mailCount = new LinkedHashMap<>();
        
        for (String id : id_list) {
            mailCount.put(id, 0);
            reportedHistory.put(id, new HashSet<>());
        }
        
        for (String r : report) {
            String[] parts = r.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            
            reportedHistory.get(reported).add(reporter);
        }
        
        for (String reportedUser : reportedHistory.keySet()) {
            Set<String> reporters = reportedHistory.get(reportedUser);
            
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    mailCount.put(reporter, mailCount.get(reporter) + 1);
                }
            }
        }
        
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailCount.get(id_list[i]);
        }
        
        return answer;
    }
}