package question3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	
	public static <T> List<T> doTransactions(List<T> list){
		return list;
	}
	
	public static void main(String[] args) {
		Demo d=new Demo();
		
		ArrayList<Integer> at=new ArrayList<>();
		
		CardPayment cd=new CardPayment(8000);
		
		
		at.add(cd.getAmount());
		
		CardPayment cd1=new CardPayment(7000);
		at.add(cd1.getAmount());
		
		System.out.println(d.doTransactions(at));
		
		
     ArrayList<Integer> at1=new ArrayList<>();
		
		CashPayment cp=new CashPayment(6000);
		at1.add(cp.getAmount());
		CashPayment cp1=new CashPayment(9000);
		at1.add(cp1.getAmount());
		 
		
		
		
		
		System.out.println(d.doTransactions(at1));
		
		
		
	}

}
