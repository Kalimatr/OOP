package FirtsAndSecondAtt.task1;

public class Main {
    public static void main(String[] args) {
        MedicalCard medicalCard = new MedicalCard(112312,"11.11.11");

        Patient pat1 = new Patient("Alice",24,"Women",medicalCard);
        Doctor doc = new Doctor("Piter","pediatrician",365);

        Liness line = new Liness(pat1,doc);
        line.print();

        DayOfReception dayOfReception = new DayOfReception("Albert","Psychologist",367,"Monday");
        dayOfReception.print();
    }
}