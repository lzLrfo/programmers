import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length / 2;
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums)
            hs.add(i);
        if(hs.size() <= max)
            answer = hs.size();
        else
            answer = max;
        return answer;
    }
}