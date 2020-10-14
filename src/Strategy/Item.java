package Strategy;

public class Item {

    private String upCode;
    private int price;

    public Item(String upCode, int price){
        this.price = price;
        this.upCode = upCode;
    }


    public String getUpCode() {
        return upCode;
    }


    public int getPrice() {
        return price;
    }
}
