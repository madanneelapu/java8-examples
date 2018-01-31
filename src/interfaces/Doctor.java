package interfaces;

public class Doctor implements CareProvider {
    @Override
    public void treatPatient() {
        System.out.println("Doctor Diagnoses the patient's Health Condition and Prescribes Medicines");
    }

    @Override
    public void writePrescription() {
        System.out.println("Doctor writes prescription");
    }
}

