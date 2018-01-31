package interfaces;

public class Nurse implements CareProvider {
    @Override
    public void treatPatient() {
        System.out.println("Nurse takes care of the patient and helps him heal");
    }
}
