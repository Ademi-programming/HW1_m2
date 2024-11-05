import java.util.Arrays;

public class Father extends Grandfather {
    private String name;
    private int age;
    private String[] responsobility;

    public Father(ProfessionEnum professionEnum, Appearance appearance, int age , String name,
                  String[] responsobility) {
        super(professionEnum, appearance);
        this.age = age;
        this.name = name;
        this.responsobility = responsobility;
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public String[] getResponsobility() {
        return responsobility;
    }

    void doSmth (String act) {
        System.out.println(act);
    }

    final void haveToDo() {
        System.out.println("Слушаться папу");
    }

    public String getInfo() {
        return
                "\nName: " + name +
                "\nAge: " + age +
                "\nResponsobility: " + Arrays.toString(responsobility);
    }
}
