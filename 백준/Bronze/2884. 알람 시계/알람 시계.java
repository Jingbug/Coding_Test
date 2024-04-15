import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		if(h > 0) {
			if(m - 45 <= 0) {
				h--;
				m = 60 + (m -45);
				if(m == 60) {
					m = 0;
					h++;
				}
			} else {
				m -= 45;
			}
		} else {
			if(m - 45 <= 0) {
				h = 23;
				m = 60 + (m -45);
				if(m == 60) {
					m = 0;
					h = 0;
				}
			} else {
				m -= 45;
			}
		}
		System.out.println(h + " " + m);
	}
}