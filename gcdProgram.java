import java.util.Scanner;

/*
 * Aim : To find GCD using Recursion
 * Date : 20-01-2017
 */
public class gcdProgram {

	//GCD Recursion Function
	public int gcdCalculate(int firstNumber,int secondNumber){
		if(firstNumber<=0||secondNumber<0)
			return -1;
		if(secondNumber<=0)
			return firstNumber;
		else
		if(firstNumber<secondNumber)
			return gcdCalculate(secondNumber,firstNumber);
		else
			return gcdCalculate(secondNumber, (firstNumber%secondNumber));
		}
	
	//Main Function
	public static void main(String[] args) {
		Scanner scannerObject=new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int firstNumber=scannerObject.nextInt();
		System.out.println("Enter Second Number : ");
		int secondNumber=scannerObject.nextInt();
		gcdProgram object=new gcdProgram();
		int resultGCD=object.gcdCalculate(firstNumber, secondNumber);
		if(resultGCD==-1)
			System.out.println("Invalid Input :  Number Should be greater than 0");
		else
			System.out.println("Output : "+resultGCD);
		scannerObject.close();
	}
}
