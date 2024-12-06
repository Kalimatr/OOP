package FirtsAndSecondAtt.task2;

public class Patient {
    private String Name;
    private int Age;
    private String Gender;
    private MedicalCard medicalCard;

    public Patient(String Name,int Age, String Gender,MedicalCard medicalCard){
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
        this.medicalCard = medicalCard;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }
    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public MedicalCard getMedicalCard() {
        return medicalCard;
    }
    public void setMedicalCard(MedicalCard medicalCard) {
        this.medicalCard = medicalCard;
    }

    public void print(){
        System.out.println("Имя: " + Name +  "\n" + "Возраст: " + Age + "\n" + "Пол: " + Gender );
        medicalCard.print();
    }
}
