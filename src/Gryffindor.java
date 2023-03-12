public class Gryffindor extends Hogwarts {
    private  static  int size = 0;
    private  int id;
    private  int nobility;
    private  int honor;
    private  int bravery;


    public Gryffindor(String name, int powerOfMagic, int distanceOfTransgression, int nobility, int honor, int bravery) {
        super(name, powerOfMagic, distanceOfTransgression);
        size ++;
        this.id = size;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return  id + ". Ученик Гриффиндора : " + this.getNAME() +
                ", Магическая сила= " + this.getPowerOfMagic() +
                ", Расстояние трансгрессии= " + this.getDistanceOfTransgression() +
                ", Благородство= " + nobility +
                ", Честь= " + honor +
                ", Храбрость= " + bravery;
    }

    private int ability() {
        return (nobility + honor + bravery);
    }

    public void compareBetween (Gryffindor this, Gryffindor other) {
        int quality1 = this.ability();
        int quality2 = other.ability();
        if (quality1 == quality2){
            System.out.println( this.getNAME() + " и " + other.getNAME() + " оба прекрасные Гриффиндорцы.");
        } else if (quality1 > quality2) {
            System.out.println( this.getNAME() + " лучший Гриффиндорец, чем "+ other.getNAME());
        }else {
            System.out.println( other.getNAME() + " лучший Гриффиндорец, чем " + this.getNAME());
        }
    }
}
