
public class CarRental {
	static int total=0;
	static double charges = 0;
	static void calculateCharges(int hr, int carno){
		
		total = total + hr;
		
		double rent = 0.0;
		int temp = hr;
		int val = 0;
			
		while(true) {
			
		if(hr <= 8) {
			rent = 25.0;
			break;
		}
		else if(hr > 8 && hr <= 24) {
			
			rent = rent + 50 + (temp * 0.5);	//50-->12x5
			break;
		}
		else {
			
			val = hr - 24;
			rent += 50;
		}
		
			hr = val;
			
		}
		charges = charges + rent;	
		System.out.println(carno+ "\t" +temp+ "\t" +(rent));	
			
	}
	public static void main(String[] args) {
		
		
		
		System.out.println("carno\t" + "hours\t" + "charge");
		
		calculateCharges(12,1);
		calculateCharges(34,2);
		calculateCharges(48,3);
		
		System.out.println("total\t"+total+"\t"+charges);
		
	}					
	}


