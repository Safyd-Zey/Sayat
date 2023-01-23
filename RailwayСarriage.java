public class RailwayСarriage {
    int id;
    Passanger[] arr;
    int place;
    int price;
    static int id_gen;
    public RailwayСarriage(int place, Passanger arr[], int price){
        this.id=id_gen++;
        this.price=price;
        this.arr = arr;
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public Passanger[] getArr() {
        return arr;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setArr(Passanger[] arr) {
        this.arr = arr;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getPlace() {
        return place;
    }

    public void getPlaces(){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == null){
                System.out.println("Пустое место");
            }
            else {
                System.out.println(arr[i].toString());
            }
        }
    }
}
