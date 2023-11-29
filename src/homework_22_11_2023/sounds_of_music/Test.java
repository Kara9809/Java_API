package homework_22_11_2023.sounds_of_music;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        MusicSupplier musicSupplier = new MusicSupplier();
        Track track = musicSupplier.getTrackByName("Let it be");
        List<Track> allBandTracks = musicSupplier.getAllBandTracks("The Beatles");
        int length = musicSupplier.getTotalTracksLength("Queen");
        List<Track> allTracksBelowPrice = musicSupplier.getAllTracksBelowPrice(300);
    }
}
