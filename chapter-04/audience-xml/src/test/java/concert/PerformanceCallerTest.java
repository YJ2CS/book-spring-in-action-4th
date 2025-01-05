package concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class PerformanceCallerTest {

    @Autowired
    Performance performance;

    @Test
    public void startPerformance() {
        performance.perform();
    }

    @Test
    public void testEncoreableIntroduced() {

        // 确保 Performance 现在是 Encoreable 的代理类
        assertTrue("Performance should now implement Encoreable", performance instanceof Encoreable);

        // 调用 Encoreable 的方法
        Encoreable encoreable = (Encoreable) performance;
        encoreable.performEncore();  // 期望输出 "Performing encore..."

    }
}