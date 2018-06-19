package _02.pointcut.expression;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAcount() {

		System.out.println(getClass() + " DOING MY DB WORK: ADDING AN ACCOUNT");

	}

	public void addAcount(Account theAccount) {

		System.out.println(getClass() + " DOING MY DB WORK: ADDING AN ACCOUNT WITH ACCOUNT PARAM");

	}

	public void addAcount(Account theAccount, boolean vipFlag) {

		System.out.println(getClass() + " DOING MY DB WORK: ADDING AN ACCOUNT WITH ACCOUNT PARAM AND MORE PARAM");

	}

}
