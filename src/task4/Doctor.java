package task4;

public abstract class Doctor implements People{
    private String Name;
    private int Age;
    private String Type;
    private int Cabinet;


    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String name) {
        Name = name;
    }

    @Override
    public int getAge() {
        return Age;
    }

    @Override
    public void setAge(int age) {
        Age = age;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getCabinet() {
        return Cabinet;
    }

    public void setCabinet(int cabinet) {
        Cabinet = cabinet;
    }

    @Override
    public String toString() {
        return "Имя врача: " + Name + "\n" + "Вид врача: " + Type + "\n" + "Кабинет: " + Cabinet;
    }

    public abstract void DoctorSaid();

}
