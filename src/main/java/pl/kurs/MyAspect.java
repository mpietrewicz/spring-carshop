package pl.kurs;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Before("execution(* pl.kurs.Operator.p*(..))")
    public void check(JoinPoint joinPoint) {
        System.out.println("to działa: " +joinPoint.getSignature());
    }

    @Around("execution(* pl.kurs.Operator.prepareData(String,int,double))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        if (args[0] == null) {
            throw new RuntimeException("Make nie może być null!");
        }
        if ((double) args[2] > 1000.0) {
            args[2] = (double) args[2] - 1000.0;
        }

        Object retVal = pjp.proceed(args);
        return retVal;
    }

}
