package concert;

import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements Performance {

    @Override
    public void perform() {
        System.out.println("concert.Performance.perform()");
    }
}
