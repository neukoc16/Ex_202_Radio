package BL;

public class Sender {

    private String name;
    private double frequency;
    private String band;

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
