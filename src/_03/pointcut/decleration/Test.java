package _03.pointcut.decleration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AccountDAO accountDAO = applicationContext.getBean("accountDAO", AccountDAO.class);
		
		MembershipDAO membershipDAO = applicationContext.getBean("membershipDAO", MembershipDAO.class);
		
		Account account = new Account();
		
		accountDAO.addAcount(account, true);
		
		accountDAO.doWork();
		
		membershipDAO.addSillyMember();
		
		membershipDAO.goToSleep();
		
		applicationContext.close();
		
	}
}
