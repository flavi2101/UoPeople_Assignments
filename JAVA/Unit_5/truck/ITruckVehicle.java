package truck;
public interface ITruckVehicle {
  void setCargoCapacity(double capacity); // in tons
  double getCargoCapacity();
  void setTransmissionType(String type); // manual, automatic
  String getTransmissionType();
}
