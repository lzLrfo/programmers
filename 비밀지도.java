class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] dec = new int[n];
        for(int i = 0; i < n; i++)
            dec[i] = arr1[i] | arr2[i];
        String[] bin = new String[n];
        for(int i = 0; i < n; i++) {
            bin[i] = "";
            String s = Integer.toBinaryString(dec[i]);
            if(s.length() < n)
                bin[i] += "0".repeat(n - s.length()) + s;
            else
                bin[i] = s;
        }
        for(int i = 0; i < n; i++) {
            answer[i] = "";
            for(int j = 0; j < n; j++) {
                if(bin[i].charAt(j) == '1')
                    answer[i] += "#";
                else
                    answer[i] += " ";
            }
        }
        return answer;
    }
}