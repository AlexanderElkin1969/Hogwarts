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
    public static void compareBetween(Gryffindor one, Gryffindor second) {
        int quality1 = one.getNobility() + one.getHonor() + one.getBravery();
        int quality2 = second.getNobility() + second.getHonor() + second.getBravery();
        if (quality1 == quality2){
            System.out.println( one.getNAME() + " и " + second.getNAME() + " оба прекрасные Гриффиндорцы.");
        } else if (quality1 > quality2) {
            System.out.println( one.getNAME() + " лучший Гриффиндорец, чем "+ second.getNAME());
        }else {
            System.out.println( second.getNAME() + " лучший Гриффиндорец, чем " + one.getNAME());
        }
    }
}
