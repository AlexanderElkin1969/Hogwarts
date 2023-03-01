public class Hogwarts {
    private String name;
    private int powerOfMagic;
    private  int distanceOfTransgression;

    public Hogwarts(String name, int powerOfMagic, int distanceOfTransgression) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String getName() {
        return name;
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
        return "Ученик Хогвардца : " + name + ", Магическая сила = " + powerOfMagic +
                ", Расстояние трансгрессии = " + distanceOfTransgression;
    }

    public static void compareBetween (Hogwarts one, Hogwarts second) {
        int power1 = one.getPowerOfMagic() + one.getDistanceOfTransgression();
        int power2 = second.getPowerOfMagic() + second.getDistanceOfTransgression();
        if (power1 == power2){
            System.out.println( one.getName() + " и " + second.getName() + " обладают равной мощностью магии.");
        } else if (power1 > power2) {
            System.out.println( one.getName() + " обладает большей мощностью магии, чем "+ second.getName());
        }else {
            System.out.println( one.getName() + " обладает меньшей мощностью магии, чем "+ second.getName());
        }
    }
}
