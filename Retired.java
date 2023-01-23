public class Retired extends Passanger  {
    public Retired(String name,String surname, int age, double balance){
        super(name, surname, age, balance);
    }
    @Override
    public void buyTicket(RailwayСarriage a){
        if(getBalance()>=a.getPrice() * 0.7){
            for (int i = 0; i <a.getArr().length ; i++) {
                if(a.getArr()[i] == null){
                    setPlace(i + 1);
                    a.getArr()[i] = this;
                }
            }
            if(getPlace() != 0){
                setBalance(getBalance() - a.getPrice());
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
    @Override
    public String toString() {
        return "Retired: " +  super.getName() + ' ' + super.getSurname() + ' ' + super.getAge() + ' ' + super.getBalance() + (getPlace()==0? "Вы не купили билет" : "Ваш билет" + getPlace());
    }
}

