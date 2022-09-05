package Question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Mobile {
	
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	
	public String addMobile(String company, String model) {
		
		if(mobiles.containsKey(company)) {
			ArrayList<String> modl=mobiles.get(company);
			modl.add(model);
		}
		else {
			ArrayList<String> modl=new ArrayList<>();
			modl.add(model);
			mobiles.put(company, modl);
		}
		
		return "Mobile added successfully";
	}

	public List<String> getModels(String company){
		return mobiles.get(company);
		
	}

	
	public static void main(String[] args) {
		 Mobile mob=new Mobile();
		Scanner input=new Scanner(System.in);
		System.out.println("add some company");
		while(true) {
			System.out.println("enter comapany name");
			String name=input.next();
			
			System.out.println("Enter moden");
			String model=input.next();
			mob.addMobile(name, model);
			System.out.println("want to add  more Yes?no");
			String yn=input.next();
			if(!yn.equalsIgnoreCase("yes")) {
				break;
			}
			
		}
		System.out.println("which company model want to see which is added");
		String name=input.next();
		
		List<String>mod=mob.getModels(name);
		System.out.println(mod);
		
		
	}


}
