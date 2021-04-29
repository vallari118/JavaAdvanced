package training.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    static Character[] charArray = {'h','e','l','l','o'};
    static Integer[] intArray = {1,2,3,4,5};
    static Boolean[] boolArray = {true, false, false, true};

    //Using object looses Type Safety

    //T is a type variable which has only the local scope (within the method)
    //T is a generic type
    public static <T> List<T> arrayToList(T[] array, List<T> list){
        for(T object : array){
            list.add(object);
        }
    return list;
    }

    public static void main(String args[]){
        List<Character> characterList = arrayToList(charArray, new ArrayList<>());
        //If the Type of Integer is Changed to type String , we won't get any compile time errors

        List<Integer> integerList = arrayToList(intArray, new ArrayList<>());
        System.out.println(integerList.get(0)); //But this line will give error if List type is String - ClassCastException
        //Solution is to create the arrayToList method a generic Method (add <T>)
        // Now if List type is String for integerList it will give the compile time error - incomaptible types
        List<Boolean> booleanList = arrayToList(boolArray, new ArrayList<>());
    }

}
