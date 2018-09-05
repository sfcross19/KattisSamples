import java.util.Scanner;

public class SolutionA {
	
	static int sizeof_int=4;
	static int max = 1000000000;
	
	public static int getLength(int value) {
		int length=sizeof_int*8;
		int res=0;
		for(int i=0;i<length;i++) {
			int tmp;
			res=(tmp = (value & (1<<i)))>0?i+1:res;
			
		}
		return res;
	}
	
	public static int reverseInt(int value,int length) {
		int res=0;
		for(int i=0;i<length;i++) {
			if((value & (1<<i))>0) {
				res |= 1<<((length -1)-i);
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		int number;
		int results;
		
		Scanner input = new Scanner (System.in);
		number = input.nextInt();
		
		if (number < 1 || number > max) {
			System.err.println("Invalid Input");
		}
		else {
			
		results=reverseInt(number,getLength(number));
		System.out.println(results);
		
		}
		
	}
	}



