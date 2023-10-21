package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO{

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Bentley", "Blue", 200));
        cars.add(new Car("Porsche", "Black", 300));
        cars.add(new Car("BMW", "White", 250));
        cars.add(new Car("Mercedes", "Green", 210));
        cars.add(new Car("VAZ", "Gold", 1000));
    }



    @Override
    public List<Car> getCar(int count) {
        return cars.stream().limit(count).toList();
    }
}
