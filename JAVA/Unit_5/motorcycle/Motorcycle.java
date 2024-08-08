package motorcycle;
import car.IVehicle;
public class Motorcycle implements IVehicle, IMotorVehicle {
  private String make;
  private String model;
  private int yearOfManufacture;
  private int numberOfWheels;
  private String type;

  public Motorcycle(String make, String model, int yearOfManufacture) {
      this.make = make;
      this.model = model;
      this.yearOfManufacture = yearOfManufacture;
  }

  @Override
  public String getMake() {
      return make;
  }

  @Override
  public String getModel() {
      return model;
  }

  @Override
  public int getYearOfManufacture() {
      return yearOfManufacture;
  }

  @Override
  public void setNumberOfWheels(int numberOfWheels) {
      this.numberOfWheels = numberOfWheels;
  }

  @Override
  public int getNumberOfWheels() {
      return numberOfWheels;
  }

  @Override
  public void setMotorcycleType(String type) {
      this.type = type;
  }

  @Override
  public String getMotorcycleType() {
      return type;
  }
}
