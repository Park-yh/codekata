class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int count = 0;

            while (count < index) {
                currentChar++;
                if (currentChar > 'z') {
                    currentChar = 'a';
                }
                
                if (skip.indexOf(currentChar) == -1) { 
                    count++;
                }
            }
            answer.append(currentChar);
        }

        return answer.toString();
    }
}