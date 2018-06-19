package _05.order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutExpressions {

	@Pointcut("execution(* _05.order.*.*(..))") // match all methods
	public void forDaoPackage() {

	}
	
	@Pointcut("execution(* _05.order.*.get*(..))") // match getter methods
	public void getter() {

	}
	
	@Pointcut("execution(* _05.order.*.set*(..))") // match getter methods
	public void setter() {

	}
	
	@Pointcut("forDaoPackage() && !(getter() || setter())") // include package ... exclude getter/setter
	public void forDaoPackageNoGetterSetter() {

	}
	
}
