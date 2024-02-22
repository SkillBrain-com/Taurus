package kateaManoila.Java3.Exzercses;

import java.util.ArrayList;
import java.util.List;

public class TrafficLights {
    public static void main(String[] args) {
        List<String> trafficLights = new ArrayList<>();
        trafficLights.add(0,"RED");
        trafficLights.add(1,"YELLOW");
        trafficLights.add(2,"GREEN");

        trafficLights.remove(Integer.parseInt("2"));
        System.out.println(trafficLights);
    }
}
