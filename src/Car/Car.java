package Car;

public class Car {
    private String id;
    private String name;

    private float price;

    public Car(String id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car [id=" + id + ", name=" + name+", price=" + price + "]";
    }


    public int compareTo(Car o) {
        return this.id.compareTo(o.id);
    }

}