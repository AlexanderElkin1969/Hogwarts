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
    private int ability() {
        return (zeal + loyalty + honesty);
    }

    public void compareBetween (Puffenduy this, Puffenduy other) {
        int quality1 = this.ability();
        int quality2 = other.ability();
        if (quality1 == quality2){
            System.out.println( this.getNAME() + " и " + other.getNAME() + " оба прекрасные Пуффендуйцы.");
        } else if (quality1 > quality2) {
            System.out.println( this.getNAME() + " лучший Пуффендуец, чем "+ other.getNAME());
        }else {
            System.out.println( other.getNAME() + " лучший Пуффендуец, чем " + this.getNAME());
        }
    }
}
