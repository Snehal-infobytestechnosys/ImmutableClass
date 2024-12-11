class Engine{
    int speed;
    Engine(int speed){
        this.speed = speed;
    }
}

public final class EmployeeImmutableObjectExample {

    private  final  int id;
    private final String name;
    private final Engine engine;

    public  int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public EmployeeImmutableObjectExample(int i, String s, Engine e) {
        this.id = i;
        this.name = s;
        this.engine = e;
    }
    public static void main(String[] args) {
        Engine e = new Engine(50);
        EmployeeImmutableObjectExample a = new EmployeeImmutableObjectExample(1, "Snehal",  e);


        System.out.println(a.name == "Snehal");
        System.out.println(a.engine.speed);
        e.speed = 70;



        }
    }
