import java.util.*;
public class BusFare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=0;
		int totalfare=0;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Number of Kilometers:");
		input = scr.nextInt();
		if((input<=10) && (input>0))
		{
			System.out.println("80");
		}
		else if(input>=11 && input<=20) {
			totalfare = input*6;
			System.out.println(totalfare);
		}
		else if(input>=21 && input<=30) {
			totalfare = input*5;
			System.out.println(totalfare);
		}
		else {
			totalfare = input*4;
			System.out.println(totalfare);
		}
		
	}

}
