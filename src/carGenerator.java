import java.util.Random;

public class carGenerator {

    public Car generateCar() {
        Random random = new Random();

        CarBrands currentBrand;

        switch (random.nextInt(5 - 1)) {
            case (1):
                currentBrand = CarBrands.BMW;
                break;
            case (2):
                currentBrand = CarBrands.Audi;
                break;
            case (3):
                currentBrand = CarBrands.Nissan;
                break;
            case (4):
                currentBrand = CarBrands.Tesla;
                break;
            default:
                currentBrand = CarBrands.Toyota;
        }

        int randYear = random.nextInt(1999, 2022);

        int randMileage = random.nextInt(500, 500000);
        randMileage = randMileage - (randMileage % 1000);

        int randPrice = random.nextInt(15000, 100000);
        randPrice = randPrice - (randPrice % 100);

        Car newCar = new Car(currentBrand, randYear, randMileage, randPrice);

        return newCar;
    }
}
