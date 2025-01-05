package soundsystem;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

public class TrackCounterAspect {


    public void trackPlayed(int trackNumber) {
    }

    public void countTrack(int trackNumber) {
        // 更新播放次数
        int currentCount = TrackCounter.getPlayCount(trackNumber);
        TrackCounter.trackCounts.put(trackNumber, currentCount + 1);
    }


}