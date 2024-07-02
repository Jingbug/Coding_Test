import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static int temp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        temp = n;
        
        while(temp != 1) {
            int result = div(temp);
            list.add(result);
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
    public static int div(int n) {
        int num, i = 2;;
        while(true) {
            if(n%i == 0) {
                num = i;
                temp = n/i;
                break;
            }
            i++;
        }
        return num;
    }
}

