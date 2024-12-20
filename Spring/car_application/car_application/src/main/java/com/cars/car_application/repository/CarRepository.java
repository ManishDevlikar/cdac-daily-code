package com.cars.car_application.repository;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.cars.car_application.database.CarDb;
import com.cars.car_application.entity.Car;

@Repository
public class CarRepository {
	public Collection<Car> getCars(){
		return CarDb.getCars();
	}
	
	public Car getCar(int id) {
		return CarDb.getCar(id);
	}
	
	public void addCar(Car car) {
		 CarDb.addCar(car);
	}
}
