import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str_nTime = bf.readLine();
		int tTime = Integer.parseInt(bf.readLine());
		
		StringTokenizer st = new StringTokenizer(str_nTime);
		int nh = Integer.parseInt(st.nextToken());
		int nm = Integer.parseInt(st.nextToken());
		
		int result_h = nh;
		int result_m = nm + tTime;
		
		int add_h = result_m/60;
		result_m %= 60;
		result_h += add_h;
		
		while(result_h > 23) {
			result_h -= 24;
		}
		
		bw.write(result_h + " " + result_m);
		bw.flush();
		bw.close();
	}
}
