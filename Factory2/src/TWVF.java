public class TWVF implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new TW();
    }
}
