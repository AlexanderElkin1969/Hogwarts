public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryf = new Gryffindor[5];                                      // Четыре факультета Хогвардца
        Puffenduy[] puff = new Puffenduy[5];
        Kogtevran[] kogt = new Kogtevran[5];
        Slizerin[] sliz = new Slizerin[5];
        Hogwarts[] students = {
            new Hogwarts("Гарри Потер", 50, 20),
            new Hogwarts("Гермиона Грейнджер", 60, 10),
            new Hogwarts("Рон Уизли", 40, 10),
            new Hogwarts("Захария Смит", 40, 0),
            new Hogwarts("Седрик Диггори", 60, 10),
            new Hogwarts("Джастин Финч-Флетчли", 50, 20),
            new Hogwarts("Чжоу Чанг", 40, 10),
            new Hogwarts("Падма Патил", 50, 0),
            new Hogwarts("Маркус Белби", 60, 10),
            new Hogwarts("Драко Малфой", 50, 20),
            new Hogwarts("Грэхэм Монтегю", 40, 0),
            new Hogwarts("Грегори Гойл", 40, 10),
        };                                                                              //  Ученики прибывают в Хогвартс
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
        System.out.println();                                           //  Шляпа-распределительница зачисляет учеников в факультеты
        System.out.println("факультет Гриффиндор :");
        for (int i = 0; i < 3; i++) {
            gryf[i] = choiceDepartmentGryffindor(students[i]);          // зачисление Гарри, Гермионы и Рона на факультет Гриффиндор
            System.out.println(gryf[i]);
        }
        System.out.println();
        Gryffindor.compareBetween(gryf[0], gryf[1]);
        Gryffindor.compareBetween(gryf[0], gryf[2]);
        Gryffindor.compareBetween(gryf[1], gryf[2]);
        System.out.println();
        System.out.println("факультет Пуффендуй :");
        for (int i = 3; i < 6; i++) {
            puff[i-3] = choiceDepartmentPuffenduy(students[i]);          // зачисление на факультет Пуффендуй
            System.out.println(puff[i-3]);
        }
        System.out.println();
        Puffenduy.compareBetween(puff[0], puff[1]);
        Puffenduy.compareBetween(puff[0], puff[2]);
        Puffenduy.compareBetween(puff[1], puff[2]);
        System.out.println();
        System.out.println("факультет Когтевран :");
        for (int i = 6; i < 9; i++) {
            kogt[i-6] = choiceDepartmentKogtevran(students[i]);          // зачисление на факультет Когтевран
            System.out.println(kogt[i-6]);
        }
        System.out.println();
        Kogtevran.compareBetween(kogt[0], kogt[1]);
        Kogtevran.compareBetween(kogt[0], kogt[2]);
        Kogtevran.compareBetween(kogt[1], kogt[2]);
        System.out.println();
        System.out.println("факультет Слизерин :");
        for (int i = 9; i < 12; i++) {
            sliz[i-9] = choiceDepartmentSlizerin(students[i]);          // зачисление на факультет Слизерин
            System.out.println(sliz[i-9]);
        }
        System.out.println();
        Slizerin.compareBetween(sliz[0], sliz[1]);
        Slizerin.compareBetween(sliz[0], sliz[2]);
        Slizerin.compareBetween(sliz[1], sliz[2]);
        System.out.println();
        Hogwarts.compareBetween (gryf[1], puff[1]);                 //  сравнение учеников разных факультетов
        Hogwarts.compareBetween (gryf[1], kogt[1]);
        Hogwarts.compareBetween (gryf[1], sliz[1]);
        Hogwarts.compareBetween (puff[1], kogt[1]);
        Hogwarts.compareBetween (puff[1], sliz[1]);
        Hogwarts.compareBetween (kogt[1], sliz[1]);
    }
    public static Gryffindor choiceDepartmentGryffindor(Hogwarts student) {
            return new Gryffindor( student.getNAME(), student.getPowerOfMagic(), student.getDistanceOfTransgression(),
                    (int) (70 + 31*Math.random()), (int) (70 + 31*Math.random()) , (int) (70 + 31*Math.random()));
    }
    public static Puffenduy choiceDepartmentPuffenduy(Hogwarts student) {
        return new Puffenduy( student.getNAME(), student.getPowerOfMagic(), student.getDistanceOfTransgression(),
                (int) (70 + 31*Math.random()), (int) (70 + 31*Math.random()) , (int) (70 + 31*Math.random()));
    }
    public static Kogtevran choiceDepartmentKogtevran(Hogwarts student) {
        return new Kogtevran( student.getNAME(), student.getPowerOfMagic(), student.getDistanceOfTransgression(),
                (int) (70 + 31*Math.random()), (int) (70 + 31*Math.random()) , (int) (70 + 31*Math.random()), (int) (70 + 31*Math.random()));
    }
    public static Slizerin choiceDepartmentSlizerin(Hogwarts student) {
        return new Slizerin( student.getNAME(), student.getPowerOfMagic(), student.getDistanceOfTransgression(),
                (int) (70 + 31*Math.random()), (int) (70 + 31*Math.random()) , (int) (70 + 31*Math.random()),
                (int) (70 + 31*Math.random()), (int) (70 + 31*Math.random()));
    }
}