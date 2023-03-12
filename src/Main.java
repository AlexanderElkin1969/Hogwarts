public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryf = new Gryffindor[5];                                      // Четыре факультета Хогвардца
        Puffenduy[] puff = new Puffenduy[5];
        Kogtevran[] kogt = new Kogtevran[5];
        Slizerin[] sliz = new Slizerin[5];
        Hogwarts[] students = {
            new Hogwarts("Гарри Потер", 50, 20),
            new Hogwarts("Гермиона Грейнджер", 50, 10),
            new Hogwarts("Рон Уизли", 40, 10),
            new Hogwarts("Захария Смит", 40, 0),
            new Hogwarts("Седрик Диггори", 50, 10),
            new Hogwarts("Джастин Финч-Флетчли", 50, 20),
            new Hogwarts("Чжоу Чанг", 40, 10),
            new Hogwarts("Падма Патил", 50, 20),
            new Hogwarts("Маркус Белби", 30, 10),
            new Hogwarts("Драко Малфой", 50, 20),
            new Hogwarts("Грэхэм Монтегю", 40, 0),
            new Hogwarts("Грегори Гойл", 30, 10),
        };                                                                              //  Ученики прибывают в Хогвартс
        System.out.println("Школа магии и волшебства ХОГВАРДС :");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println();
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i+1; j < students.length; j++) {
                students[i].compareBetween (students[j]);
            }
        }
        System.out.println();                                           //  Шляпа-распределительница зачисляет учеников в факультеты
        System.out.println("факультет Гриффиндор :");
        for (int i = 0; i < 3; i++) {
            gryf[i] = choiceDepartmentGryffindor(students[i]);          // зачисление Гарри, Гермионы и Рона на факультет Гриффиндор
            System.out.println(gryf[i]);
        }
        System.out.println();
        gryf[0].compareBetween(gryf[1]);
        gryf[0].compareBetween(gryf[2]);
        gryf[1].compareBetween(gryf[2]);
        System.out.println();
        System.out.println("факультет Пуффендуй :");
        for (int i = 3; i < 6; i++) {
            puff[i-3] = choiceDepartmentPuffenduy(students[i]);          // зачисление на факультет Пуффендуй
            System.out.println(puff[i-3]);
        }
        System.out.println();
        puff[0].compareBetween(puff[1]);
        puff[0].compareBetween(puff[2]);
        puff[1].compareBetween(puff[2]);
        System.out.println();
        System.out.println("факультет Когтевран :");
        for (int i = 6; i < 9; i++) {
            kogt[i-6] = choiceDepartmentKogtevran(students[i]);          // зачисление на факультет Когтевран
            System.out.println(kogt[i-6]);
        }
        System.out.println();
        kogt[0].compareBetween(kogt[1]);
        kogt[0].compareBetween(kogt[2]);
        kogt[1].compareBetween(kogt[2]);
        System.out.println();
        System.out.println("факультет Слизерин :");
        for (int i = 9; i < 12; i++) {
            sliz[i-9] = choiceDepartmentSlizerin(students[i]);          // зачисление на факультет Слизерин
            System.out.println(sliz[i-9]);
        }
        System.out.println();
        sliz[0].compareBetween(sliz[1]);
        sliz[0].compareBetween(sliz[2]);
        sliz[1].compareBetween(sliz[2]);
        System.out.println();
        gryf[1].compareBetween(puff[1]);                 //  сравнение учеников разных факультетов
        gryf[1].compareBetween(kogt[1]);
        gryf[1].compareBetween(sliz[1]);
        gryf[1].setPowerOfMagic(70);                      //  Гермиона много занималать магией на практике
        puff[1].setPowerOfMagic(60);
        kogt[1].setPowerOfMagic(55);
        sliz[1].setPowerOfMagic(50);
        System.out.println("После полугода занятий в Хогвардсе :");
        gryf[1].compareBetween(puff[1]);                 //  сравнение учеников разных факультетов
        gryf[1].compareBetween(kogt[1]);
        gryf[1].compareBetween(sliz[1]);
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