public final class Son extends Father{
   private String hobby;

    public Son(ProfessionEnum professionEnum, Appearance appearance, int age, String name, String[] responsobility, String hobby) {
        super(professionEnum, appearance, age, name, responsobility);
        this.hobby = hobby;
    }


    @Override
    void doSmth(String behavior) {
        super.doSmth(behavior);
    }

    public String getHobby() {
        return hobby;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nHobby: " + getHobby();
    }
}
