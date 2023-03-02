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

    public static void compareBetween (Hogwarts one, Hogwarts second) {
        int power1 = one.getPowerOfMagic() + one.getDistanceOfTransgression();
        int power2 = second.getPowerOfMagic() + second.getDistanceOfTransgression();
        if (power1 == power2){
            System.out.println( one.getNAME() + " и " + second.getNAME() + " обладают равной мощностью магии.");
        } else if (power1 > power2) {
            System.out.println( one.getNAME() + " обладает большей мощностью магии, чем "+ second.getNAME());
        }else {
            System.out.println( one.getNAME() + " обладает меньшей мощностью магии, чем "+ second.getNAME());
        }
    }
}
