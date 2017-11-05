package org.hello.springcore;


//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	
	public static void main(String[] args) {
	//ApplicationContext context =
	ClassPathXmlApplicationContext context = 

	new ClassPathXmlApplicationContext("SpringConfig.xml");
		  HelloRootUser helloRootUserObj = (HelloRootUser) context.getBean("helloRootUserBean");
		  
		  //helloRootUserObj.greetUser(); 
		  helloRootUserObj.greetUser();
		  //helloRootUserObj.prepareHotDrink();
		  //context.close();
		 }
}


