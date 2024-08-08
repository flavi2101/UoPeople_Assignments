package car;
import interfaces.ICarVehicle;
public class Car implements IVehicle, ICarVehicle {
  private String make;
  private String model;
  private int yearOfManufacture;
  private int numberOfDoors;
  private String fuelType;

  public Car(String make, String model, int yearOfManufacture) {
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
  public void setNumberOfDoors(int numberOfDoors) {
      this.numberOfDoors = numberOfDoors;
  }

  @Override
  public int getNumberOfDoors() {
      return numberOfDoors;
  }

  @Override
  public void setFuelType(String fuelType) {
      this.fuelType = fuelType;
  }

  @Override
  public String getFuelType() {
      return fuelType;
  }
}
