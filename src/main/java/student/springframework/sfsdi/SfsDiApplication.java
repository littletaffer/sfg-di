package student.springframework.sfsdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import student.springframework.sfsdi.config.SfsConfiguration;
import student.springframework.sfsdi.controllers.*;
import student.springframework.sfsdi.datasource.FakeDataSource;
import student.springframework.sfsdi.services.PrototypeBean;
import student.springframework.sfsdi.services.SingletonBean;

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

		System.out.println("---- Bean Scopes --------");
		SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getMyScope());
		SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyScope());

		PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());
		PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyScope());

		System.out.println("---------Fake Data Source---------");
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcUrl());

		System.out.println("---------Config Props Bean---------");
		SfsConfiguration sfsConfiguration = ctx.getBean(SfsConfiguration.class);
		System.out.println(sfsConfiguration.getUsername());
		System.out.println(sfsConfiguration.getPassword());
		System.out.println(sfsConfiguration.getJdbcUrl());

	}

}
