package day13.codingexercises;
enum TrafficLight {

    RED(30),
    YELLOW(5),
    GREEN(25);

    private int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

public class TrafficLightDemo {

    public static void main(String[] args) {

        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light.name() + " : " + light.getDuration() + " seconds");
        }
    }
}