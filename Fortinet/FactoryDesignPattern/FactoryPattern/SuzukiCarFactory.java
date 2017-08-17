package FactoryPattern;

public class SuzukiCarFactory extends CarFactory {

	private String model;
	private int carSpeed;

	public SuzukiCarFactory(String model, int carSpeed) {
		this.model = model;
		this.carSpeed = carSpeed;
	}

	@Override
	public ICar getCarDetails() {
		return new SuzukiCar(model, carSpeed);
	}

}
