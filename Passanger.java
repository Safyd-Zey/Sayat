import java.util.Scanner;
import java.util.SortedMap;


public abstract class Passanger  {
    Scanner sc = new Scanner(System.in);
    private int ID;
    private String surname;
    private int  age;
    private String name;
    static private int IdGen;
    private double balance;
    private int place;
    public Passanger(){
        ID=IdGen++;
    }
    public Passanger(String name,String surname, int age, double balance){
        this.age=age;
        this.surname=surname;
        this.name=name;
        this.balance = balance;
        ID = IdGen++;
    }

    public double getBalance() {
        return balance;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return ID;
    }

    public int getPlace() {
        return place;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    //should add tickets
    public void buyTicket(RailwayСarriage a){
        if(balance>=a.getPrice()){
            for (int i = 0; i <a.getArr().length ; i++) {
                if(a.getArr()[i] == null){
                    a.getArr()[i] = this;
                    place = i + 1;
                    break;
                }
            }
            if(place != 0){
                balance-=a.getPrice();
                System.out.println("Вы купили билет.");//номер вагона и место вагона надо написать
            }
            else {
                System.out.println("Нету свободных мест.");
            }
        }
        else{
            System.out.println("У вас не достаточно средств, либо вы не зарегестрированы.");
        }
    }
    public void refund(RailwayСarriage a){
        if(place == 0){
            System.out.println("У вас нету билета.");
        }
        else {
            balance += a.getPrice()*0.9;//забрали 10%
            a.getArr()[place-1] = null;
            place = 0;
        }
    }
    private boolean checkPlace(RailwayСarriage a){
        if(place == 0){
            return false;
        }
        boolean checker = false;
        for (int i = 0; i < a.getArr().length; i++) {
            if(a.getArr()[i] == null){
                checker = true;
                break;
            }
        }
        return checker;
    }

    private void someTicket(int x, RailwayСarriage a){
        a.getArr()[x-1] = this;
    }

    //после того как он выберет(напишет номер вагона), поменять carriage на этот номер и надо запустит сразу changePlace
    public void changePlace(RailwayСarriage a) {
        boolean checked = checkPlace(a);
        if (checked == false) {
            System.out.println("Вы не купили билет или нету свободных мест в этом вагоне.");
        } else {
            System.out.println("Выберите место: ");
            for (int i = 0; i < a.getArr().length; i++) {
                if (a.getArr()[i] == null) {
                    int q = i + 1;
                    System.out.print(q + " ");
                }
            }
            int somePlace = sc.nextInt();
            a.getArr()[place-1] = null;
            someTicket(somePlace, a);
        }
    }
}
