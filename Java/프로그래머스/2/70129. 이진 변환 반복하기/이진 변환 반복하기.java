class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int conversionCount = 0;
        int removedZerosCount = 0;
        
        while (!s.equals("1")) {
            conversionCount++;
            
            int originalLength = s.length();
            s = s.replace("0", "");
            int newLength = s.length();
            
            removedZerosCount += (originalLength - newLength);
            
            s = Integer.toBinaryString(newLength);
        }
        
        answer[0] = conversionCount;
        answer[1] = removedZerosCount;
        
        return answer;
    }
}