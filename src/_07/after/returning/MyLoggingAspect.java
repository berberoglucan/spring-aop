package _07.after.returning;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {
	
	@AfterReturning(pointcut = "execution(* _07.after.returning.AccountDAO.findAccounts(..))" , returning = "result" )
	public void afterReturningFindAccountsAdvice(JoinPoint joinPoint, List<Account> result) { 
		
		String method = joinPoint.getSignature().toShortString();
		
		System.out.println("\n =======> Executing @AfterReturning on method: " + method);
		
		System.out.println("\n =======> result is : " + result);
		
		// modify the data
		convertAccountNamesToUpperCase(result);
		
		System.out.println("\n =======> after modifying result is : " + result);
	}

	private void convertAccountNamesToUpperCase(List<Account> result) {
		
		for (Account account : result) {
			String accountName = account.getName().toUpperCase();
			account.setName(accountName);
		}
		
	}

}
