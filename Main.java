
/*
Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, отделяя один
элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки). Перед созданием
массива подумайте, какого он будет размера.
 */

//public class Main {
//
//    public static void main(String[] args) {
//        int size = 0;
//        for (int i = 2; i <= 20; i++){
//            if (i % 2 == 0){
//                size++;
//            }
//        }
//        int [] Massive = new int[size];
//        for (int i = 2, index = 0; i <= 20; i++){
//            if (i % 2 == 0){
//                Massive[index] = i;
//                System.out.print(Massive[index] + " ");
//                index++;
//            }
//        }
//        System.out.println(" ");
//        for(int i = 0;i < Massive.length;i++){
//            System.out.println(Massive[i]);
//        }
//    }
//}

/*
Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив выведите
на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
 */

//public class Main {
//
//    public static void main(String[] args) {
//        int size = 0;                     //  высчитываем размер массива
//        for (int i = 1; i <= 99; i++){
//            if (i % 2 != 0){
//                size++;
//            }
//        }
//        int[] massive = new int[size];
//        for (int i = 1, index = 0; i <= 99; i++){
//            if (i % 2 != 0){
//                massive[index] = i;
//                System.out.print(massive[index] + " ");
//                index++;
//            }
//        }
//        System.out.println();
//        for (int i = massive.length - 1; i >= 0; i--){ //обратная последовательность элементов массива
//            System.out.print(massive[i] + " ");
//        }
//    }
//}

/*
Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран. Подсчитайте сколько в массиве
чётных элементов и выведете это количество на экран на отдельной строке.
 */

//public class Main {
//
//    public static void main(String[] args) {
//        int[] massive = new int[15];
//        for (int i = 0; i < massive.length; i++){
//            massive[i] = (int)(Math.random() * 10);
//            System.out.print(massive[i] + " ");
//        }
//        int count = 0;
//        for (int i = 0; i < massive.length; i++){
//            if (massive[i] % 2 ==0 && massive[i] != 0){
//                count++;
//            }
//        }
//        System.out.println("\nQuantity of even numbers: " + count);
//    }
//}

/*
Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку. Замените каждый элемент
с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
 */

//public class Main {
//
//    public static void main(String[] args) {
//        int[] massive = new int[8];
//        for (int i = 0; i < massive.length; i++){
//            massive[i] = (int)(Math.random() * 10) + 1;
//            System.out.print(massive[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < massive.length; i++){
//            if (i % 2 != 0) {
//                massive[i] = 0;
//                System.out.print(massive[i] + " ");
//            } else{
//                System.out.print(massive[i] + " ");
//            }
//        }
//    }
//}

/*
Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в двух отдельных
строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение
оказалось больше (либо сообщите, что их средние арифметические равны).
 */
//public class Main {
//    public static void main(String[] args) {
//        int[] massive_1 = new int[5];
//        double average_1 = 0;
//        for (int i = 0; i < massive_1.length; i++){
//            massive_1[i] = (int)(Math.random() * 6);
//            System.out.print(massive_1[i] + " ");
//            average_1 +=(double)massive_1[i] / massive_1.length;
//        }
//        System.out.println("Average the 1st is " + average_1);
//
//        int[] massive_2 = new int[5];
//        double average_2 = 0;
//        for (int i = 0; i < massive_2.length; i++){
//            massive_2[i] = (int)(Math.random() * 6);
//            System.out.print(massive_2[i] + " ");
//            average_2+=(double)massive_2[i] / massive_2.length;
//        }
//        System.out.println("Average the 2nd is " + average_2);
//
//        if (average_1 > average_2){
//            System.out.println("Average the 1st massive more");
//        }
//        else if(average_1 < average_2){
//            System.out.println("Average the 2nd massive more");
//        }
//        else System.out.println("Averages both massives equal");
//    }
//}

/*
Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку. Определить и вывести на
экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */

//    public class  Main {
//        public static void main(String[] args) {
//            int flag = 0;
//            int[] massive = new int[3];
//            for (int i = 0; i < massive.length; i++) {
//                massive[i] = (int) (Math.random() * 90) + 10;
//                System.out.print(massive[i] + "  ");
//            }
//            for(int i=0; i < massive.length - 1; i++) {
//                if(massive[i] >= massive[i+1]) {
//                    flag = 1;
//                    break;
//                }
//            }
//            if(flag == 1) {
//                System.out.println("Not increasing sequence!");
//            } else {
//                System.out.println("Increasing sequence!");
//            }
//        }
//    }


/*
Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является в этом массиве
максимальным и сообщите индекс его последнего вхождения в массив.
 */

