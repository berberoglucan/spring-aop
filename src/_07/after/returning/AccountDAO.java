package _07.after.returning;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	private String name;

	private String serviceCode;
	
	public List<Account> findAccounts() {
		List<Account> myAccounts = new ArrayList<>();
		
		Account temp1 = new Account("can", "platinium");
		Account temp2 = new Account("cem", "silver");
		Account temp3 = new Account("ahmet", "gold");
		
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		
		return myAccounts;
	}

	public void addAcount(Account theAccount, boolean vipFlag) {

		System.out.println(getClass() + " DOING MY DB WORK: ADDING AN ACCOUNT WITH ACCOUNT PARAM AND MORE PARAM");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
