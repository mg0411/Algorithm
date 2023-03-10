import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int cnt=0;
		int prevMilk=3;
		for(int i = 0 ; i < arr.length; i++) {
			if(prevMilk==3 && arr[i] == 0) {
				cnt++;
				prevMilk = 0;
				continue;
			}
			else if(prevMilk == 2 && arr[i]==0) {
				cnt++;
				prevMilk = arr[i];
				continue;
			}
			else if(prevMilk == 0 && arr[i]==1) {
				cnt++;
				prevMilk = arr[i];
				continue;
			}
			else if(prevMilk == 1 && arr[i]==2) {
				cnt++;
				prevMilk = arr[i];
				continue;
			}else continue;
			
		}
		System.out.println(cnt);
	}
}
/*
시간제한 1초 이므로 2천만번 아래로 계산해야됨
데이터 개수가 1000개이므로 시간복잡도 O(N^2)까지 가능
 */
