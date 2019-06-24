package com.danjerous;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(),temp);

        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Mars", 654);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Jupiter", 875);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Saturn", 625);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptune", 375);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto", 35);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);

        temp.addMoon(tempMoon);

        System.out.println("Planets");

        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }

        HeavenlyBody body = solarSystem.get("Earth");

        System.out.println("Moons of " + body.getName());

        for (HeavenlyBody earthMoon : body.getSatellites()) {
            System.out.println("\t" + earthMoon.getName());
        }
        /// Set union.
        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All moons");
        for (HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getName());
        }

        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);

        planets.add(pluto);

        for (HeavenlyBody planet : planets) {
            System.out.println(planet.getName() + " : " + planet.getOrbitalPeriod());
        }


        Object o = new Object();
        System.out.println(o.equals(o));
        System.out.println("pluto".equals(""));


    }
}
