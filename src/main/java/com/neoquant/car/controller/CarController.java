package com.neoquant.car.controller;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neoquant.car.entity.Car;
import com.neoquant.car.entity.LeaseRateParameters;
import com.neoquant.car.service.CarService;


@RestController
@RequestMapping("/car")
public class CarController {
	private static final LeaseRateParameters car = null;
	@Autowired
	private CarService carService;

	@GetMapping(value="/msg")
	public String getMessage() {
		return "Hello World";
	}
	
	@GetMapping(value = "/allcars")
	public List<LeaseRateParameters> getAllCarsDatails(){
		return carService.getAllCarsDatails();
	}
	@GetMapping(value = "/getcar/{mileage}")
	public LeaseRateParameters getCarByMileage(@PathVariable long mileage){
		return carService.getCarByMileage(mileage);
	}

	@PostMapping(value="/save")
	public List<LeaseRateParameters> saveCar(@RequestBody LeaseRateParameters car){
		carService.saveCar(car);
		return carService.getAllCarsDatails();
	}
	@PutMapping(value = "/updatecar/{mileage}")
	public LeaseRateParameters updateCarDetails(@RequestBody LeaseRateParameters car){
		return car;
	}
	
	@DeleteMapping(value = "/deletecar/{duration}")
	public LeaseRateParameters deleteCarByMileage(@PathVariable int duration){
		return car;
	}
	
	

	@PostMapping(value = "/postleaserate")
	public Car getGetCarLeaseRate(@RequestBody LeaseRateParameters leaserateparameters) {
		return carService.getCarLeaseRate(leaserateparameters);
	}
	
}
