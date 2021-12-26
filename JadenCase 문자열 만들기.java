class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        answer += s.substring(0, 1).toUpperCase();
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i-1) == ' ')
                answer += Character.toString(s.charAt(i)).toUpperCase();
            else
                answer += Character.toString(s.charAt(i));
        }
        return answer;
    }
}