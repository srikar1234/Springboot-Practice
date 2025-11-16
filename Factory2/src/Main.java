//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TWVF twvf = new TWVF();
        Client vc = new Client(twvf);
        TW tw = (TW) vc.getVehicle();
        tw.displayVehicle();

        FWVF fwvf = new FWVF();
        vc = new Client(fwvf);
        FW fw = (FW) vc.getVehicle();
        fw.displayVehicle();
    }
}