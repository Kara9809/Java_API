package homework_22_11_2023.sounds_of_music;

import java.util.ArrayList;
import java.util.List;


public class MusicSupplier {
    ArrayList<Track> tracks = new ArrayList<>();

    public MusicSupplier() {

    }

    public MusicSupplier(List<Track> tracks) {
        this.tracks = (ArrayList<Track>) (ArrayList<Track>) tracks;
    }

    public Track getTrackByName(String name) {
        Object Track;
        return null;
    }

    public List<Track> getAllTracksBelowPrice(double price) {
        return null;
    }

    public List<Track> getAllBandTracks(String bandName) {
        return null;
    }

    public int getTotalTracksLength(String bandName) {
        return 0;
    }
}
