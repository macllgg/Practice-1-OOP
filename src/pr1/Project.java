package pr1;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
//		int a = 8, b = 5;
		int c = (a*a)+(b*b);
		
		System.out.println(Math.sqrt(c) + " Значение гипотинузы");
	}

}

