package student.springframework.sfsdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import student.springframework.sfsdi.controllers.MyController;

@SpringBootApplication
public class SfsDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfsDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
