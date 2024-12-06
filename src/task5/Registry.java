package task5;



import task5.Exception.InvalidDateException;
import task5.Exception.PatientGoesToWrongDoctor;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Registry {

    private static final Pattern DATE_PATTER =
            Pattern.compile("[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|1[0-9]|2[0-9]|3[01])");

    public static void EqualsType(Doctor doctor, Patient patient) {
        if (!(doctor.getType().equals(patient.getGoesTo()))) {
            throw new PatientGoesToWrongDoctor("Пациент попал не к тому врачу!");
        }
        System.out.printf("Пациент %s попал куда надо,%n", patient.getName());
    }

    public static void setValidDateOfBirth(Patient patient, String date) {
        isDataValidDateOfBirth(date);
        patient.getPolis().setDateOfBirth(LocalDate.parse(date));
        patient.setAge(patient.getPolis());

    }

    private static void isDataValidDateOfBirth(String data) {
        if (!DATE_PATTER.matcher(data).matches()) {
            throw new InvalidDateException("Формат даты: YYYY-MM-DD");
        }
    }


}
