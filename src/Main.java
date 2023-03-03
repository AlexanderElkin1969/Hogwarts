public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryf = new Gryffindor[5];
        Puffenduy[] puff = new Puffenduy[5];
        Hogwarts[] students = {
            new Hogwarts("Гарри Потер", 80, 90),
            new Hogwarts("Гермиона Грейнджер", 90, 70),
            new Hogwarts("Рон Уизли", 70, 70),
            new Hogwarts("Захария Смит", 80, 80),
            new Hogwarts("Седрик Диггори", 90, 80),
            new Hogwarts("Джастин Финч-Флетчли", 70, 80),
            new Hogwarts("Чжоу Чанг", 80, 90),
            new Hogwarts("Падма Патил", 70, 80),
            new Hogwarts("Маркус Белби", 80, 80),
            new Hogwarts("Драко Малфой", 80, 80),
            new Hogwarts("Грэхэм Монтегю", 60, 80),
            new Hogwarts("Грегори Гойл", 70, 60),
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
        System.out.println("факультет Гриффиндор :");
        for (int i = 0; i < 3; i++) {
            gryf[i] = choiceDepartment(students[i]);          // зачисление Гарри, Гермионы и Рона на факультет Гриффиндор
            System.out.println(gryf[i]);
        }
        System.out.println();
        Gryffindor.compareBetween(gryf[0], gryf[1]);
        Gryffindor.compareBetween(gryf[0], gryf[2]);
        Gryffindor.compareBetween(gryf[1], gryf[2]);
        System.out.println();
        System.out.println("факультет Пуффендуй :");
        for (int i = 3; i < 6; i++) {
            puff[i-3] = choiceDepartment(students[i], 0);          // зачисление на факультет Пуффендуй
            System.out.println(puff[i-3]);
        }
        System.out.println();
        Puffenduy.compareBetween(puff[0], puff[1]);
        Puffenduy.compareBetween(puff[0], puff[2]);
        Puffenduy.compareBetween(puff[1], puff[2]);
        System.out.println();
        Hogwarts.compareBetween (gryf[1], puff[1]);
    }
    public static Gryffindor choiceDepartment(Hogwarts student) {
            return new Gryffindor( student.getNAME(), student.getPowerOfMagic(), student.getDistanceOfTransgression(),
                    (int) (70 + 31*Math.random()), (int) (70 + 31*Math.random()) , (int) (70 + 31*Math.random()));
    }
    public static Puffenduy choiceDepartment(Hogwarts student, int dep) {
        return new Puffenduy( student.getNAME(), student.getPowerOfMagic(), student.getDistanceOfTransgression(),
                (int) (70 + 31*Math.random()), (int) (70 + 31*Math.random()) , (int) (70 + 31*Math.random()));
    }
}