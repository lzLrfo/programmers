class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int day = 0;
        for(int i = 1; i < a; i++) {
            if(i == 4 || i == 6 || i == 9 || i == 11)
                day += 30;
            else if(i == 2)
                day += 29;
            else
                day += 31;
        }
        day += b;
        if(day % 7 == 0)
            answer = "THU";
        else if(day % 7 == 1)
            answer = "FRI";
        else if(day % 7 == 2)
            answer = "SAT";
        else if(day % 7 == 3)
            answer = "SUN";
        else if(day % 7 == 4)
            answer = "MON";
        else if(day % 7 == 5)
            answer = "TUE";
        else if(day % 7 == 6)
            answer = "WED";
        return answer;
    }
}