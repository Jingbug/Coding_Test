import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static final double CNT = 20;
    private static final Map<String, Double> map;
    static {
        map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double ssum = 0, gsum = 0;

        for (int i = 0; i < CNT; i++) {
            String[] info = br.readLine().split(" ");
            double score = Double.parseDouble(info[1]);
            String grade = info[2];
            if(!grade.equals("P")) {
                ssum += score;
                gsum += map.get(grade) * score;
            }
        }

        System.out.printf("%.6f", gsum/ssum);
    }
}
