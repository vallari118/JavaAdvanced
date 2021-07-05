package training.DoorsExample;

public class Main {
    public static void main(String[] args) {
        boolean doors[] = new boolean[50];

        //get the status of doors at a particular iteration
//        for (int i = 1; i < doors.length; i++) {
//            for (int j = i; j < doors.length; j += i) {
//                doors[j] = !doors[j];
//            }
//        }

        doors = getOpenDoors(doors);

        for (int i = 1; i < doors.length; i++) {
            if (doors[i]) {
                System.out.println("Door " + i + " is Open");
            }
        }
    }

    private static boolean[] getOpenDoors(boolean[] doors) {

        for(int i=1; i<doors.length; i++){
            int n = getnumberOfFactors(i);
            if(n%2!=0){
                doors[i] = true;
            }
        }
        return doors;
    }

    private static int getnumberOfFactors(int i) {
        int count =0 ;

        for(int j=1; j<=i; ++j){
            if(i%j==0){
                count++;
            }
        }
        return count;
    }

}
