package JavaTraining;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

		private static Map<String, HeavenlyBodies> solarSystem = new HashMap<>();
	    private static Set<HeavenlyBodies> planets = new HashSet<>();

		public static void main(String[] args) 
		{
	        HeavenlyBodies temp = new HeavenlyBodies("Mercury", 88);
	        solarSystem.put(temp.getName(), temp);
	        planets.add(temp);

	        temp = new HeavenlyBodies("Venus", 225);
	        solarSystem.put(temp.getName(), temp);
	        planets.add(temp);

	        temp = new HeavenlyBodies("Earth", 365);
	        solarSystem.put(temp.getName(), temp);
	        planets.add(temp);

	        HeavenlyBodies tempMoon = new HeavenlyBodies("Moon", 27);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        temp.addMoon(tempMoon);

	        temp = new HeavenlyBodies("Mars", 687);
	        solarSystem.put(temp.getName(), temp);
	        planets.add(temp);

	        tempMoon = new HeavenlyBodies("Deimos", 1.3);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        temp.addMoon(tempMoon); // temp is still Mars

	        tempMoon = new HeavenlyBodies("Phobos", 0.3);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        temp.addMoon(tempMoon); // temp is still Mars

	        temp = new HeavenlyBodies("Jupiter", 4332);
	        solarSystem.put(temp.getName(), temp);
	        planets.add(temp);

	        tempMoon = new HeavenlyBodies("Io", 1.8);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        temp.addMoon(tempMoon); // temp is still Jupiter

	        tempMoon = new HeavenlyBodies("Europa", 3.5);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        temp.addMoon(tempMoon); // temp is still Jupiter

	        tempMoon = new HeavenlyBodies("Ganymede", 7.1);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        temp.addMoon(tempMoon); // temp is still Jupiter

	        tempMoon = new HeavenlyBodies("Callisto", 16.7);
	        solarSystem.put(tempMoon.getName(), tempMoon);
	        temp.addMoon(tempMoon); // temp is still Jupiter

	        temp = new HeavenlyBodies("Saturn", 10759);
	        solarSystem.put(temp.getName(), temp);
	        planets.add(temp);

	        temp = new HeavenlyBodies("Uranus", 30660);
	        solarSystem.put(temp.getName(), temp);
	        planets.add(temp);

	        temp = new HeavenlyBodies("Neptune", 165);
	        solarSystem.put(temp.getName(), temp);
	        planets.add(temp);

	        temp = new HeavenlyBodies("Pluto", 248);
	        solarSystem.put(temp.getName(), temp);
	        planets.add(temp);

	        System.out.println("Planets");
	        for(HeavenlyBodies planet : planets) {
	            System.out.println("\t" + planet.getName());
	        }
	        
	        HeavenlyBodies body = solarSystem.get("Mars");
	        System.out.println("Moons of " + body.getName());
	        for(HeavenlyBodies jupiterMoon: body.getSatellites()) {
	            System.out.println("\t" + jupiterMoon.getName());
	        }

	        Set<HeavenlyBodies> moons = new HashSet<>();
	        for(HeavenlyBodies planet : planets) {
	            moons.addAll(planet.getSatellites());
	        }

	        System.out.println("All Moons");
	        for(HeavenlyBodies moon : moons) {
	            System.out.println("\t" + moon.getName());
	        }


		}
}
