package _06.joinpoint;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	private String name;

	private String serviceCode;

	public void addAcount(Account theAccount, boolean vipFlag) {

		System.out.println(getClass() + " DOING MY DB WORK: ADDING AN ACCOUNT WITH ACCOUNT PARAM AND MORE PARAM");

	}

	public boolean doWork() {
		return false;
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
