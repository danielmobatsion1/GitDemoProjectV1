
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		String status ="hungry";
		if(status == "hungry") {
			System.out.println("Eat something now!");
		}else { 
			System.out.println("Enjoy");
			//Work hard if you more
		}
		Scanner n = new Scanner(System.in);
		System.out.println("Enter your name please");
		String name = n.nextLine();
		System.out.println("Your name is :"+name);
		
		
	}

}
