import java.util.Scanner;
    
public class Task3
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter three non-negative intergers: ");
	int num1 = scanner.nextInt();
	int num2 = scanner.nextInt();
	int num3 = scanner.nextInt();
	
	int max = num1;
	if (num2 > max) {
	    max = num2;
	}
	if (num3 > max) {
	    max = num3;
	}
	
	for (int row = max; row >= 1; row--) {
	    
	    if (num1 >= row) {
	        System.out.print("*");
	    } else {
	        System.out.print(" ");
	    }
	    
	    if (num2 >= row) {
	        System.out.print("*");
	    } else {
	        System.out.print(" ");
	    }
	        
	   if (num3 >= row) {
	        System.out.print("*");
	    } else {
	        System.out.print(" ");
	}
        System.out.println();
    }
    
    scanner.close();
	}
}

