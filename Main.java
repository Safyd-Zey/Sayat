import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void printData(Iterable<Passanger>iterable){
        iterable.forEach((passanger) -> System.out.println(passanger.toString()) );
    }
    public static void  main(String[] args) throws FileNotFoundException {
        Passanger[] arr = new Passanger[60];
        RailwayСarriage hello = new Coupe(500, arr, 60);
        String name, surname;
        int age;
        double balance;
        File myfile = new File("src/Objects.txt");
        Scanner sc = new Scanner(myfile);
        int i = 0;
        while (sc.hasNextLine()) {
            name = sc.next();
            surname = sc.next();
            age = sc.nextInt();
            balance = sc.nextDouble();
            if (age > 0 && age < 5) {
                Passanger p = new Child(name, surname, age, balance);
                arr[i] = p;
            } else if (age > 62 && age < 100) {
                Passanger p = new Retired(name, surname, age, balance);
                arr[i] = p;
            } else{
                Passanger p =new Common(name,surname,age,balance);
                arr[i] = p;
            }
            
            arr[i].buyTicket(hello);
            i++;
        }

        /*RailwayСarriage hello = new Coupe(500, arr, 80);
        Passanger Madi = new Common("Madyar", "Zhanzhigitov", 18, 10000);
        Passanger Ali = new Common("Ali", "Abdulla", 20, 1000);
        Madi.buyTicket(hello);
        Ali.buyTicket(hello);
        hello.getPlaces();
        Ali.changePlace(hello)
        hello.getPlaces();
         */
    }
}