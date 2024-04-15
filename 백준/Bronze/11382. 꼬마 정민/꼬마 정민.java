import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		Long sum = (long) 0;
		String[] list = str.split(" ");
		for(int i = 0; i<list.length; i++) {
			sum += Long.parseLong(list[i]);
		}
		System.out.println(sum);
	}
}
