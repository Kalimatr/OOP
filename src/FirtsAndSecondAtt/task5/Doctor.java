package task5;


public abstract class Doctor {
    private String Name;
    private String Type;
    private int Cabinet;

    @Override
    public String toString() {
        return "Имя врача: " + Name + "\n" + "Вид врача: " + Type + "\n" + "Кабинет: " + Cabinet;
    }

    public int getCabinet() {
        return Cabinet;
    }

    public void setCabinet(int cabinet) {
        Cabinet = cabinet;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public abstract void DoctorSaid();
}
