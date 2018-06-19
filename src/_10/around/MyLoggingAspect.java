package _10.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {
	
	// around -> run before and after method
	
	@Around("execution(*  _10.around.TrafficFortuneService.getFortune(..))")
	public Object aroundGetFortune(ProceedingJoinPoint joinPoint) throws Throwable {
		
		String method = joinPoint.getSignature().toShortString();
		
		System.out.println("\n=======> Executing @Around on method: " + method);
		
		long begin = System.currentTimeMillis();
		
		Object result = joinPoint.proceed();
		
		long end = System.currentTimeMillis();
		
		System.out.println("duration : " + (end - begin));
		
		return result;
	}
}
