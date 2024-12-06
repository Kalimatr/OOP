package task5;


import task5.Exception.InvalidDateException;
import task5.Exception.PatientGoesToWrongDoctor;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        Polis polis = new Polis(11111, LocalDate.of(2005, 11, 11));
        Patient pat1 = new Patient("Alice", "Women", polis, "Психолог");
        Patient pat2 = new Patient("Georg", "Men", new Polis(11232, LocalDate.of(2015, 11, 30)), "Педиатр");
        Patient pat3 = new Patient("Lumin", "Women", new Polis(11232, LocalDate.of(1995, 1, 11)), "Психолог");

        Doctor doc1 = new Psychologist();
        doc1.setType("Психолог");
        doc1.setName("АлЕг");
        doc1.setCabinet(843);

        Liness line = new Liness(pat1, doc1);
        List<Patient> QueueToPsychologist = Arrays.asList(pat1, pat2, pat3);
        for (Patient p : QueueToPsychologist) {
            try {
                Registry.EqualsType(doc1, p);

            } catch (PatientGoesToWrongDoctor e) {
                System.out.println(e.getMessage() + " Имя пациента - " + p.getName());
            }
        }

        try {
            Registry.setValidDateOfBirth(pat1, "2020-11-11");
        } catch (InvalidDateException e) {
            System.out.println("Неверный формат даты. " + e.getMessage());
        }
    }
}