package loops;

public class LoopsExample {

	public static void main(String[] args) {
		// do-while
		int x=11;
		do {
			System.out.println("Inside X loop");
			System.out.println(x);
			//x=x+1;
			x++;
		}while(x<=10);
		//while
		int y=11;
		while(y<=10)
		{
			System.out.println("Inside X loop");
			System.out.println(y);
			y++;
		}
		//for
		for(int i=0;i<=10;i=i+2)
		{
			System.out.println(i);
		}
		

	}

}
