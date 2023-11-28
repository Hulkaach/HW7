import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )
        int choice;
        //todo реализовать ввод пользователем кол-ва ингредиентов.
        boolean flag = true;

        System.out.println("На текущий момент у нас есть:\nЖабьи глаза - "+toadEyesCount+"\nСлезы вурдалака - "+ghoulTearsCount+"" +
                "\nКости ворона - " + ravenBonesCount+"\nПельмени - "+dumplingsCount);

        while (flag){
            System.out.println("Выбери чего добавить (на +1)");
            System.out.println("На сегодян меню элексиров:\n1.Жабьи глаза\n2.Слезы вурдалака\n3.Кости ворона\n4.Пельмени\n0.Хвать, сколько можно");
            int ch = new Scanner(System.in).nextInt();
            if (ch==1){
                toadEyesCount++;
            }    else if (ch==2){
                ghoulTearsCount++;
            }else if (ch==3){
                ravenBonesCount++;
            } else if (ch==4) {
                dumplingsCount++;
            }            else if (ch ==0){
                System.out.println("Хорошо. Дело сделано. Теперь у нас есть:\nЖабьи глаза - "+toadEyesCount+"\nСлезы вурдалака - "+ghoulTearsCount+"" +
                        "\nКости ворона - " + ravenBonesCount+"\nПельмени - "+dumplingsCount);
                flag = false;
            } else System.out.println("Ну ты и тупой, выбор только от 1 до 4 и выйти 0");
        }

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда
    }
}
