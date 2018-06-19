package _09.after;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		AccountDAO accountDAO = applicationContext.getBean("accountDAO", AccountDAO.class);

		List<Account> accounts = null;

		try {
			// boolean tripWare = true;
			boolean tripWare = false;
			accounts = accountDAO.findAccounts(tripWare);
		} catch (Exception e) {
			System.out.println("\n\nMain program ... caught exception : " + e);
		}

		accounts.forEach(System.out::println);

		applicationContext.close();

	}
}
