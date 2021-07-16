package ex7;

public class Thing {
    private String name;
    private int volume;
    private int price;

    public Thing(String name, int volume, int price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", volume=" + volume +
                ", price=" + price;
    }
}
