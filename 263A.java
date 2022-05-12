import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int input;
		for(int i = 0; i < 5; ++i)
		{
		    for(int j = 0; j < 5; ++j)
		    {
		        input = scanner.nextInt();
		        if(input == 1)
		        {
		            x = j;
		            y = i;
		        }
		    }
		}
		x -= 2;
		if(x < 0)
		{
		    x *= -1;
		}
		y -= 2;
		if(y < 0)
		{
		    y *= -1;
		}
		System.out.println(x + y);
	}
}
