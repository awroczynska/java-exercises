import java.util.Scanner;

public class Task2
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int currentNumber = scanner.nextInt();
		int currentCount = 1;
		
		int longestNumber = currentNumber;
		int longestCount = 1;
		
		int nextNumber;
		while ((nextNumber = scanner.nextInt()) != 0) {
		    
		
		if (nextNumber == currentNumber){
		    currentCount++;
		    
	} 
	
	else {
	    
	    if (currentCount > longestCount) {
	        longestCount = currentCount;
	        longestNumber = currentNumber;
	}
	
        currentNumber = nextNumber;
        currentCount = 1;
	    
	}
		}
        
        if (currentCount > longestCount) {
	        longestCount = currentCount;
	        longestNumber = currentNumber;
        }

    System.out.println("Longest sequence: " + longestCount + " times " + longestNumber);
		
		scanner.close();
	}
	
}
