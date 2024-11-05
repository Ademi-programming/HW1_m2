public class Grandfather {
    private ProfessionEnum professionEnum;
    private Appearance appearance;

    public ProfessionEnum getProfessionEnum() {
        return professionEnum;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public Grandfather(ProfessionEnum professionEnum, Appearance appearance) {
        this.professionEnum = professionEnum;
        this.appearance = appearance;
    }


  //   public String getInfo() {
     //   return "\nProfession: " + professionEnum +
      //          "\nEyes: " + appearance.getEyes() +
         //       "\nHeight: " + appearance.getHeight();
    }

