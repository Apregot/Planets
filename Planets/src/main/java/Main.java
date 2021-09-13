import ru.Planet.Planet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input the name of the planet with a capital letter\n");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        switch(input){
            case "Mercury":
                System.out.println(Planet.MERCURY.getStr());
                break;
            case "Venus":
                System.out.println(Planet.VENUS.getStr());
                break;
            case "Earth":
                System.out.println(Planet.EARTH.getStr());
                break;
            case "Mars":
                System.out.println(Planet.MARS.getStr());
                break;
            case "Jupiter":
                System.out.println(Planet.JUPITER.getStr());
                break;
            case "Saturn":
                System.out.println(Planet.SATURN.getStr());
                break;
            case "Uranus":
                System.out.println(Planet.URANUS.getStr());
                break;
            case "Neptune":
                System.out.println(Planet.NEPTUNE.getStr());
                break;
            default:
                System.out.println("There is no such a planet. Try again.");
        }
    }
}
