package FactoryPattern;

import java.util.Scanner;

public class FactoryPatternDemo {

	public static void main(String args[]) {
		
		CarFactory carFactory=null;
		
		Scanner userInput=new Scanner(System.in);
		
		System.out.println("Enter Your Car Name:(suzuki/honda)");
		
		if(userInput.hasNextLine()){
			
			String carType=userInput.nextLine();
			
			if(carType.equalsIgnoreCase("suzuki"))
				carFactory=new SuzukiCarFactory("9512",45);
			else if(carType.equalsIgnoreCase("honda"))
				carFactory=new HondaCarFactory("3654", 48);
			else
				System.out.println("Enter correct car choice!!!");
		}
		
		if(carFactory!=null){
			ICar mycar=carFactory.getCarDetails();
			System.out.println("Car company name is:"+mycar.getCompanyName());
			System.out.println("Car model is:"+mycar.getModelName());
			System.out.println("Car speed is:"+mycar.getSpeed());
		}
		

	}

}
