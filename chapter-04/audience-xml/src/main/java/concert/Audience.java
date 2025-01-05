package concert;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

public class Audience {

    public void performce() {
    }

    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    public void takeSeats() {
        System.out.println("Taking seats");
    }

    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

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