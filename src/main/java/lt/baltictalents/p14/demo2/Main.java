package lt.baltictalents.p14.demo2;

import static lt.baltictalents.p14.demo2.Planet.EARTH;

public class Main {

    public static void main(String[] args) {

        double earthWeight = 100;

        double mass = earthWeight/EARTH.surfaceGravity();

        for (Planet p : Planet.values()) {
            System.out.println("Your weight on " + p + " is " + p.surfaceWeight(mass) + "kg");
        }
    }
}
