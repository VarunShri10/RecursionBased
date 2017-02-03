/*
 * Aim : To find remainder using Recursion
 * Date : 20-01-2017
 */
import java.util.Scanner;


public class RemainderProgram {

	//To calculate Remainder ( Recursion Function )
	public int remainder(int firstNumber,int secondNumber){
		if(secondNumber==0)
			return -1;
		if(firstNumber<secondNumber)
			return firstNumber;
		else
			return	remainder((firstNumber-secondNumber),secondNumber);		// Recursion Call
	}
	
	//Main Function
	public static void main(String[] args) {
		
			Scanner scannerObject=new Scanner(System.in);
			System.out.println("Enter First Number : ");
			int firstNumber=scannerObject.nextInt();
			System.out.println("Enter Second Number : ");
			int secondNumber=scannerObject.nextInt();
			RemainderProgram object=new RemainderProgram();
			int resultRemainder=object.remainder(firstNumber, secondNumber);
			if(resultRemainder==-1)
				System.out.println("Invalid Input : Second Number Should be greater than 0");
			else
				System.out.println("Output : "+resultRemainder);
			scannerObject.close();
		
	}
}
