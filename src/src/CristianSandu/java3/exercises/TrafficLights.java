package CristianSandu.java3.exercises;

import java.util.ArrayList;
import java.util.List;

public class TrafficLights {

    public static void main(String[] args) {
        List<String> trafficLights = new ArrayList<>();
        trafficLights.add(0, "RED");
        trafficLights.add(1, "Yellow");
        trafficLights.add(2, "Green");
        int i = Integer.parseInt("2"); // Green, error, yellow
        trafficLights.remove(i);
        System.out.println(trafficLights);
    }
}
