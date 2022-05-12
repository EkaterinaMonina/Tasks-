import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String s_lower = s.toLowerCase();
		String s_upper = s.toUpperCase();
		int lower_priority = 0;
		int upper_priority = 0;
		for(int i = 0; i < s.length(); i++)
		{
		    if(s.charAt(i) == s_lower.charAt(i))
		    {
		        lower_priority ++;
		    }
		    if(s.charAt(i) == s_upper.charAt(i))
		    {
		        upper_priority ++;
		    }
		}
		if(upper_priority > lower_priority)
		{
		    System.out.println(s_upper);
		}
		else
		{
		    System.out.println(s_lower);
		}
	}
}
