package _01.before;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	public void addAcount() {
		
		System.out.println(getClass() + " DOING MY DB WORK: ADDING AN ACCOUNT");
		
	}
	
}
