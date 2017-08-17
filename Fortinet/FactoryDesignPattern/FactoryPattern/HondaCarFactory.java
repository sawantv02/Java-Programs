package FactoryPattern;

public class HondaCarFactory extends CarFactory {

	private String model;
	private int carSpeed;

	public HondaCarFactory(String model, int carSpeed) {
		this.model = model;
		this.carSpeed = carSpeed;
	}

	@Override
	public ICar getCarDetails() {
		return new HondaCar(model, carSpeed);
	}

}
