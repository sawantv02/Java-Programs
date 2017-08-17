package FactoryPattern;

public class HondaCar implements ICar {

	private String company;
	private String model;
	private int carSpeed;

	public HondaCar(String model, int carSpeed) {
		this.company = "Honda";
		this.model = model;
		this.carSpeed = carSpeed;
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
