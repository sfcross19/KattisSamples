import java.util.Scanner;

public class SolutionC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c, d;
		int Case = 1;
		
		Scanner input = new Scanner (System.in);
	while(input.hasNext()) {	
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		
		int determinant = a*d - b*c;
	
		System.out.println("Case " + (Case++) + ":\n" + (d/determinant) + " " + (-b/determinant) + "\n" + (-c/determinant) + " " + (a/determinant));
	}
	}
}
