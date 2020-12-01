/* Задать пустой целочисленный массив размером 8
С помощью цикла заполнить его значениями 0 3 6 9 12  15 18 21  */
public class Zadanie2 {
    public static void main(String[] args){
        int []arr = new int[8];
        int i, j;
        for (i=0, j=0; i<=21; i+=3, j++){
            arr[j] = i;
            System.out.print(arr[j]+" ");
        }
    }
}