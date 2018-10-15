package BL;

public class Sender {

    private final String name;
    private final double frequency;
    private final String band;

    public Sender(String name, double frequency, String band) {
        this.name = name;
        this.frequency = frequency;
        this.band = band;
    }

    public String getName() {
        return name;
    }

    public String getBand() {
        return band;
    }

    public double getFrequency() {
        return frequency;
    }
}
