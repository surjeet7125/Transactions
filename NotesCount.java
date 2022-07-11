package com.greatlearning.main;

public class NotesCount {

public void notesCountImplementation(int currency[],int amount) { ///50,100,10, amount  = 100 note = 100,50,10
		
		int [] noteCounter = new int[currency.length]; //noteCounter = 3
		
		try {
			for(int i=0;i<currency.length;i++) {  // 3 0,
				
				if(amount >= currency[i])  // amount 100 >= 50,100
				{
					noteCounter[i] = amount / currency[i]; // notCounter[i] = 2 //100/100 = 1
					amount = amount - noteCounter[i]*currency[i]; // 100 - 1* 100 = 0
				}
				
			}
			if(amount>0) {
				
				System.out.println("Denomination value given is higher");
				
			}
			else
			{
				System.out.println("Payment jis above the order");
			}
			
			for(int i=0;i<currency.length;i++) {
				if(noteCounter[i] !=0) {
					System.out.println(currency[i]+ ":" + noteCounter[i]);
				}
			}
			
			
			
			
		}
		catch(Exception ex) {
			System.out.println("Exception " + ex);
		}
		
		
		
	}
}
