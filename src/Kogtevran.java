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
    private int ability() {
        return (intellect + sapience + ingenious + creation);
    }

    public void compareBetween (Kogtevran this, Kogtevran other) {
        int quality1 = this.ability();
        int quality2 = other.ability();
        if (quality1 == quality2){
            System.out.println( this.getNAME() + " и " + other.getNAME() + " оба прекрасные Когтевранцы.");
        } else if (quality1 > quality2) {
            System.out.println( this.getNAME() + " лучший Когтевранец, чем "+ other.getNAME());
        }else {
            System.out.println( other.getNAME() + " лучший Когтевранец, чем " + this.getNAME());
        }
    }
}
