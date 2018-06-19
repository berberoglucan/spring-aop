package _05.order;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AccountDAO accountDAO = applicationContext.getBean("accountDAO", AccountDAO.class);
		
		MembershipDAO membershipDAO = applicationContext.getBean("membershipDAO", MembershipDAO.class);
		
		// call the business method
		Account account = new Account();
		
		accountDAO.addAcount(account, true);
		
		accountDAO.doWork();
		
		// call the AccountDAO getter/setter
		accountDAO.setName("foobar");
		accountDAO.setServiceCode("silver");
		
		accountDAO.getName();
		accountDAO.getServiceCode();
		
		
		// call the membershipDAO business method
		membershipDAO.addSillyMember();
		
		membershipDAO.goToSleep();
		
		applicationContext.close();
		
	}
}
