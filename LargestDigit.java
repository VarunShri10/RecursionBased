import java.util.Scanner;

/*
 * Aim : To find GCD using Recursion
 * Date : 20-01-2017
 */
public class LargestDigit {
	//Class Variable to Hold Maximum Digit
	public int max=0;
	
	//Largest Digit Calculate Function
	public int largestFunction(int number){
		if(number<0)
			return -1;
		if(number==0)
			return max;
		else{
			if((number%10)>max)
				max=number%10;
			return largestFunction(number/10);
		}
	}

	//Main Function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannerObject=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number=scannerObject.nextInt();
		LargestDigit object=new LargestDigit();
		int maxDigit=object.largestFunction(number);
		System.out.println("Digit : "+maxDigit);
		scannerObject.close();
	}

}
