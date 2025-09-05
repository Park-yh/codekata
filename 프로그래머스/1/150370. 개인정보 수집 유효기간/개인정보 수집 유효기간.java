import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> expiredList = new ArrayList<>();

        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] parts = term.split(" ");
            termMap.put(parts[0], Integer.parseInt(parts[1]));
        }

        int todayInDays = dateToDays(today);

        for (int i = 0; i < privacies.length; i++) {
            String[] privacyInfo = privacies[i].split(" ");
            String collectionDateStr = privacyInfo[0];
            String termType = privacyInfo[1];

            int collectionDateInDays = dateToDays(collectionDateStr);
            
            int durationInMonths = termMap.get(termType);

            int expirationDateInDays = collectionDateInDays + (durationInMonths * 28);

            if (todayInDays >= expirationDateInDays) {
                expiredList.add(i + 1);
            }
        }

        return expiredList.stream().mapToInt(Integer::intValue).toArray();
    }

    private int dateToDays(String date) {
        String[] parts = date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        return (year * 12 * 28) + (month * 28) + day;
    }
}