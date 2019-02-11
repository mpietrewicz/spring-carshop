package pl.kurs;

import org.aspectj.lang.JoinPoint;
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

}
