package task1;

public class DayOfReception extends Doctor {

    private String DayOfReception;

    public DayOfReception(String name,String type,int cabinet, String DayOfReception){
        super(name,type,cabinet);
        this.DayOfReception = DayOfReception;
    }

    public String getDayOfReception(){return DayOfReception;};
    public void setDayOfReception(String dayOfReception){this.DayOfReception = dayOfReception;};

    @Override
    public void print(){System.out.println("Имя врача: " + super.getName() + "\n" +
            "Вид врача: " + super.getType() + "\n" + "Кабинет: " + super.getCabinet() + "\n" + "День приема: " + DayOfReception);}

}
