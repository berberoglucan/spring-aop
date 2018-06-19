package _02.pointcut.expression;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {
	
	 //@Before("execution(public void addAcount())") // match addAccount() method in any class
	
	// @Before("execution(public void updateAccount())") // match updateAccount() method in any class
	// @Before("execution(public void _02.pointcut.expression.AccountDAO.addAcount())") // match only AccountDAO addAccount method
	// @Before("execution(public void add*())") // Match any add* method
	// @Before("execution(* add*())") // match method with any return type 
	// @Before("execution(* add*(_02.pointcut.expression.Account))") // match method with Account param
	// @Before("execution(* add*(_02.pointcut.expression.Account, ..))") // match method with Account param and more params
	
	//@Before("execution(* add*(..))") // match method with any params
	@Before("execution(* _02.pointcut.expression.*.*(..))") // match method in a package
	public void beforeAddAccountAdvice() {
		System.out.println("\n====> Executing @Before advice on method");
	}
	
}
