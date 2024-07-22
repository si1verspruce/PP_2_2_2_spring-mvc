package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = List.of(
            new Car("Car1", 111, "Red"),
            new Car("Car2", 222, "Green"),
            new Car("Car3", 333, "Blue"),
            new Car("Car4", 444, "Black"),
            new Car("Car5", 555, "White")
    );

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, Math.max(Math.min(count, cars.size()), 0));
    }
}
