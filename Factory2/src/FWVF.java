public class FWVF implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new FW();
    }
}
