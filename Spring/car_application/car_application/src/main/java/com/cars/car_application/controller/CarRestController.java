package com.cars.car_application.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cars.car_application.entity.Car;
import com.cars.car_application.service.CarService;


@RestController
public class CarRestController {
	
	private CarService service = new CarService();
	
	@GetMapping("/cars-api")
	public Collection<Car> getCars(){
		return service.getCars();
	}
	
	@GetMapping("/cars-api/{id}") //http://localhost:8080/cars-api/101
	public Car getCar(@PathVariable int id) {
		return service.getCar(id);
	}
	
	@GetMapping("/car")  // http://localhost:8080/car?id=101
		public Car getCarById(@RequestParam int id) {
			return service.getCar(id);
		}
	
	@PostMapping("/cars-api")
	public void addCar(@RequestBody Car car) {
		service.addCar(car);
	}
	
}

