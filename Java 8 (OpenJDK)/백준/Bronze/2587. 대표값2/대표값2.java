import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        int sum = 0, avg = 0, mid = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        avg = sum / arr.length;
        mid = arr[2];
        
        System.out.println(avg);
        System.out.println(mid);
    }
}
