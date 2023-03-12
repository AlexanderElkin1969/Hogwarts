public class Hogwarts {
    static  int size = 0;
    private  int id;
    private final String NAME;
    private int powerOfMagic;
    private  int distanceOfTransgression;

    public Hogwarts(String name, int powerOfMagic, int distanceOfTransgression) {
        size ++;
        this.id = size;
        this.NAME = name;
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public int getId() {
        return id;
    }

    public String getNAME() {
        return NAME;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }

    @Override
    public String toString() {
        return  id + ". Ученик Хогвардца : " + NAME + ", Магическая сила = " + powerOfMagic +
                ", Расстояние трансгрессии = " + distanceOfTransgression;
    }

    private int ability() {
        return (powerOfMagic + distanceOfTransgression);
    }

    public void compareBetween (Hogwarts this, Hogwarts other) {
        int power1 = this.ability();
        int power2 = other.ability();
        if (power1 == power2){
            System.out.println( this.getNAME() + " и " + other.getNAME() + " обладают равной мощностью магии.");
        } else if (power1 > power2) {
            System.out.println( this.getNAME() + " обладает большей мощностью магии, чем "+ other.getNAME());
        }else {
            System.out.println( this.getNAME() + " обладает меньшей мощностью магии, чем "+ other.getNAME());
        }
    }
}
