import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder(new String(chars));
        sb.reverse();
        return sb.toString();
    }
}