import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int grade = Integer.parseInt(bf.readLine());
		
		if(100 >= grade && grade >= 90) bw.write("A");
		else if (89 >= grade && grade >= 80) bw.write("B");
		else if (79 >= grade && grade >= 70) bw.write("C");
		else if (69 >= grade && grade >= 60) bw.write("D");
		else bw.write("F");
		
		bw.flush();
		bw.close();
	}
}
