package task5;


public class Cleaner extends OtherStaff {
    private String name;
    private int experience;


    public Cleaner(String Department, String Position, String Responsibilities, String Name, int Experience) {
        super(Department, Position, Responsibilities);
        this.name = Name;
        this.experience = Experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "\n" + "Имя: " + name + "\n" + "Департамент: " + getDepartment() + "\n" + "Отдел: " + getPosition() + "\n" +
                "Обязанности: " + getResponsibilities() + "\n"+ "Опыт работы (лет):" + experience;
    }
}
