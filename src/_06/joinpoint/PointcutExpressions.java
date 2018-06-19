package _06.joinpoint;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutExpressions {

	@Pointcut("execution(* _06.joinpoint.*.*(..))") // match all methods
	public void forDaoPackage() {

	}
	
	@Pointcut("execution(* _06.joinpoint.*.get*(..))") // match getter methods
	public void getter() {

	}
	
	@Pointcut("execution(* _06.joinpoint.*.set*(..))") // match getter methods
	public void setter() {

	}
	
	@Pointcut("forDaoPackage() && !(getter() || setter())") // include package ... exclude getter/setter
	public void forDaoPackageNoGetterSetter() {

	}
	
}
