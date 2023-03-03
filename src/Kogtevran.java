public class Kogtevran extends Hogwarts {
    private  static  int size = 0;
    private  int id;
    private  int intellect;
    private  int sapience;
    private  int ingenious;
    private  int creation;


    public Kogtevran(String name, int powerOfMagic, int distanceOfTransgression, int intellect, int sapience, int ingenious, int creation) {
        super(name, powerOfMagic, distanceOfTransgression);
        size ++;
        this.id = size;
        this.intellect = intellect;
        this.sapience = sapience;
        this.ingenious = ingenious;
        this.creation = creation;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getSapience() {
        return sapience;
    }

    public int getIngenious() {
        return ingenious;
    }

    public int getCreation() {
        return creation;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public void setSapience(int sapience) {
        this.sapience = sapience;
    }

    public void setIngenious(int ingenious) {
        this.ingenious = ingenious;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return  id + ". Ученик Когтеврана : " + this.getNAME() +
                ", Магическая сила= " + this.getPowerOfMagic() +
                ", Расстояние трансгрессии= " + this.getDistanceOfTransgression() +
                ", Ум= " + intellect +
                ", Мудрость= " + sapience +
                ", Остроумие= " + ingenious +
                ", Творчество= " + creation;
    }
    public static void compareBetween(Kogtevran one, Kogtevran second) {
        int quality1 = one.getIntellect() + one.getSapience() + one.getIngenious() + one.getCreation();
        int quality2 = second.getIntellect() + second.getSapience() + second.getIngenious() + second.getCreation();
        if (quality1 == quality2){
            System.out.println( one.getNAME() + " и " + second.getNAME() + " оба прекрасные Когтевранцы.");
        } else if (quality1 > quality2) {
            System.out.println( one.getNAME() + " лучший Когтевранец, чем "+ second.getNAME());
        }else {
            System.out.println( second.getNAME() + " лучший Когтевранец, чем " + one.getNAME());
        }
    }
}
