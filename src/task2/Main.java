package task2;

public class Main {
    public static void main(String[] args) {
        MedicalCard medicalCard = new MedicalCard(112312,"11.11.11");

        Patient pat1 = new Patient("Alice",24,"Women",medicalCard);
        pat1.print();
        Doctor psy = new Psychologist();
        psy.setName("Ali");
        psy.setType("Psychologist");
        psy.setCabinet(357);
        psy.print();
        psy.DoctorSaid();

    }
}