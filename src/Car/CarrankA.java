package Car;

public class CarrankA extends  Car  {
    private  String rank;
private  String datemanufacture ;
    public CarrankA(String id, String name, float price , String rank ,String datemanufacture ) {
        super(id, name, price);
        this.rank = rank;
        this.datemanufacture = datemanufacture;
    }

    public String getRank() {
        return rank;
    }

    public String getDatemanufacture() {
        return datemanufacture;
    }

    public void setDatemanufacture(String datemanufacture) {
        this.datemanufacture = datemanufacture;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    @Override
    public String toString() {
        return "Car [id=" + this.getId() + ", name=" + this.getName()+", price=" + this.getPrice() + ", rank=" + rank +", datemanufacture=" + datemanufacture+"]";
    }

}
