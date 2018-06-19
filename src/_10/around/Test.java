package _10.around;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		TrafficFortuneService trafficFortuneService = applicationContext.getBean("trafficFortuneService", TrafficFortuneService.class);
		
		System.out.println("\nMy fortune is : " + trafficFortuneService.getFortune());

		applicationContext.close();

	}
}
