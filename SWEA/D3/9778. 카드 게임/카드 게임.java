import java.util.Scanner;

class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int[] cardCount = new int[12];

            for (int v = 2; v <= 9; v++) {
                cardCount[v] = 4;
            }
            cardCount[10] = 16;
            cardCount[11] = 4;

            int N = sc.nextInt(); // 이미 뽑은 카드 수
            int sum = 0;

            // 이미 뽑은 카드 반영
            for (int i = 0; i < N; i++) {
                int value = sc.nextInt();
                sum += value;
                cardCount[value]--;   // 해당 카드 한 장 소모
            }

            int bust = 0;   // 21을 초과하게 만드는 카드 개수
            int safe = 0;   // 21 이하여서 괜찮은 카드 개수

            // 남은 카드들에 대해 계산
            for (int v = 2; v <= 11; v++) {
                int count = cardCount[v];
                if (count == 0) continue;

                if (sum + v > 21) {
                    bust += count;
                } else {
                    safe += count;
                }
            }
            String answer = (bust >= safe) ? "STOP" : "GAZUA";
            System.out.println("#" + test_case + " " + answer);
        }
    }
}