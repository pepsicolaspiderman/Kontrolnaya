import java.util.Scanner;
/* Написать метод принимающий на вход два числа, и проверующий что их сумма
лежит в пределах от 10 до 20(включистельно)
если да - вернуть true, в противном случае - false */
public class Zadanie1 {
    public static boolean proverka(int first, int second){
        if (first + second >= 10) {
            if (first + second <= 20){
                return true;
            } return false;
        } return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.print("Напишите первое число: ");
        int first = sc.nextInt();
        System.out.print("Напишите второе число: ");
        int second = sc.nextInt();
        System.out.print("Проверка суммы чисел: " + proverka(first, second));
    }
}