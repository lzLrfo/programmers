import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = new int[3];
        for(int i = 0; i < answers.length; i++) {
            if(s1[i % s1.length] == answers[i])
                cnt[0]++;
            if(s2[i % s2.length] == answers[i])
                cnt[1]++;
            if(s3[i % s3.length] == answers[i])
                cnt[2]++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Math.max(Math.max(cnt[0], cnt[1]), cnt[2]);
        for(int i = 0; i < 3; i++) {
            if(cnt[i] == max)
                ans.add(i + 1);
        }
        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++)
            answer[i] = ans.get(i);
        return answer;
    }
}