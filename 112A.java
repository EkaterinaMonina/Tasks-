import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		s1 = s1.toLowerCase();
		String s2 = scanner.next();
		s2 = s2.toLowerCase();
		int answer = 0;
		for(int i = 0; i < s1.length(); i++)
		{
		    if(s1.charAt(i) > s2.charAt(i))
		    {
		        answer = 1;
		        break;
		    }
		    else if(s1.charAt(i) < s2.charAt(i))
		    {
		        answer = -1;
		        break;
		    }
		}
		System.out.println(answer);
	}
}
