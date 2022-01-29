import java.util.Scanner;

public class Area {
    double area(int base, int height) {
    	return base*height;
    }
    double areaR(int diagonal1 , int diagonal2) {
    	return (0.5)*(diagonal1*diagonal2);
    }
    double area(int t1 , int t2, int h) {
    	return (0.5)*(t1+t2)*h;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=0;
	    int height=0;
	    int diagonal1=0;
	    int diagonal2=0;
	    int ts1=0;
	    int ts2=0;
	    int th =0;
	    
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter base:");
		
		base = scr.nextInt();
		System.out.println("Enter height:");
		height = scr.nextInt();
		System.out.println("Enter diagonal1:");
		diagonal1 = scr.nextInt();
		System.out.println("Enter diagonal2:");
		diagonal2 = scr.nextInt();
		System.out.println("Enter ts1:");
		ts1 = scr.nextInt();
		System.out.println("Enter ts2:");
		ts2 = scr.nextInt();
		System.out.println("Enter th:");
		th = scr.nextInt();
		
		Area ar = new Area();
		
		System.out.println("Area of Parallelogram:"+" "+ar.area(base, height));
		System.out.println("Area of rhombus:"+" "+ar.areaR(diagonal1, diagonal2));
		System.out.println("Area of trapizium:"+" "+ar.area(ts1, ts2,th));
		

	}

}
