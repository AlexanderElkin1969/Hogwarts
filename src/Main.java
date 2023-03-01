public class Main {
    public static void main(String[] args) {
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
    }
}