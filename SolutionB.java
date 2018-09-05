import java.lang.reflect.Array;
import java.util.Scanner;

public class SolutionB {
	static int i = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double X1, X2, Y1, Y2, P;
		double [] inputArray = new double[5];
		
		Scanner input = new Scanner(System.in);
		
		
		
		while(true) {
		
		String [] inputStringArray = input.nextLine().split(" ");
		if(inputStringArray.length<5)System.exit(0);
		for(i = 0; i<5; i++) {
			try {
				inputArray[i] = Double.parseDouble(inputStringArray[i]);
			
			}catch (Exception e){
				
				System.exit(0);
			}
		}
		
		X1 = inputArray[0];
		X2 = inputArray[2];
		Y1 = inputArray[1];
		Y2 = inputArray[3];
		P = inputArray[4];
			
		
		
		double results = Math.pow(Math.pow(Math.abs(X1 - X2), P) + Math.pow(Math.abs(Y1 - Y2), P), 1/P);
		System.out.format("%.10f\n", results);
		
	}
	
	}
}
