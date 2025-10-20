class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        String[] strings = Integer.toString(x).split("");
        for (String string : strings) {
            sum += Integer.parseInt(string);
        }
        if (x % sum == 0) answer = true;
        return answer;
    }
}