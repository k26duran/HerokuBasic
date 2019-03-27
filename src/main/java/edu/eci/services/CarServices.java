package edu.eci.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import edu.eci.models.Car;
import edu.eci.persistences.repositories.ICarRepository;
import edu.eci.persistences.repositories.IUserRepository;
import edu.eci.services.contracts.ICarServices;

@Component
public class CarServices implements ICarServices {
	
	 @Autowired
	 @Qualifier("CarMemoryRepository")
	 private ICarRepository carRepository;

	@Override
	public List<Car> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car create(Car car) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car get(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car get(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Car car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Car car) {
		// TODO Auto-generated method stub
		
	}

}
