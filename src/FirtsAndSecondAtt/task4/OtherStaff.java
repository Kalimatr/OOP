package task4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class OtherStaff{
    private String department ;
    private String position;
    private String responsibilities;
    public OtherStaff(String Department,String Position,String Responsibilities) {
        this.department = Department;
        this.position = Position;
        this.responsibilities = Responsibilities;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public String toString() {
        return "\n" + "Департамент: " + department + "\n" + "Отдел: " + position + "\n" + "Обязанности: " + responsibilities;
    }

}
