package FirtsAndSecondAtt.task2;

public abstract class  Doctor {
    private String Name;
    private String Type;
    private int Cabinet;


    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }
    public void setType(String Type) {
        this.Type = Type;
    }

    public int getCabinet() {
        return Cabinet;
    }
    public void setCabinet(int Cabinet) {
        this.Cabinet = Cabinet;
    }

    public void print(){
        System.out.println("Имя врача: " + Name +  "\n" + "Вид врача: " + Type + "\n" + "Кабинет: " + Cabinet + "\n");
    }
    public abstract void DoctorSaid();


}
