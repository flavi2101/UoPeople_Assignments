package motorcycle;
public interface IMotorVehicle {
  void setNumberOfWheels(int numberOfWheels);
  int getNumberOfWheels();
  void setMotorcycleType(String type); // sport, cruiser, off-road
  String getMotorcycleType();
}
