import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int k=a-i;k>0;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}