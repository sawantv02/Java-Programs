package FactoryPattern;

public class SuzukiCar implements ICar {

	private String company;
	private String model;
	private int carSpeed;

	public SuzukiCar(String modelName, int speed) {
		this.company = "Suzuki";
		this.model = modelName;
		this.carSpeed = speed;
	}

	public String getCompanyName() {
		return company;
	}

	public void setCompanyName(String companyName) {
		this.company = companyName;
	}

	public String getModelName() {
		return model;
	}

	public void setModelName(String modelName) {
		this.model = modelName;
	}

	public int getSpeed() {
		return carSpeed;
	}

	public void setSpeed(int speed) {
		this.carSpeed = speed;
	}

}
