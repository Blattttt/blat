import java.util.Scanner;
public class Main {
public static void main(String args[]) {
	
Scanner in = new Scanner(System.in);

System.out.print("Input a: ");

int a = in.nextInt();

double z = Math.cos(a) + Math.sin(a) + Math.cos(3 * a) + Math.sin(3 * a); 
	System.out.printf("z = %f", z);
}
}
