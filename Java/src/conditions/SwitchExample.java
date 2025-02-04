package conditions;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter color");
		String color = ss.next();
		String temp="qawsedrftug6y7i8ojkpw,rl4mkhbgfyuvhdirjek";
		switch (color) {
		case "yellow":
			System.out.println("you got yellow");
			break;
		case "blue":
			System.out.println("you got blue");
			break;
		case "red":
			System.out.println("you got red");
			break;
		case "green":
			System.out.println("you got green");
			break;
		default:
			System.out.println("Not a valid color");

		}
		System.out.println("This completes"+"\n"+" the code you"+"\n"+"can go home");

	}

}
