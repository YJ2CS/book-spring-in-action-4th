package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class CompactDiscTest {

    @Autowired
    private CompactDisc cd;

    @Test
    public void play() {
        cd.play();
    }

    @Test
    public void playTrack() {
        cd.playTrack(0);
    }


    @Test
    public void testTrackCounter() {
        cd.playTrack(1);
        cd.playTrack(2);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(7);
        cd.playTrack(7);

        assertEquals("checkPlayCount", 1, TrackCounter.getPlayCount(1));
        assertEquals("checkPlayCount", 1, TrackCounter.getPlayCount(2));
        assertEquals("checkPlayCount", 4, TrackCounter.getPlayCount(3));
        assertEquals("checkPlayCount", 0, TrackCounter.getPlayCount(4));

        assertEquals("checkPlayCount", 0, TrackCounter.getPlayCount(5));
        assertEquals("checkPlayCount", 0, TrackCounter.getPlayCount(6));
        assertEquals("checkPlayCount", 2, TrackCounter.getPlayCount(7));
    }
}