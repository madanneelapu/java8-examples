package interfaces;

public interface CareProvider {
    void treatPatient();

    default void writePrescription(){
        System.out.println("Default Prescription");
    }
}
