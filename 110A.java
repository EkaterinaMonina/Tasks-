import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int counter = 0;
		for(int i = 0; i < s.length(); i++)
		{
		    if(s.charAt(i) == '4' || s.charAt(i) == '7')
		    {
		        counter ++;
		    }
		}
		int answer = 1;
		if(counter == 0)
		{
		    System.out.println("NO");
		}
		else
		{
		    while(counter > 0)
		    {
		        if(counter % 10 != 7 && counter % 10 != 4)
		        {
		            answer = 0;
		            break;
		        }
		        counter /= 10;
		    }
		    if(answer == 1)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}
	}
}
