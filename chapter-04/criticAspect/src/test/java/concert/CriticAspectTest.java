package concert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class CriticAspectTest {

    @Autowired
    CriticismEngine engine;

    @Test
    public void test() {
        System.out.println("test Context");
    }

    @Test
    public void testCriticismEngine() {
        String criticism = engine.getCriticism();
        System.out.println(criticism);
    }

    @Autowired
    Performance performance;

    /**
     * idea存在一些bug。原理上，应该先使用javac编译所有java代码，然后再使用ajc来编织，
     * 在idea中要实现这个，打开编译器设置，把默认编译器设置为ajc，然后委托给javac
     * 然后在编译的时候不要用maven的编译，改为使用idea的编译快捷键（点击蓝色箭头，或者使用 ctrl + f9）
     *
     * @link <a href="https://stackoverflow.com/questions/73203162/how-to-use-aspectj-lombok-maven-intellij">相关问题</a>
     * @link <a href="https://youtrack.jetbrains.com/issue/IDEA-342000">Idea 的最新进展</a>
     */
    @Test
    public void testPerform() {
        performance.perform();
    }
}