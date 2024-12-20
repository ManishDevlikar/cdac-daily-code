package com.cars.car_application.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.cars.car_application.entity.Car;
import com.cars.car_application.repository.CarRepository;

@Service
public class CarService {
	private CarRepository repository = new CarRepository();
	
	public Collection<Car> getCars(){
		return repository.getCars();
	}
	
	public Car getCar(int id) {
		return repository.getCar(id);
	}
	
	public void addCar(Car car) {
		repository.addCar(car);
	}
}
