import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * @author Varun
 * /*
 * Aim : JUnitClasses for All Programs of Phase 3
 * Date : 20-01-2017
 */
 

public class JUnitClassPhase3 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test  //Test Function For GCD Program
	public void testgcdProgram() {
		gcdProgram object=new gcdProgram();
		int testCaseResult1=object.gcdCalculate(18, 12);		//Positive Test Case
		int expectedCaseResult1=6;
		assertEquals(expectedCaseResult1, testCaseResult1);
		
		int testCaseResult2=object.gcdCalculate(100, 3);		//Positive Test Case
		int expectedCaseResult2=1;
		assertEquals(expectedCaseResult2, testCaseResult2);
		
		int testCaseResult3=object.gcdCalculate(-3, -4);		//Negative Test Case
		int expectedCaseResult3=-1;
		assertEquals(expectedCaseResult3, testCaseResult3);
	}
	
	@Test  //Test Function For Remainder Program
	public void testRemainderProgram() {
		RemainderProgram object=new RemainderProgram();
		int testCaseResult1=object.remainder(2, 1);		//Positive Test Case
		int expectedCaseResult1=0;
		assertEquals(expectedCaseResult1, testCaseResult1);
		
		int testCaseResult2=object.remainder(2, 0);		//Negative Test Case
		int expectedCaseResult2=-1;
		assertEquals(expectedCaseResult2, testCaseResult2);
		
		int testCaseResult3=object.remainder(100, 3);		//Negative Test Case
		int expectedCaseResult3=1;
		assertEquals(expectedCaseResult3, testCaseResult3);
	}
	
	@Test  //Test Function For LargetDigit
	public void testLargestDigitProgram() {
		LargestDigit objectTestCase1=new LargestDigit();
		int testCaseResult1=objectTestCase1.largestFunction(2);		//Positive Test Case
		int expectedCaseResult1=2;
		assertEquals(expectedCaseResult1, testCaseResult1);
		
		LargestDigit objectTestCase2=new LargestDigit();
		int testCaseResult2=objectTestCase2.largestFunction(1257389);		//Positive Test Case
		int expectedCaseResult2=9;
		assertEquals(expectedCaseResult2, testCaseResult2);
		
		LargestDigit objectTestCase3=new LargestDigit();
		int testCaseResult3=objectTestCase3.largestFunction(-444);		//Negative Test Case
		int expectedCaseResult3=-1;
		assertEquals(expectedCaseResult3, testCaseResult3);
	}
	
	@Test  //Test Function For LinearSearch
	public void testLinearSearchProgram() {
		LinearSearchProgram objectTestCase1=new LinearSearchProgram();
		int arrayTestCase1[]={2,5,8,9,10, 77, 55};
		int testCaseResult1=objectTestCase1.linearSearchFunction(arrayTestCase1, 88);		//Positive
		int expectedTestCaseResult1=-1;
		assertEquals(expectedTestCaseResult1, testCaseResult1);
		
		LinearSearchProgram objectTestCase2=new LinearSearchProgram();
		int arrayTestCase2[]={2,5,8,9,10, 77, 55,11};
		int testCaseResult2=objectTestCase2.linearSearchFunction(arrayTestCase2, 77);		//Positive
		int expectedTestCaseResult2=6;
		assertEquals(expectedTestCaseResult2, testCaseResult2);
		
	}

	@Test  //Test Function For BinarySearch
	public void testBinarySearchProgram() {
		BinarySearchProgram objectTestCase1=new BinarySearchProgram();
		int arrayTestCase1[]={2,5,8,9,10, 77, 55};
		objectTestCase1.end=arrayTestCase1.length-1;
		int testCaseResult1=objectTestCase1.binarySearchFunction(arrayTestCase1, 88);	//Negative TestCase
		int expectedTestCaseResult1=-1;
		assertEquals(expectedTestCaseResult1, testCaseResult1);
		
		BinarySearchProgram objectTestCase2=new BinarySearchProgram();
		int arrayTestCase2[]={2,5,8,9,10,55,77};
		objectTestCase2.end=arrayTestCase2.length-1;
		int testCaseResult2=objectTestCase2.binarySearchFunction(arrayTestCase2, 77);		//PositiveTestCase
		int expectedTestCaseResult2=7;
		assertEquals(expectedTestCaseResult2, testCaseResult2);
		
	}
	
	@Test  //Test Function For QuickSort
	public void testQuickSortProgram() {
		QuickSortProgram objectTestCase1=new QuickSortProgram();
		int arrayTestCase1[]={2,5,8,9,10,77,55,1};
		objectTestCase1.end=arrayTestCase1.length-1;
		int testCaseResult1[]=objectTestCase1.quickSortProgram(arrayTestCase1,0, objectTestCase1.end);	//Positive TestCase
		int expectedTestCaseResult1[]={1,2,5,8,9,10,55,77};
		assertArrayEquals(expectedTestCaseResult1, testCaseResult1);
		
		QuickSortProgram objectTestCase2=new QuickSortProgram();
		int arrayTestCase2[]={};
		objectTestCase2.end=arrayTestCase2.length-1;
		int testCaseResult2[]=objectTestCase2.quickSortProgram(arrayTestCase2,0, objectTestCase2.end);	//Negative TestCase
		int expectedTestCaseResult2[]={};
		assertArrayEquals(expectedTestCaseResult2, testCaseResult2);
		
	}
}