//    public class Main{
//        public static void main(String[] args) {
//            int max = 0,
//                index = 0;
//            int[] massive = new int[12];
//            for(int i = 0; i < massive.length; i++){
//                massive[i] = (int)(Math.random()*31) - 15;
//                System.out.print(massive[i] + " ");
//            }
//            System.out.println();
//            for(int i = 0; i < massive.length; i++){
//                if(massive[i] >= max) {             // если неравенство строгое первый индекс максиума
//                    max = massive[i];
//                    index = i;
//                }
//            }
//            System.out.println("Max element: " + max);
//            System.out.println("Last index of max element: " + index);
//        }
//    }

/*
Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел.
Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым
индексом к элементу из второго массива с i-ым индексом. Вывести все три массива на экран (каждый на отдельной строке),
затем вывести количество целых элементов в третьем массиве.
 */

//    public class Main {
//        public static void main(String[] args) {
//            int[] mas1 = new int[10];
//            int[] mas2 = new int[10];
//            float[] mas3 = new float[10];
//            int j = 0;
//            for(int i=0; i < mas1.length; i++){
//                mas1[i]=(int)(Math.random()*9) + 1;
//                mas2[i]=(int)(Math.random()*9) + 1;
//                mas3[i]=(float) mas1[i] / mas2[i];
//                System.out.print(mas1[i] + "   ");
//            }
//            System.out.println();
//            for(int i=0; i < mas2.length; i++) {
//                System.out.print(mas2[i]+ "   ");
//            }
//            System.out.println();
//            for(int i=0; i < mas3.length; i++) {
//                System.out.print(mas3[i] + " ");
//                if(mas3[i] % 1 == 0) {
//                    j++;
//                }
//            }
//            System.out.println("\nQuantity integer elements in the 3rd massive equals: " + j);
//    }
//}

/*
Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку. Определите какой
элемент встречается в массиве чаще всего и выведите об этом сообщение на экран. Если два каких-то элемента встречаются
одинаковое количество раз, то не выводите ничего.
 */

//public class Main {
//
//    public static void main(String[] args) {
//        int[] mas = new int[11];
//        int a = 0,b = 0,c = 0;
//        for(int i = 0; i < mas.length; i++){
//            mas[i]=(int)(Math.random()*3)-1;
//            System.out.print(mas[i]+" ");
//        }
//        System.out.println();
//        for(int i = 0; i < mas.length; i++) {
//            if(mas[i] == -1) {
//                a++;
//            } else if(mas[i] == 1) {
//                b++;
//            } else {
//                c++;
//            }
//        }
//        if(a > b && a > c) {
//            System.out.println("\nmost numbers equal -1, It's  " + a);
//        } else if(b > a && b > c) {
//            System.out.println("\nmost numbers equal 1, It's  " + b);
//        } else if(c > a && c > b) {
//            System.out.println("\nmost numbers equal 0, It's  " + c);
//        }
//    }
//}

/*
Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив указанного
размера из случайных целых чисел из [-5;5] и вывести его на экран в строку. После этого программа должна определить и
сообщить пользователю о том, сумма модулей какой половины массива больше: левой или правой, либо сообщить, что эти суммы
модулей равны. Если пользователь введёт неподходящее число, то программа должна требовать повторного ввода до тех пор,
пока не будет указано корректное значение.
 */

//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        //Создадим переменную, в которую занесем число, введенное пользователем
//        // Также создадим переменные, в которых будут храниться значения суммы модулей чисел в массиве
//        int numberSize,lengthRight = 0,lengthLeft = 0;
//        //Создадим объект класса Scanner
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите четное число");
//        //Проверим, является ли символ, введенный пользователем, числом
//        if (in.hasNextInt()){
//            //Если введено число, проверим является ли число четным, если нет - попросим повторить ввод
//            do{
//                numberSize = in.nextInt();
//                if(numberSize % 2 != 0 || numberSize < 1)
//                    System.out.println("Вы ошиблись, введите повторно четное число!");
//            }
//            while(numberSize % 2 != 0 || numberSize < 1);
//            //Создадим и заполним массив
//            int[] massive = new int[numberSize];
//            for(int i = 0; i < massive.length; i++){
//                massive[i]=(int)(Math.random() * 11) - 5;
//                System.out.print(massive[i] + " ");
//                //В этом же цикле посчитаем сумму модулей чисел половин массива
//                if(i <= massive.length/2-1){
//                    lengthLeft += Math.abs(massive[i]);
//                }
//                else {
//                    lengthRight += Math.abs(massive[i]);
//                }
//                //На последнем витке цикла проверим, какая из сум больше и выведем об этом сообщение
//                if(i == massive.length - 1){
//                    System.out.println(" ");
//                    if(lengthLeft > lengthRight)
//                        System.out.println("Сумма модулей левой половины массива больше и равна " + lengthLeft);
//                    if(lengthRight > lengthLeft)
//                        System.out.println("Сумма модулей правой половины массива больше и равна "+ lengthRight);
//                    if(lengthRight == lengthLeft)
//                        System.out.println("Суммы модулей левой и правой половины равны");
//                }
//            }
//        }
//        else System.out.println("Введено не число");
//    }
//}

