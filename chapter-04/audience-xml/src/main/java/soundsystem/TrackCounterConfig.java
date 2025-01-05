package soundsystem;


import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.List;

@ComponentScan
@Configuration
@EnableAspectJAutoProxy
@ImportResource("classpath:trackCounterAspect.xml")
public class TrackCounterConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        BlankDisc cd = new BlankDisc();
        cd.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
        cd.setArtist("The Beatles");
        List<String> tracks = new ArrayList<>();
        tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
        tracks.add("With a Little Help from My Friends");
        tracks.add("Lucy in the Sky with Diamonds");
        tracks.add("Getting Better");
        tracks.add("Fixing a Hole");

        // ...other tracks omitted for brevity...
        cd.setTracks(tracks);
        return cd;
    }

//    @Bean
//    public TrackCounterAspect trackCounterAspect() {
//        return new TrackCounterAspect();
//    }
}