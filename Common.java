public class Common extends Passanger  {
    public Common(String name,String surname, int age, double balance){
        super(name, surname, age, balance);
    }
    @Override
    public String toString() {
        return "Common: " +  super.getName() + ' ' + super.getSurname() + ' ' + super.getAge() + ' ' + super.getBalance() +' ' +  (getPlace()==0? "Вы не купили билет" : "Ваш билет" + getPlace());
    }

}
