public class Main {
    public static void main(String[] args) {
        String mas[] = {"Пушкин", "Бермонтов", "Некрасов", "Толстой Л. Н.", "Толстой А. Н.", "Есенин", "Паустовский"};

        for (int i = 0; i < mas.length; i++) {
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[i].compareTo(mas[j]) < 0) {
                    String temp = mas[j];
                    mas[j] = mas[i];
                    mas[i] = temp;

                }
            }
        }
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }

    }
}