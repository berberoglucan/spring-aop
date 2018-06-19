package _06.joinpoint;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		AccountDAO accountDAO = applicationContext.getBean("accountDAO", AccountDAO.class);

		// call the business method
		Account account = new Account();
		
		account.setName("can");
		
		account.setLevel("high");

		accountDAO.addAcount(account, true);

		accountDAO.doWork();

		applicationContext.close();

	}
}
