 public class WagonType1 extends RailwayСarriage{
    public WagonType1(int price, Passanger arr[], int place){
        super(price, arr, place);
    }

    @Override
    public String toString() {
        return "WagonType1: Id " + getId() + " Price " + getPrice();
    }
}
