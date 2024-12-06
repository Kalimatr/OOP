package task5;



import java.time.LocalDate;


public class Patient {
    private String Name;
    private int Age;
    private String Gender;
    private Polis polis;
    private String goesTo;

    public Patient(String Name, String Gender, Polis polis, String GoesTo) {
        this.Name = Name;
        this.Age = Age(polis);
        this.Gender = Gender;
        this.polis = polis;
        this.goesTo = GoesTo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Polis getPolis() {
        return polis;
    }

    public void setPolis(Polis polis) {
        this.polis = polis;
    }

    public String getGoesTo() {
        return goesTo;
    }

    public void setGoesTo(String goesTo) {
        this.goesTo = goesTo;
    }

    public void setAge(Polis polis) {
        this.Age = Age(polis);
    }

    private int Age(Polis polis) {
        return Math.floorDiv(LocalDate.now().getYear() * 365 + LocalDate.now().getMonthValue() * 30 + LocalDate.now().getDayOfMonth() -
                polis.getDateOfBirth().getYear() * 365 - polis.getDateOfBirth().getMonthValue() * 30 - polis.getDateOfBirth().getDayOfMonth(), 365);
    }

    public String toString() {
        return "\n" + "Имя: " + Name + "\n" + "Возраст: " + Age + "\n" + "Пол: " + Gender + polis.toString() + "\n";
    }
}
