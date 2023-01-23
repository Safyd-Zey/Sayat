public class SeatedWagons extends RailwayСarriage{
    public SeatedWagons(int price, Passanger arr[], int place){
        super(price, arr, place);
    }

    @Override
    public String toString() {
        return "Seated Wagons: " + " id "+ getId() + " Price " + getPrice();
    }
}
