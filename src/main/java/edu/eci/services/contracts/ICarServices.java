package edu.eci.services.contracts;

import java.util.List;
import java.util.UUID;

import edu.eci.models.Car;


public interface ICarServices {
	List<Car> list();
    Car create(Car car);
    Car get(UUID id);
    Car get(String name);

}
