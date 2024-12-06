package FirtsAndSecondAtt.task2;

public class MedicalCard {
    private int Number;
    private String DateOfBirth;

    public MedicalCard(int Number, String DateOfBirth){
        this.Number = Number;
        this.DateOfBirth = DateOfBirth;
    }
    public int getNumber() {
        return Number;
    }
    public void setNumber(int Number) {
        this.Number = Number;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public void print(){
        System.out.println("Номер карты: " + Number +  "\n" + "Дата рождения: " + DateOfBirth + "\n");
    }
}
