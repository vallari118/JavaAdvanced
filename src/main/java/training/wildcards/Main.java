package training.wildcards;

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
        addOfficeToList(buildings);
        //Office is a Subtype of Building
        //But List<Office> is not a Subtype of List<Building> hence gives error


        List<Office> offices = new ArrayList<>();
        buildings.add(new Office());
        buildings.add(new Office());
        printBuildings(offices);
        addOfficeToList(offices);

    }

    private static void build(Building building) {
        System.out.println("Constructing a new "+building.toString());
    }

    //List<? extends Building> --> We can now pass lists of any types that extends Building class
    private static void printBuildings(List<? extends Building> buildings){
        for(Building building : buildings){
            System.out.println(building.toString());
        }
    }
    //List<Office> --> Only takes Office type , not it's superType which is building
    //To Solve this change List<Office> to List<? super Office>
    // We can now pass list of any types which are superTypes for Office
    private static void addOfficeToList(List<? super Office> offices){
        offices.add(new Office());
        System.out.println();
    }
}
