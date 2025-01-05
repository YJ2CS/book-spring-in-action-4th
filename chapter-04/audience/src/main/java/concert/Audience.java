package concert;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    @Pointcut("execution(* concert.Performance.perform(..))")
    public void performce() {
    }

    @Before("performce()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("performce()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("performce()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("performce()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

    @Around("performce()")
    public Object watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("before task");
            Object result = jp.proceed();
            System.out.println("end task!!!");
            return result;
        } catch (Throwable e) {
            System.out.println("throw a exception");
        }
        return null;

    }
}