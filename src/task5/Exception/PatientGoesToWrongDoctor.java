package task5.Exception;

public class PatientGoesToWrongDoctor extends RuntimeException {
    public PatientGoesToWrongDoctor(String message) {
        super(message);
    }
}
