package _03.pointcut.decleration;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAcount(Account theAccount, boolean vipFlag) {

		System.out.println(getClass() + " DOING MY DB WORK: ADDING AN ACCOUNT WITH ACCOUNT PARAM AND MORE PARAM");

	}
	
	public boolean doWork() {
		
		System.out.println(getClass() + "doWork()");
		return false;
		
	}

}
