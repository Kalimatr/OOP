package FirtsAndSecondAtt.task1;

public class Liness {
    private Patient Patient;
    private Doctor Doctor;

    public Liness(Patient Patient, Doctor Doctor) {
        this.Patient = Patient;
        this.Doctor = Doctor;
    }

    public Patient getPatient() {
        return Patient;
    }

    public void setName(Patient patient) {
        this.Patient = patient;
    }

    public Doctor getDoctor() {
        return Doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.Doctor = doctor;
    }

    public void print() {
        System.out.println("Имя пациента: " + Patient.getName() + "\n" + "Номер полиса: " + Patient.getMedicalCard().getNumber() +
                "\n" + "Имя доктора: " + Doctor.getName() + "\n" + "Тип доктора: " + Doctor.getType() + "\n");
    }
}
