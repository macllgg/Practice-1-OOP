package pr1;
import java.util.Scanner;
public class Project2 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int amount = scanner.nextInt();
	        int a = amount+1;
	        int b = amount-1;
	        System.out.println("The next number for the number " + amount +" is " + a);
	        System.out.println("The previous number for the number " + amount +" is " + b);
	    }
}
