package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("model1", "maker1", 100));
        cars.add(new Car("model2", "maker2", 110));
        cars.add(new Car("model3", "maker3", 120));
        cars.add(new Car("model4", "maker4", 130));
        cars.add(new Car("model5", "maker5", 140));
    }

    public static List<Car> showCars(int count) {
        if (count > 0 && count < 5) {
                return cars.stream().limit(count).toList();
        } else {
            return cars;
        }
    }
}
