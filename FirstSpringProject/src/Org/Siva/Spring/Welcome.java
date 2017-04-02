package Org.Siva.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Welcome {
	
	/*String welcomeMessage;
	
	public void setWelcomeMessage(String message){
		this.welcomeMessage = message;
	}
	
	public void greetMessage(){
		System.out.println(welcomeMessage);
	}*/
	
	DIinterface dii;
	
	Welcome(DIinterface dii){
		this.dii = dii;
	}
	
	public void displayMessage(){
		dii.passvalues();
	}
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Welcome welcomeobj = (Welcome) context.getBean("welcomeBean");
		welcomeobj.displayMessage();
	}
}
