package task4;


public class Liness {
    private Patient Patient;
    private Doctor Doctor;

    public Liness(Patient Patient, Doctor Doctor) {
        this.Patient = Patient;
        this.Doctor = Doctor;
    }

    public task4.Patient getPatient() {
        return Patient;
    }

    public void setPatient(task4.Patient patient) {
        Patient = patient;
    }

    public task4.Doctor getDoctor() {
        return Doctor;
    }

    public void setDoctor(task4.Doctor doctor) {
        Doctor = doctor;
    }

    public void print() {
        System.out.print("\n" + "Имя пациента: " + Patient.getName() + "\n" + "Номер полиса: " + Patient.getPolis().getNumber() +
                "\n" + "Имя доктора: " + Doctor.getName() + "\n" + "Тип доктора: " + Doctor.getType() + "\n");
    }
}
