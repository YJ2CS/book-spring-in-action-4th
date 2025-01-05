package soundsystem;

import lombok.Setter;

import java.util.List;

@Setter
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc() {
    }

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.println("Playing " + title + " by " + artist);
        if(trackNumber > 0 && trackNumber <= tracks.size()){
            System.out.println("-Track: " + tracks.get(trackNumber - 1));
        }
    }

}