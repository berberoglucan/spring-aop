package _04.pointcut.combine;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {

	@Pointcut("execution(* _04.pointcut.combine.*.*(..))") // match all methods
	private void forDaoPackage() {

	}
	
	@Pointcut("execution(* _04.pointcut.combine.*.get*(..))") // match getter methods
	private void getter() {

	}
	
	@Pointcut("execution(* _04.pointcut.combine.*.set*(..))") // match getter methods
	private void setter() {

	}
	
	@Pointcut("forDaoPackage() && !(getter() || setter())") // include package ... exclude getter/setter
	private void forDaoPackageNoGetterSetter() {

	}

	@Before("forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n====> Executing @Before advice on method");
	}

	@Before("forDaoPackageNoGetterSetter()")
	public void performApiAnalytics() {
		System.out.println("\n====>	Performing API Analytics");
	}

}
