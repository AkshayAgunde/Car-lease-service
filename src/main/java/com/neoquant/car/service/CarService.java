package com.neoquant.car.service;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.neoquant.car.entity.Car;
import com.neoquant.car.entity.LeaseRateParameters;


@Service
public class CarService {
	public static List<LeaseRateParameters> cars = new ArrayList<LeaseRateParameters>();
	
//		public CarService() {
//		cars.add(new LeaseRateParameters(30000,23,4.5f,788778));
//			cars.add(new LeaseRateParameters(35000,10,7.5f,89000));
//			cars.add(new LeaseRateParameters(40000,12,3.5f,65000));
//			cars.add(new LeaseRateParameters(45000,15,3.2f,75000));
//	//		cars.add(new LeaseRateParameters(50000,17,4.5f,100000));
	//	}
		public List<LeaseRateParameters> getAllCarsDatails(){
			return cars;
		}
	
		public LeaseRateParameters getCarByMileage(long mileage) {
			LeaseRateParameters carInfo = null;
			for (LeaseRateParameters car : cars) {
				if(car.getMileage()==mileage) {
					carInfo = car;
					break;
				}
			}
			return carInfo;
		}
	
		public boolean saveCar(LeaseRateParameters car) {
			boolean result = cars.add(car);
			return result;
		}
	
		public LeaseRateParameters updateCarDetails(long mileage, LeaseRateParameters car) {
			LeaseRateParameters carInfo = null;
		for (LeaseRateParameters cars : cars) {
				if(car.getMileage()==mileage) {
					carInfo = cars;
					break;
				}
			}
			return carInfo;
		}
	
		public LeaseRateParameters deleteCarByMileage(int duration) {
			LeaseRateParameters carInfo = null;
		for (LeaseRateParameters car : cars) {
				if(car.getDuration()==duration) {
					carInfo = car;
					break;
				}
			}
			return carInfo;
		}
		
		public double nettPrice( long mileage,int duration,float interestRate ,double nettPrice) {
				double leaseRate = (((mileage/12)*duration)/nettPrice) + (((interestRate/100)*nettPrice)/12);
			return leaseRate;
		}
	
	public static List<Car> carInfoList = new ArrayList<Car>();
	public CarService() {
		carInfoList.add(new Car(1,"Suzuki-2021","Isuzu","V1.0","20",8000.00,63000.00,""));
		carInfoList.add(new Car(2,"Suzuki-2022","Isuzu","V2.0","20",9000.00,73000.00,""));
		carInfoList.add(new Car(3,"Suzuki-2023","Isuzu","V3.0","20",7000.00,83000.00,""));
		carInfoList.add(new Car(4,"Suzuki-2024","Isuzu","V4.0","20",6000.00,93000.00,""));
	}
	private String getCarLeaseRate(long mileage,int duration,float interestRate,double nettPrice) {
		String pattern = "###,###.##";
		double leaseRate = (((mileage/12)*duration)/nettPrice) + (((interestRate/100)*nettPrice)/12);
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		String format = decimalFormat.format(leaseRate);
		return format;
	}
	public Car getCarLeaseRate(LeaseRateParameters leaseRequestParam) {
		Car car = null;
		car = getCarById(leaseRequestParam.getCarId());
		System.out.println("####CAR BEFORE LEASE RATE CAL ######");
		System.out.println(car.toString());
		if(car!=null) {
			String leaseRate = getCarLeaseRate(leaseRequestParam.getMileage(),leaseRequestParam.getDuration(),leaseRequestParam.getInterestRate(),car.getNetPrice());
			car.setLeaseRate(leaseRate);
		}
		System.out.println("####CAR AFTER LEASE RATE CAL ######");
		System.out.println(car.toString());
		return car;
	}
	public Car getCarById(long id) {
		Car carInfo = null;
		for (Car car : carInfoList) {
			if(car.getId()==id) {
				carInfo = car;
				break;
			}
		}
		return carInfo;
	}
}
