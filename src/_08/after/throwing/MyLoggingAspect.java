package _08.after.throwing;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {
	
	@AfterThrowing(pointcut = "execution(* _08.after.throwing.AccountDAO.findAccounts(..))" , throwing = "exception")
	public void afterReturningFindAccountsAdvice(JoinPoint joinPoint, Throwable exception) { 
		
		String method = joinPoint.getSignature().toShortString();
		
		System.out.println("\n =======> Executing @AfterReturning on method: " + method);
		
		System.out.println("\n =======> The Exception is : " + exception);
	}

	

}
