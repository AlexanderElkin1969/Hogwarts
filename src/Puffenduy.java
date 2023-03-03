public class Puffenduy extends Hogwarts {
    private  static  int size = 0;
    private  int id;
    private  int zeal;
    private  int loyalty;
    private  int honesty;


    public Puffenduy(String name, int powerOfMagic, int distanceOfTransgression, int zeal, int loyalty, int honesty) {
        super(name, powerOfMagic, distanceOfTransgression);
        size ++;
        this.id = size;
        this.zeal = zeal;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getZeal() {
        return zeal;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setZeal(int zeal) {
        this.zeal = zeal;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return  id + ". Ученик Пуффендуй : " + this.getNAME() +
                ", Магическая сила= " + this.getPowerOfMagic() +
                ", Расстояние трансгрессии= " + this.getDistanceOfTransgression() +
                ", Трудолюбие= " + zeal +
                ", Верность= " + loyalty +
                ", Чесность= " + honesty;
    }
    public static void compareBetween(Puffenduy one, Puffenduy second) {
        int quality1 = one.getZeal() + one.getLoyalty() + one.getHonesty();
        int quality2 = second.getZeal() + second.getLoyalty() + second.getHonesty();
        if (quality1 == quality2){
            System.out.println( one.getNAME() + " и " + second.getNAME() + " оба прекрасные Пуффендуйцы.");
        } else if (quality1 > quality2) {
            System.out.println( one.getNAME() + " лучший Пуффендуец, чем "+ second.getNAME());
        }else {
            System.out.println( second.getNAME() + " лучший Пуффендуец, чем " + one.getNAME());
        }
    }
}
