import java.util.Scanner;

/*
 * Aim : To Linear Search an Element in an Array using recursion Function
 * Date : 21-01-2017
 */
public class LinearSearchProgram {

	/**
	 * @param args
	 */
	//It denotes the Starting Index for Array
	public  int startPosition=0;
	
	//This Recursion Function Search an Element Recursively
	int linearSearchFunction(int arrayParameter[],int element){
		if((startPosition==arrayParameter.length)){
			return -1;
		}
		else
		if(arrayParameter[startPosition]!=element&&(startPosition<arrayParameter.length)){
			startPosition++;
			return linearSearchFunction(arrayParameter, element);
		}
		else
				return (startPosition+1);
	}
	
	//This Function Input Element of Array
	public int[] getArrayElement(int length)
	{
		int arrayInput[]=new int[length];
		Scanner scannerObject=new Scanner(System.in);
		System.out.println("Enetr Array Input : ");
		for(int index=0;index<length;index++)
		{
			arrayInput[index]=scannerObject.nextInt();
		}
		
		return arrayInput;
	}
	
	//This Function prints Element of Array
		public void printArrayElement(int arrayParameter[])
		{
			for(int index=0;index<arrayParameter.length;index++)
			{
				System.out.println(arrayParameter[index]+" ");
			}
		}
		
	//Main Function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scannerObject=new Scanner(System.in);
			LinearSearchProgram object=new LinearSearchProgram();
			try{
				System.out.println("Enter Length of Array : ");
				int arrayLength=scannerObject.nextInt();
				if(arrayLength>=1){
					int arrayInput[]=new int[arrayLength];
					arrayInput=object.getArrayElement(arrayLength);			//Input Array Elements
					System.out.println("Enter Key Element : ");
					int keyElement=scannerObject.nextInt();
					int indexResult=object.linearSearchFunction(arrayInput, keyElement);		// Function Call to Search
					if(indexResult==-1)
						System.out.println("Elemets Not Found ");
					else
						System.out.println("Elements found : "+indexResult);
				}
				else
					System.out.println("Wrong Input : Array Length Should be greater then 0");
			}
			catch(Exception exceptionObject){
				System.out.println("Exception : "+exceptionObject);
			}
			scannerObject.close();
	}

}
