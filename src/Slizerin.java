public class Slizerin extends Hogwarts {
    private  static  int size = 0;
    private  int id;
    private  int cunning;
    private  int resoluteness;
    private  int ambition;
    private  int resourcefulness;
    private  int desireToDominate;


    public Slizerin(String name, int powerOfMagic, int distanceOfTransgression, int cunning, int resoluteness, int ambition, int resourcefulness, int desireToDominate) {
        super(name, powerOfMagic, distanceOfTransgression);
        size ++;
        this.id = size;
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.desireToDominate = desireToDominate;
    }

    public int getCunning() {
        return cunning;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getDesireToDominate() {
        return desireToDominate;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setDesireToDominate(int desireToDominate) {
        this.desireToDominate = desireToDominate;
    }

    @Override
    public String toString() {
        return  id + ". Ученик Слизерина : " + this.getNAME() +
                ", Магическая сила= " + this.getPowerOfMagic() +
                ", Расстояние трансгрессии= " + this.getDistanceOfTransgression() +
                ", Хитрость= " + cunning +
                ", Решительность= " + resoluteness +
                ", Амбициозность= " + ambition +
                ", Находчивость= " + resourcefulness +
                ", Жажда власти= " + desireToDominate;
    }
    private int ability() {
        return (cunning + resoluteness + ambition + resourcefulness + desireToDominate);
    }

    public void compareBetween (Slizerin this, Slizerin other) {
        int quality1 = this.ability();
        int quality2 = other.ability();
        if (quality1 == quality2){
            System.out.println( this.getNAME() + " и " + other.getNAME() + " оба прекрасные Слизеринцы.");
        } else if (quality1 > quality2) {
            System.out.println( this.getNAME() + " лучший Слизеринец, чем "+ other.getNAME());
        }else {
            System.out.println( other.getNAME() + " лучший Слизеринец, чем " + this.getNAME());
        }
    }
}
