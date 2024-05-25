import java.util.Arrays;

class Solution {

    public int[] solution(int[] num_list, int n) {
        
        return Arrays.stream(num_list).limit(n).toArray();
    }
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(Arrays.toString(s.solution(new int[] { 5, 2, 1, 7, 5 }, 3)));
    }
}