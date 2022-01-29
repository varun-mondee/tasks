import java.util.*;
public class Customer {
	String cardName="";
	long cardNo=0;
	char cardType;
	double purchaseAmount=0.0;
	double cashBack=0.0;
	
    public Customer(String cardName, long cardNo, char cardType, double purchaseAmmount) {
		
		this.cardName = cardName;
		this.cardNo = cardNo;
		this.cardType = cardType;
		this.purchaseAmount = purchaseAmmount;
	}
    
    void calculate() {
    	if(cardType=='S' ||cardType=='s') {
    		cashBack= 2*(purchaseAmount/100.0);
    	}
    	else if(cardType=='G'||cardType=='g') {
    		cashBack= 5*(purchaseAmount/100.0);
    	}
    	else if(cardType=='P'||cardType=='p'){
    		cashBack= 8*(purchaseAmount/100.0);
    	}
    	else {
    		System.out.println("enter S or G or P...");
    	}
    }
    
	void disp() {
    	System.out.println("cardName"+cardName);
    	System.out.println(cardNo);
    	System.out.println(cardType);
    	System.out.println(purchaseAmount);
    	System.out.println(cashBack);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c = new Customer("Varun Kumar",1234567898,'P',150000.0);
		c.calculate();
		c.disp();	
	}

}
