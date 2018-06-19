package _06.joinpoint;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyLoggingAspect {

	@Before("_06.joinpoint.PointcutExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		System.out.println("\n====> Executing @Before advice on method");
		
		// display the method signature
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		
		System.out.println("Method : " + methodSignature);
		
		// display method arguments
		
		Object[] args = joinPoint.getArgs();
		
		for (Object object : args) {
			System.out.println(object);
			if(object instanceof Account) {
				Account account = (Account) object;
				System.out.println("account name: " + account.getName());
				System.out.println("account name: " + account.getLevel());
			}
		}
	}

}
