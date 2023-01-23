public class Coupe extends RailwayСarriage{
    public Coupe(int price, Passanger arr[], int place){
        super(price, arr, place);
    }

    @Override
    public String toString() {
        return "Coupe: Id " + getId() + " Price " + getPrice();
    }
}
