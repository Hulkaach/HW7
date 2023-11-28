import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )

        //todo реализовать ввод пользователем кол-ва ингредиентов.
        boolean flag = true;

        System.out.println("На текущий момент у нас есть:\nЖабьи глаза - " + toadEyesCount + "\nСлезы вурдалака - " + ghoulTearsCount + "" +
                "\nКости ворона - " + ravenBonesCount + "\nПельмени - " + dumplingsCount);

        while (flag) {
            System.out.println("Выбери чего добавить (на +1)");
            System.out.println("На сегодян меню элексиров:\n1.Жабьи глаза\n2.Слезы вурдалака\n3.Кости ворона\n4.Пельмени\n0.Хвать, сколько можно");
            int ch = new Scanner(System.in).nextInt();
            if (ch == 1) {
                toadEyesCount++;
            } else if (ch == 2) {
                ghoulTearsCount++;
            } else if (ch == 3) {
                ravenBonesCount++;
            } else if (ch == 4) {
                dumplingsCount++;
            } else if (ch == 0) {
                System.out.println("Хорошо. Дело сделано. Теперь у нас есть:\nЖабьи глаза - " + toadEyesCount + "\nСлезы вурдалака - " + ghoulTearsCount + "" +
                        "\nКости ворона - " + ravenBonesCount + "\nПельмени - " + dumplingsCount);
                flag = false;
            } else System.out.println("Ну ты и тупой, выбор только от 1 до 4 и выйти 0");
        }

        boolean raven = true;
        int r = 0;
        boolean toad = true;
        int t = 0;
        boolean ghoul = true;
        int g = 0;
        boolean dumpling = true;
        int d = 0;
        while (raven) {
            if (toadEyesCount / 3 >= 1 && ravenBonesCount >= 1) {
                r++;
                toadEyesCount = toadEyesCount - 3;
                ravenBonesCount--;
            } else raven = false;
        }

        while (toad) {
            if (ravenBonesCount >= 2 && dumplingsCount / 4 >= 1) {
                t++;
                ravenBonesCount = ravenBonesCount - 2;
                dumplingsCount = dumplingsCount - 4;
            } else toad = false;
        }

        while (ghoul) {
            if (ghoulTearsCount / 7 >= 1 && toadEyesCount / 2 >= 1 && ravenBonesCount >= 1) {
                g++;
                toadEyesCount = toadEyesCount - 2;
                ravenBonesCount--;
                ghoulTearsCount = ghoulTearsCount - 7;
            } else ghoul = false;
        }

        while (dumpling) {
            if (ghoulTearsCount / 5 >= 1 && dumplingsCount / 10 >= 1 && toadEyesCount / 4 >= 1 && ravenBonesCount / 3 >= 1) {
                d++;
                toadEyesCount = toadEyesCount - 4;
                ravenBonesCount = ravenBonesCount - 3;
                ghoulTearsCount = ghoulTearsCount - 5;
                dumplingsCount = dumplingsCount - 10;
            } else dumpling = false;
        }
        if (d >= 1 || r >= 1 || t >= 1 || g >= 1) {
            System.out.println("По полученным ингридиентам ты можешь приготовить:\nЭлексир зоркости - " + r + "\nЭлесир стойкости - " + t + "" +
                    "\nЭлексир скрытности - " + g + "\nЭлитный элексир - " + d);
        } else System.out.println("К сожалению с таким иингридинтами ты ничего не можешь приготовить");
        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда
    }
}
