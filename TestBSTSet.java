
package testbstset;

/**
 *
 * @author TYD
 */

public class TestBSTSet {
	public static void main(String[] args) {
		
		int[] d1 = {1, 3, 2,4};
		int[] d2 = {5, 6, 5, 1, 2, 2, 4, 0, 20, 32, 3, 17};
		int[] d3 = {17, 2, 29, 18, 30};
		int[] d4 = {7, 1, 10, 12, 19, 21};
		int[] d5 = {21, 11, 17, 30};
		System.out.println("Test1---constructor1" );
                BSTSet a1 = new BSTSet();
		a1.printBSTSet();
		System.out.println("\n");
		 
		System.out.println("Test2---constructor2---normal case" );
		BSTSet a2 = new BSTSet(d1);
		a2.printBSTSet();
		System.out.println("\n");
		
		System.out.println("Test3---constructor2---with repetitions" );
		BSTSet a3 = new BSTSet(d2);
		a3.printBSTSet();
		System.out.println("\n");
		
		System.out.println("Test4---isIn(1)---yes" );
		System.out.println(a3.isIn(1));
                
		System.out.println("\n");
		
		System.out.println("Test5---isIn(3)---no" );
		System.out.println(a3.isIn(3));
                 //a3.printBSTSet();
		System.out.println("\n");
               
		
		System.out.println("Test6---add(2)---with repetitions" );
		BSTSet a4 = new BSTSet(d3);
		a4.printBSTSet();
		a4.add(2);
		a4.printBSTSet();
		System.out.println("\n");
		
		System.out.println("Test7---add(3)---without repetitions" );
		a4.add(3);
		a4.printBSTSet();
		System.out.println("\n");
			
		
		System.out.println("Test9---remove(2)" );
		System.out.println(a3.remove(2));
		a3.printBSTSet();
		System.out.println("\n");
                

		
		System.out.println("Test10---remove(6)" );
		System.out.println(a3.remove(6));
		a3.printBSTSet();
		System.out.println("\n");
		
		System.out.println("Test11---remove(30)" );
		System.out.println(a3.remove(30));
		System.out.println("\n");
		
		System.out.println("Test12---union()" );
		BSTSet a9 = new BSTSet(d4);
		BSTSet a10 = new BSTSet(d5);
		BSTSet a8 = a10.union(a9);
		a8.printBSTSet();
		System.out.println("\n");
		
		
		System.out.println("Test13---union()" );
		//a1.printBSTSet();
		//a9.printBSTSet();
		BSTSet a5 = a9.union(a1);
		a5.printBSTSet();
		System.out.println("\n");
		
		System.out.println("Test14---intersection()" );
		//a9.printBSTSet();
		//a10.printBSTSet();
		BSTSet a6 = a9.intersection(a10);
		a6.printBSTSet();
		System.out.println("\n");
		
		System.out.println("Test15---intersection()-with empty set" );
		//a1.printBSTSet();
		//a10.printBSTSet();
		BSTSet a7 = a10.intersection(a1);
		a7.printBSTSet();
		System.out.println("\n");
		
		System.out.println("Test16---size()" );
		System.out.println(a5.size());
		
		System.out.println("Test17---size()---empty" );
		System.out.println(a1.size());
			
	/**/	
	}

}

