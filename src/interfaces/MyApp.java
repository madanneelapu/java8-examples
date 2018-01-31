package interfaces;

public class MyApp {

    public static void main(String[] args) {

        CareProvider careProvider = new Dietitian();
        careProvider.writePrescription();


    }

}
