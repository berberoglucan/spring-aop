package _01.before;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {
	
	 @Before("execution(public void _01.before.AccountDAO.addAcount())")
	// @Before("execution(public void addAcount())") //any class
	//@Before("execution(public void add*())")
	public void beforeAddAccountAdvice() {
		System.out.println("\n====> Executing @Before advice on addAccount()");
	}
	
}
