import java.util.Scanner;


/**
 * @author Varun
 * /*
 * Aim : To sort Array using QuickSort
 * Date : 20-01-2017
 */
 
 
public class QuickSortProgram {

	/**
	 * @param args
	 */
	public int start=0;
	public int end;	
	public int[] quickSortProgram(int arrayInput[],int start,int end){
		
		if(start>=end)
			return arrayInput;
			
		int pivotElements=calculatePivot(arrayInput,start,end);
		arrayInput=quickSortProgram(arrayInput,start,pivotElements-1);
		 arrayInput=quickSortProgram(arrayInput,(pivotElements+1),end);
		return arrayInput;
	}
	
	//this Function calculates Pivot Element
	public int calculatePivot(int arrayInput[],int start,int end)
	{
		 int i = start + 1;
		 int tempVariable;
		 int piv = arrayInput[start] ;            
		  for(int j =start + 1; j <= end ; j++ )  {
		    		if ( arrayInput[ j ] < piv) {
		                tempVariable=arrayInput[i];
		         		arrayInput[i]=arrayInput[j];
		         		arrayInput[j]=tempVariable;
		            i += 1;
		        }
		   }
		   tempVariable=arrayInput[start];
    		arrayInput[start]=arrayInput[i-1];
    		arrayInput[i-1]=tempVariable;
		   return i-1;                      
	}
	
	//This Function Input Element of Array
		public int[] getArrayElement(int arrayInput[],int length)
		{
			
			Scanner scannerObject=new Scanner(System.in);
			System.out.println("Enetr Array Input : ");
			for(int index=0;index<length;index++)
			{
				arrayInput[index]=scannerObject.nextInt();
			}
			return arrayInput;
			
		}
		
		//This Function prints Element of Array
			public void printArrayElement(int arrayInput[])
			{
				for(int index=0;index<arrayInput.length;index++)
				{
					System.out.print(arrayInput[index]+" ");
				}
				System.out.println();
			}
		
			//Main function
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scannerObject=new Scanner(System.in);
			QuickSortProgram object=new QuickSortProgram();
			try{
					System.out.println("Enter Length of Array : ");
					int arrayLength=scannerObject.nextInt();
					int arrayInput[]=new int[arrayLength];
					if(arrayLength>=1){
					arrayInput=object.getArrayElement(arrayInput,arrayLength);			//Input Array Elements
					object.end=arrayInput.length-1;
					object.printArrayElement(arrayInput);
					object.quickSortProgram(arrayInput,0, object.end);
					object.printArrayElement(arrayInput);
				}
			}
			catch(Exception exceptionObject){
				System.out.println("Exception : "+exceptionObject);
			}
			scannerObject.close();
	}

}

