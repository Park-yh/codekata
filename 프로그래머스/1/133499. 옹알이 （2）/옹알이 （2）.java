class Solution {
    public int solution(String[] babbling) {
        int count = 0;
        String[] possibleWords = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            if (word.contains("ayaaya") || word.contains("yeye") || word.contains("woowoo") || word.contains("mama")) {
                continue;
            }

            for (String pWord : possibleWords) {
                word = word.replace(pWord, " ");
            }

            word = word.replace(" ", "");
            if (word.length() == 0) {
                count++;
            }
        }
        return count;
    }
}