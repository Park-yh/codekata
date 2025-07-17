class Solution {
    public String solution(String[] seoul) {
        int kimIndex = -1;
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                kimIndex = i;
                break;
            }
        }
        return "김서방은 " + kimIndex + "에 있다";
    }
}