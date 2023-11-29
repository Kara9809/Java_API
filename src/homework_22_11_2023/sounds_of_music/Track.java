package homework_22_11_2023.sounds_of_music;

import lombok.Getter;

@Getter
public class Track {
    private String name;
    private String bandName;
    private double price;
    private int lengthSeconds;

    public Track() {

    }

    public Track(String name, String bandName, double price, int lengthSeconds) {
        this.name = "Let it be";
        this.bandName = "The Beatles";
        this.price = 18.90;
        this.lengthSeconds = 210;
    }

}
