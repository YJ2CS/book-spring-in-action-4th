package spittr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spittr.service.SpitterService;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RmiClientConfig.class)
public class SpitterServiceTest {

    @Autowired
    private SpitterService spitterService;

    @Test
    public void getAllSpitters() {
        assertEquals(null, spitterService.getAllSpitters());
    }

}
