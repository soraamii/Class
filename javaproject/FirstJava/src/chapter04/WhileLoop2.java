package chapter04;

public class WhileLoop2 {

	public static void main(String[] args) {
		
		int num = 1;
		
		while(num < 10) {
			
			int n = 2;
			
			while(n < 10) {
				System.out.print(n + " X " + num + " = " + n*num + "\t");
				
				n++;
				
			}
			
			//System.out.println("2 X " + num + " = " + num*2);
			
			//System.out.print("2 X " + num + " = " + num*2 );
			//System.out.print("\t 3 X " + num + " = " + num*3 );
			//System.out.print("\t 4 X " + num + " = " + num*4 );
			//System.out.print("\t 9 X " + num + " = " + num*9 );
			
			System.out.println();
			
			num++;
			
		}
		

	}

}
