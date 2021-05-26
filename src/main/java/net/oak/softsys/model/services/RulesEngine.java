package net.oak.softsys.model.services; 

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import net.oak.softsys.model.domain.Person;
import net.oak.softsys.model.domain.Product;


public class RulesEngine {

	public static void main(String[] args) {  
		KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
		System.out.println(kc.verify().getMessages().toString());
		runRules(kc);
	}

	public static void runRules(KieContainer kc) { 
		KieSession ksession = kc.newKieSession("ksession-rules");
		
		Person person = new Person("Mary", "Zoe", "Florida", 800); 
		ksession.insert(person);	
		
		Product product = new Product();	    
		product.setProductName("8-1FIXED");
		product.getInterestRate();
		
		ksession.insert(product);
		ksession.fireAllRules();

	}

}
