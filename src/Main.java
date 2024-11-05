public class Main {
    public static void main(String[] args) {

        Appearance appearance = new Appearance("Зеленые", 185);

       Father father = new Father(ProfessionEnum.DOCTOR, appearance, 45,
               "Владимир", new String[]{"Работать","Помогать жене"});
        System.out.println(father.getInfo());
        father.doSmth("Работает");
        father.haveToDo();

        Appearance appearance1 = new Appearance("Зеленые", 190);

        Son son = new Son(ProfessionEnum.POLICEMAN, appearance1, 20,
                "Сигма", new String[]{"Учиться","Помогать родителям"}, "Играть в футбол");
        System.out.println(son.getInfo());
        son.doSmth("Послушный");
        son.haveToDo();

        Appearance appearance2 = new Appearance("Зеленые", 179);
        Son son1 = new Son(ProfessionEnum.CARPENTER, appearance2, 19 ,
                "Сигма2", new String[] {"Работать", "Чинить мосты"}, "Играть бравл старс");
        System.out.println(son1.getInfo());
        son1.doSmth("Бунтарь");
        son1.haveToDo();
    }
}