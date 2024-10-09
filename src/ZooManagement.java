import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        int nbrCages ;
        String zooName ;
        Scanner scan = new Scanner(System.in);

        //System.out.println(zooName + " comporte "+ nbrCages+" cages ");
        System.out.println("Enter the number of Cages: ");
        nbrCages = scan.nextInt();

        System.out.println("Enter the name of the zoo: ");
        zooName = scan.next();

        System.out.println(zooName + " comporte "+ nbrCages + " Cages");
    }
}