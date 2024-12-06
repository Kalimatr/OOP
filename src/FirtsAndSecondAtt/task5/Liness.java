package task5;


public class Liness {
    private Patient Patient;
    private Doctor Doctor;

    public Liness(Patient Patient, Doctor Doctor) {
        this.Patient = Patient;
        this.Doctor = Doctor;
    }

    public task5.Patient getPatient() {
        return Patient;
    }

    public void setPatient(task5.Patient patient) {
        Patient = patient;
    }

    public task5.Doctor getDoctor() {
        return Doctor;
    }

    public void setDoctor(task5.Doctor doctor) {
        Doctor = doctor;
    }

    @Override
    public String toString() {
        return "\n" + "Имя пациента: " + Patient.getName() + "\n" + "Номер полиса: " + Patient.getPolis().getNumber() +
                "\n" + "Имя доктора: " + Doctor.getName() + "\n" + "Тип доктора: " + Doctor.getType() + "\n";
    }
}
