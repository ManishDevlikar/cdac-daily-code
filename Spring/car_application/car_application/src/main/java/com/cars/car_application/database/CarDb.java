package com.cars.car_application.database;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.cars.car_application.entity.Car;

public class CarDb {

	private static List<Car> carList;
	
	static {
		carList= new ArrayList<>();
		carList.add(new Car(101,"BMW","M8",2001,100000));
		carList.add(new Car(102,"Benz","S-Class",2003,10000));
		carList.add(new Car(103,"Benz","G-Class",2001,100000));
	}
	
	public static Collection<Car> getCars(){
		return carList;
	}
	
	public static Car getCar(int id) {
		 return carList.stream().filter(car->car.getCarId()==id).findFirst().get();
	}
	
	public static void addCar(Car car) {
		carList.add(car);
	}
	
	public static void getCar(int min,int max) {
		
	}
}
