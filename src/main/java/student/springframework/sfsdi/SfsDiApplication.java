package student.springframework.sfsdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import student.springframework.sfsdi.controllers.*;

@ComponentScan(basePackages = {"student.springframework.sfsdi","com.springframework.pets"})
@SpringBootApplication
public class SfsDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfsDiApplication.class, args);

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("---------- Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("---------- Property");
		PropertyInjectedController propertyInjectedController
				= (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---------- Setter");
		SetterInjectedController setterInjectedController
				= (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---------- Constructor");
		ConstructorInjectorController constructorInjectorController
				= (ConstructorInjectorController) ctx.getBean("constructorInjectorController");
		System.out.println(constructorInjectorController.getGreeting());

	}

}
