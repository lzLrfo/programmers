class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();

        char[] ch = answer.toCharArray();
        answer = "";
        for(char c : ch) {
            if(c >= '0' && c <= '9')
                answer += Character.toString(c);
            else if(c >= 'a' && c <= 'z')
                answer += Character.toString(c);
            else if(c == '-' || c == '_' || c == '.')
                answer += Character.toString(c);
        }

        while(answer.contains(".."))
            answer = answer.replace("..", ".");

        if(answer.length() > 0) {
            while(answer.charAt(0) == '.' || answer.charAt(answer.length() - 1) == '.') {
                if(answer.length() == 1) {
                    answer = "";
                    break;
                }
                if(answer.charAt(0) == '.')
                    answer = answer.substring(1);
                else if(answer.charAt(answer.length() - 1) == '.')
                    answer = answer.substring(0, answer.length() - 1);
            }
        }

        if(answer.length() == 0)
            answer = "a";

        if(answer.length() <= 2) {
            while(answer.length() < 3)
                answer += Character.toString(answer.charAt(answer.length() - 1));
        }

        if(answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if(answer.charAt(answer.length() - 1) == '.')
                answer = answer.substring(0, answer.length() - 1);
        }

        return answer;
    }
}