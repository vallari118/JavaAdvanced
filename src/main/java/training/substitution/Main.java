package training.substitution;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]){
        Building building = new Building();
        Office office = new Office(); //Office is a subtype of building
        build(building);
        build(office); //Can send office object bcoz it is a subtype even though build method takes building as an argument

        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Office()); //Can add
        printBuildings(buildings);

        //Office is a Subtype of Building
        //But List<Office> is not a Subtype of List<Building>

//        List<Office> offices = new ArrayList<>();
//        buildings.add(new Office());
//        buildings.add(new Office());
//        printBuildings(offices); // Gives Error


    }

    private static void build(Building building) {
        System.out.println("Constructing a new "+building.toString());
    }

    private static void printBuildings(List<Building> buildings){
        for(Building building : buildings){
            System.out.println(building.toString());
        }
    }
}