/*
Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом, чтобы отрицательных и
положительных элементов там было поровну и не было нулей. При этом порядок следования элементов должен быть случаен
(т. е. не подходит вариант, когда в массиве постоянно выпадает сначала 6 положительных, а потом 6 отрицательных чисел
или же когда элементы постоянно чередуются через один и пр.). Вывести полученный массив на экран.
 */

//public class Main{
//
//    public static void main(String[] args){
//        //Создадим переменные, в которые будем сохранять количество положительных и отрицательных элементов массива
//        int plusCount = 0,minusCount = 0;
//        int[] Mas = new int[12];
//        //При помощи оператора do-while будем при помощи цикла заполнять массив то тих пор, пока значение положительных
//        // и отрицательных элементов массива будет равно
//        do{
//            for(int i = 0; i < Mas.length; i++){
//                Mas[i]=(int)(Math.random() * 21) -10;
//                //Увеличим значения счетчиков, в зависимости от зачения элемента массива
//                if(Mas[i] > 0){
//                    plusCount++;
//                }
//                if(Mas[i] < 0){
//                    minusCount++;
//                }
//                //Проверим не равно ли значение массива 0, если равно заполним значение заново
//                if(Mas[i]==0){
//                    --i;
//                }
//                //Проверим, поровну ли в конце цикла положительных и отрицательных элементов среди жлементов массива. Если
//                // нет - обнулим счетчики
//                if(i == Mas.length - 1 && plusCount != Mas.length / 2){
//                    plusCount=0;
//                    minusCount=0;
//                }
//            }
//        }
//        while (plusCount != Mas.length / 2 && minusCount != Mas.length / 2);
//        //С помощью цикла выведем значения массива на экран
//        for(int i = 0;i < Mas.length; i++){
//            System.out.print(Mas[i]+" ");
//        }
//    }
//}

/*
Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n. Если пользователь
ввёл не подходящее число, то программа должна просить пользователя повторить ввод. Создать массив из n случайных целых
чисел из отрезка [0;n] и вывести его на экран. Создать второй массив только из чётных элементов первого массива, если
они там есть, и вывести его на экран.
 */

//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        //Создадим 2 переменные, в первой будет храниться значение размера первого массива, введенного пользователем.
//        // Во второй, размер второго массива - количесво четных элементов первого массива
//        int size = 0,sizeSubMassive = 0;
//        //С помощиью операторов do-while мы запрашиваем пользователя ввести число большее 3, пока он с этим заданием
//        // не справится
//        do{
//            Scanner scn = new Scanner(System.in);
//            System.out.println("Введите число большее 3");
//            if(scn.hasNextInt()){
//                size = scn.nextInt();
//            }
//            else System.out.println("Ошибка. Вы ввели не число!");
//        }
//        while (size < 4);
//        //Создадим и заполним первый массив
//        int[] massive = new int[size];
//        for(int i = 0; i < massive.length; i++){
//            massive[i]=(int)(Math.random()*(size + 1));
//            System.out.print(massive[i]+" ");
//            //Каждый раз, когда значение элемента массива четное - увеличиваем счетчик
//            if(massive[i] % 2 == 0 && massive[i] != 0)
//                sizeSubMassive++;
//        }
//        System.out.println("");
//        //Если в первом массиве были четные элементы - создаем и заполняем второй массив
//        if(sizeSubMassive > 0){
//            int[] subMassive = new int[sizeSubMassive];
//            for(int i=0, b=0; i < massive.length; i++){
//                if (massive[i] % 2 == 0 && massive[i] != 0){
//                    subMassive[b]=massive[i];
//                    System.out.print(subMassive[b]+" ");
//                }
//            }
//        }
//    }
//}

public class Main {
    public static void main(String[] args) {
        int[] a = {10 , 1 , 0, 0, 8 -1, 2, 5, 9, 4} ;

        for (int i = 0; i < a.length; i++) {
            /* Предполагаем, что начальный элемент рассматриваемого
             * фрагмента и будет минимальным.
             */
            int min = a[i]; // Предполагаемый минимальный элемент
            int imin = i; // Индекс минимального элемента
            /* Просматриваем оставшийся фрагмент массива и ищем там
             * элемент, меньший предположенного минимума.
             */
            for (int j = i + 1; j < a.length; j++) {
                /* Если находим новый минимум, то запоминаем его индекс.
                 * И обновляем значение минимума.
                 */
                if (a[j] < min) {
                    min = a[j];
                    imin = j;
                }
            }
            /* Проверяем, нашёлся ли элемент меньше, чем стоит на
             * текущей позиции. Если нашёлся, то меняем элементы местами.
             */
            if (i != imin) {
                int temp = a[i];
                a[i] = a[imin];
                a[imin] = temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}