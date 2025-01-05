package soundsystem;

import java.util.HashMap;
import java.util.Map;

public class TrackCounter {

    private TrackCounter() {
    }

    static final Map<Integer, Integer> trackCounts = new HashMap<>();

    public static int getPlayCount(int trackNumber) {
        return trackCounts.getOrDefault(trackNumber, 0);
    }
}
