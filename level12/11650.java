import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[][] list = new int[n][2];
		StringTokenizer st;
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			list[i][0] = Integer.parseInt(st.nextToken());
			list[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(list,(e1,e2) ->{
			if(e1[0] == e2[0])
				return e1[1] - e2[1];
			else
				return e1[0] - e2[0];
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			sb.append(list[i][0]+" "+list[i][1]).append('\n');
		}
		bw.write(sb+"\n");
		br.close();
		bw.close();
	}
}