package _02.pointcut.expression;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAcount() {

		System.out.println(getClass() + " DOING MY DB WORK: ADDING A MEMBERSHIP ACCOUNT");

	}
	
	public void addSillyMember() {

		System.out.println(getClass() + " DOING MY DB WORK: ADDING A MEMBERSHIP SILLY MEMBER");

	}
}
