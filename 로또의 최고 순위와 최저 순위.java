class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int right = 0;
        for(int i = 0; i < 6; i++)
            if(lottos[i] == 0)
                zero++;
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                if(win_nums[i] == lottos[j])
                    right++;
            }
        }
        answer[0] = rate(zero + right);
        answer[1] = rate(right);
        return answer;
    }
    private int rate(int n) {
        if(n == 6)
            return 1;
        else if(n == 5)
            return 2;
        else if(n == 4)
            return 3;
        else if(n == 3)
            return 4;
        else if(n == 2)
            return 5;
        else
            return 6;
    }
}