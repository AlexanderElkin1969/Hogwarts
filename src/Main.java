public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryf = new Gryffindor[10];
        Hogwarts[] students = {
        new Hogwarts("Гарри Потер", 80, 90),
        new Hogwarts("Гермиона Грейнджер", 90, 70),
        new Hogwarts("Рон Уизли", 70, 70),
        new Hogwarts("Драко Малфой", 80, 80),
        new Hogwarts("Седрик Диггори", 90, 80),
        };
        System.out.println("Школа магии и волшебства ХОГВАРДС :");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println();
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i+1; j < students.length; j++) {
                Hogwarts.compareBetween (students[i], students[j]);
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            gryf[i] = choiceDepartment(students[i], 1);          // зачисление Гарри, Гермионы и Рона на факультет Гриффиндор
            System.out.println(gryf[i]);
        }
        System.out.println();
        Gryffindor.compareBetweenGryffindor(gryf[0], gryf[1]);
        Gryffindor.compareBetweenGryffindor(gryf[0], gryf[2]);
        Gryffindor.compareBetweenGryffindor(gryf[1], gryf[2]);
    }
    public static Gryffindor choiceDepartment(Hogwarts student, int dep) {
            return new Gryffindor( student.getNAME(), student.getPowerOfMagic(), student.getDistanceOfTransgression(),
                    (int) (70 + 31*Math.random()), (int) (70 + 31*Math.random()) , (int) (70 + 31*Math.random()));
    }
}