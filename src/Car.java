import java.util.UUID;

public class Car {
    private String id;
    //private String brand;
    private CarBrands brand;
    private int year;
    private int mileage;
    private int price;

    public Car(CarBrands brand, int year, int mileage, int price) {
        this.id = UUID.randomUUID().toString();
        this.setBrand(brand);
        this.setYear(year);
        this.setMileage(mileage);
        this.setPrice(price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", brand=" + brand +
                ", year=" + year +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }

    public String getId() {
        return id;
    }

    public CarBrands getBrand() {
        return brand;
    }

    private void setBrand(CarBrands brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    private void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    private void setPrice(int price) {
        this.price = price;
    }
}
