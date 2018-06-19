package _07.after.returning;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		AccountDAO accountDAO = applicationContext.getBean("accountDAO", AccountDAO.class);

		List<Account> accounts = accountDAO.findAccounts();
		
		accounts.forEach(System.out::println);

		applicationContext.close();

	}
}
