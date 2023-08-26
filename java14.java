import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		String upper=s.toUpperCase();
		String lower=s.toLowerCase();
		System.out.println(upper);
		System.out.println(lower);
	}
}
