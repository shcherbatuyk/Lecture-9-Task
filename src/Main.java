import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        carGenerator carGen = new carGenerator();
        System.out.println("My random car: " + carGen.generateCar().toString());

        List<Car> carsList = Arrays.asList(

                new Car(CarBrands.BMW, 2010, 100000, 15000),
                new Car(CarBrands.Toyota, 2000, 140000, 25000),
                new Car(CarBrands.Tesla, 2018, 500000, 50000),
                new Car(CarBrands.Nissan, 2013, 495000, 9200),
                new Car(CarBrands.Audi, 1999, 280000, 4500),
                new Car(CarBrands.BMW, 2000, 198000, 5000),
                new Car(CarBrands.Toyota, 2015, 750000, 12000),
                new Car(CarBrands.Tesla, 2020, 490000, 25000),
                new Car(CarBrands.Nissan, 2022, 39000, 45500),
                new Car(CarBrands.Audi, 2011, 270000, 9000),
                new Car(CarBrands.BMW, 2005, 420000, 6000),
                new Car(CarBrands.Toyota, 2010, 520000, 9000),
                new Car(CarBrands.Tesla, 2015, 189000, 16500)
        );

        System.out.println("Test 3");
        carsList.stream()
                .filter(Car -> Car.getBrand().equals(CarBrands.Tesla) || Car.getBrand().equals(CarBrands.Audi))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("**************");

        carsList.stream()
                .filter(Car -> Car.getYear() > 2018)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("**************");

        carsList.stream()
                .filter(Car -> Car.getMileage() < 40000)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("**************");

        carsList.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("**************");

        Map cheapestCarsMap = carsList.stream()
                .sorted(Comparator.comparing(Car::getPrice))
                .limit(3)
                .collect(Collectors.toMap(Car::getId, Car -> Car));

        Iterator<Map.Entry<String, Integer>> iterator = cheapestCarsMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getValue());
        }
    }
}

