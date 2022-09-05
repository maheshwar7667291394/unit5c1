package Question1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
	
	public Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){
//		TreeMap<Employee,String> tm=new TreeMap<>(originalMap);	
		
		
		
		return originalMap;
	}
	
	public static void main(String[] args) {
		
		HashMap<Employee, String> hm=new HashMap<>();
		hm.put(new Employee(1,"mahesh",2000), "bihar");
		hm.put(new Employee(4,"hesh",3000), "patna");
		hm.put(new Employee(2,"mkumar",5000), "up");
		hm.put(new Employee(3,"moniuka",1000), "laknow");
		hm.put(new Employee(5,"anu",5000), "bihar");
		
		Demo demo=new Demo();

		
		 Map<Employee, String> sm=demo.sortMapUsingEmployeeSalary(hm);
		 System.out.println(sm);
		
   
	
	}
}
