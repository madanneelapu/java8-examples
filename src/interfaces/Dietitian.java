package interfaces;

public class Dietitian implements CareProvider {
    @Override
    public void treatPatient() {
        System.out.println("Dietitian Counsels the patient and suggest a diet");
    }
}
