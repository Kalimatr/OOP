package task4;

public class Cleaner extends OtherStaff implements People {
    private String name;
    private int Age;
    private int experience;


    public Cleaner(String Department, String Position, String Responsibilities, String Name, int Experience) {
        super(Department, Position, Responsibilities);
        this.name = Name;
        this.experience = Experience;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return Age;
    }

    @Override
    public void setAge(int age) {
        Age = age;
    }

    public int getExperience() {return experience;}

    public void setExperience(int experience) {this.experience = experience;}

    @Override
    public String toString() {
        return "\n" + "Имя: " + name + "\n" + "Департамент: " + getDepartment() + "\n" + "Отдел: " + getPosition() + "\n" +
                "Обязанности: " + getResponsibilities() + "\n"+ "Опыт работы (лет):" + experience;
    }
}
