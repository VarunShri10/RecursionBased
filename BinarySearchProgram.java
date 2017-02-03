import java.util.Scanner;

/*
 * Aim : To Binary Search an Element in an Array using recursion Function
 * Date : 21-01-2017
 */

public class BinarySearchProgram {
	public int start=0;
	public int mid;
	public int end;
	//
	public int binarySearchFunction(int arrayParamter[],int keyElement){
		mid=(start+end)/2;
		if(start>end)
			return -1;
		else
		if(keyElement==arrayParamter[mid])
			return (mid+1);
		else
		if(keyElement>arrayParamter[mid]){
			start=mid+1;
			return binarySearchFunction(arrayParamter, keyElement);
		}
		else{
			end=mid-1;
			return binarySearchFunction(arrayParamter, keyElement);
		}
	}
	
	//This Function Input Element of Array
	public int[] getArrayElement(int length){
		int arrayInput[]=new int[length];
		Scanner scannerObject=new Scanner(System.in);
		System.out.println("Enetr Array Input : ");
		for(int index=0;index<length;index++){
			arrayInput[index]=scannerObject.nextInt();
		}
		return arrayInput;
	}
	
	//To Check Order of Array
	public int checkOrder(int arrayInput[])
	{
		int flagResult=0;
		for(int index=0;index<(arrayInput.length-1);index++){
			if(arrayInput[index]>=arrayInput[index+1]){
				flagResult=1;
				break;
			}
		}
		return flagResult;
	}
	
	
	//This Function prints Element of Array
	public void printArrayElement(int arrayParameter[]){
		for(int index=0;index<arrayParameter.length;index++){
			System.out.println(arrayParameter[index]+" ");
		}
	}
	
	
	//Main Function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannerObject=new Scanner(System.in);
		BinarySearchProgram object=new BinarySearchProgram();
		try{
			System.out.println("Enter Length of Array : ");
			int arrayLength=scannerObject.nextInt();
			object.end=arrayLength-1;								// Assign End Point to Array
			if(arrayLength>=1){
				int arrayInput[]=new int[arrayLength];
				arrayInput=object.getArrayElement(arrayLength);			//Input Array Elements
				int checkOrder=object.checkOrder(arrayInput);			//Check Order of Array
				if(checkOrder==0){
					System.out.println("Enter Key Element : ");
					int keyElement=scannerObject.nextInt();
					int indexResult=object.binarySearchFunction(arrayInput, keyElement);		// Function Call to Search
					if(indexResult==-1)
						System.out.println("Elemets Not Found ");
					else
						System.out.println("Elements found : "+indexResult);
				}
				else
					System.out.println("Array Should be in Ascending Order ");
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
