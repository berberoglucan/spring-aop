package _03.pointcut.decleration;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public void addSillyMember() {

		System.out.println(getClass() + " DOING MY DB WORK: ADDING A MEMBERSHIP SILLY MEMBER");

	}
	
	public void goToSleep() {
		
		System.out.println(getClass() + " sleeping now");
		
	}
}
