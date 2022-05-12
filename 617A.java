import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int answer = x / 5;
		if(x % 5 != 0)
		{
		    answer ++;
		}
		System.out.println(answer);
	}
}
