
/**
 * Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, отделяя один
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
//        for(int i = 0; i < Massive.length; i++){
//            System.out.println(Massive[i]);
//        }
//    }
//}

/**
 * Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив выведите
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

/**
 * Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран. Подсчитайте сколько в массиве
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

/**
 * Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку. Замените каждый элемент
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

/**
 * Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в двух отдельных
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

/**
 * Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку. Определить и вывести на
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


/**
 * Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является в этом массиве
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

/**
 * Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел.
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

/**
 * Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку. Определите какой
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

/**
 * Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив указанного
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

/**
 * Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом, чтобы отрицательных и
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

/**
 * Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n. Если пользователь
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

/**
 *  Сортировка выбором
 */

//public class Main {
//    public static void main(String[] args) {
//        int[] a = {10 , 1 , 0, 0, 8 -1, 2, 5, 9, 4} ;
//
//        for (int i = 0; i < a.length; i++) {
//            /* Предполагаем, что начальный элемент рассматриваемого
//             * фрагмента и будет минимальным.
//             */
//            int min = a[i]; // Предполагаемый минимальный элемент
//            int imin = i; // Индекс минимального элемента
//            /* Просматриваем оставшийся фрагмент массива и ищем там
//             * элемент, меньший предположенного минимума.
//             */
//            for (int j = i + 1; j < a.length; j++) {
//                /* Если находим новый минимум, то запоминаем его индекс.
//                 * И обновляем значение минимума.
//                 */
//                if (a[j] < min) {
//                    min = a[j];
//                    imin = j;
//                }
//            }
//            /* Проверяем, нашёлся ли элемент меньше, чем стоит на
//             * текущей позиции. Если нашёлся, то меняем элементы местами.
//             */
//            if (i != imin) {
//                int temp = a[i];
//                a[i] = a[imin];
//                a[imin] = temp;
//            }
//        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }
//}

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.LinkedList;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] array = {10 , 1 , -2, 0, 8 -1, 2, 5, 9, 4} ;
//        System.out.println(Arrays.toString(array));
//        int[] new_array = Arrays.copyOf(array, array.length);
//        Arrays.sort(new_array);
//        System.out.println(Arrays.toString(new_array));
//        System.out.println();
//        ArrayList<Integer>arr_1 = new ArrayList(0);
//        arr_1.add(0,100);
//        arr_1.add(1,200);
//        arr_1.add(2,300);
//        arr_1.set(2,400);
//        LinkedList<String>arr_2 = new LinkedList<>();
//        arr_2.add(0,"Lexa! ");
//        arr_2.add(1, "You're Welcom!");
//        System.out.println(arr_1.get(2));
//        System.out.println(arr_2.get(0) + arr_2.get(1));
//    }
//}

/**
 * Bubble sorting
 */

//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] array = {5, 0, 1, -4, 10, 3, 7, -6, 8} ;
//        /* Внешний цикл постоянно сужает фрагмент массива,
//         * который будет рассматриваться, ведь после каждого прохода
//         * внутреннего цикла на последнем месте фрагмента будет
//         * оказываться нужный элемент (его не надо рассматривать снова).
//         */
//        for (int i = array.length - 1; i >= 2; i--) {
//            /* В переменной sorted мы будем хранить признак того,
//             * отсортирован ли массив. Перед каждым проходом внутреннего
//             * цкла будем предполагать, что отсортирован, но если совершим
//             * хоть одну перестановку, то значит ещё не конца отсортирован.
//             * Этот приём, упрощающий сортировку, называется критерием Айверсона.
//             */
//            boolean sorted = true;
//            /* Во внутреннем цикле мы проходимся по фрагменту массива, который
//             * определяется внешним циклом. В этом фрагменте мы устанавливаем
//             * правильный порядок между соседними элементами, так попарно
//             * обрабатывая весь фрагмент.
//             */
//            for (int j = 0; j < i; j++) {
//                /* Если порядок соседних элементов не правильный, то их
//                 * надо обменять местами. И запомнить, что была перестановка.
//                 */
//                if (array[j] > array[j+1]) {
//                    int temp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = temp;
//                    sorted = false;
//                }
//            }
//            System.out.println(Arrays.toString(array));
//
//            /* Если массив отсортирован (т.е. не было ни одной перестановки
//             * во внутреннем цикле, значит можно прекращать работу внешнего
//             * цикла.
//             */
//            if(sorted) {
//                break;
//            }
//        }
//
//    }
//}

//import java.util.Arrays;
//
//public class Main{
//        public static void main(String[] args) {
//            int[] arr = new int[] {5, 0, 1, -4, 10, 3, 7, -6, 8};
//            printArray(arr);
//            boolean isSorted = false;
//            while (!isSorted) {
//                isSorted = true;
//                for (int i = 1; i < arr.length; i++) {
//                    if (arr[i] < arr[i - 1]) {
//                        int temp = arr[i];
//                        arr[i] = arr[i - 1];
//                        arr[i - 1] = temp;
//                        isSorted = false;
//                    }
//                }
//                printArray(arr);
//            }
//        }
//
//    private static void printArray(int[] arr) {
//        System.out.println(Arrays.toString(arr));
//    }
//}

//import java.util.Arrays;
//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] array = new int[10];
//        Random r = new Random();
//        boolean sort = true;
//        for(int i = 0; i < array.length; i++) {
//            array[i] = r.nextInt(100);
//        }
//        System.out.println(Arrays.toString(array));
//        for(int i = 0; i < array.length; i++) {
//            sort = true;
//            for(int j = 0; j < array.length - i - 1; j++) {
//                if(array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                    sort = false;
//                }
//            }
//            if(sort == true){
//                break;
//            }
//            System.out.println(Arrays.toString(array));
//        }
//    }
//}

/**
 * Multidimensional array
 */

/**
 * Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99]. Вывести
 * массив на экран.
 */

//public class Main{
//    public static void main(String[] args) {
//        int[][] da = new int[8][5];
//        for(int i=0; i<da.length; i++) {
//            for(int j=0; j<da[i].length; j++) {
//                da[i][j] = (int)(Math.random()*90) + 10;
//            }
//        }
//        for(int i=0; i<da.length; i++) {
//            for(int j=0; j<da[i].length; j++) {
//                System.out.print(da[i][j] + "\t");
//            }
//            System.out.println(); // Переходим на следующую строку
//        }
//    }
//}

/**
 * Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
 * Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого массива
 * (его индекс не имеет значения).
 */

//public class Main{
//    public static void main(String[] args){
//        int [][] arr = new int[5][8];
//        for(int i = 0;i < arr.length; i++){
//            for(int j = 0; j < arr[i].length; j++){
//                arr[i][j]=(int)((Math.random()*199) - 99);
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println(" ");
//        }
//        int max = arr[0][0];
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0;j < arr[i].length;j++){
//                if(arr[i][j] > max)
//                    max = arr[i][j];
//            }
//        }
//        System.out.println("\n" + "The value of the maximum array element= " + max);
//    }
//}

/**
 * Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5]. Вывести массив
 * на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов. Если таких строк
 * несколько, то вывести индекс первой встретившейся из них.
 * НЕ РАБОТАЕТ
 */

public class Main{
    public static void main(String[] args){
        int [][] arr = new int[7][4];
        //Для хранения значений произведения элементов строк, создадим простой массив размером равным количеству строк
        //двумерного массива
        int [] arr1 = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Строка №" + i + "\t");
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j]=(int)(Math.random()*11)-5;
                System.out.print(arr[i][j]+" ");
                //Заполним второй массив, путем перемножения всех элементов определенной строки двумерного массива
                if(j == 0)
                    arr1[i] = arr[i][j];
                else arr1[i]*= arr[i][j];
                //Для удобства восприятия каждую новую строку будем выводить с абзаца
                if(j == arr[i].length - 1)
                    System.out.println("\t");
            }
        }
        //Создадим переменные, в которых будут храниться значения максимального произведения по модулю элеметов строк
        //и индекс такой строки
        int max = 0, max_i = 0;
        //Переберем элементы второго массива, и выберем больший по модулю. Запомним его а также индекс этого элемента,
        //который будет равняться индексу строки двумерного массива
        for(int i = 0;i < arr1.length;i++){
            if(Math.abs(arr1[i]) > max){
                max = arr1[i];
                max_i = i;
            }
        }
        //Выведем информацию на экран
        System.out.println("Строка с наибольшим по модулю произведением элементов (" + max + ") имеет индекс - " + max_i);
    }
}

/**
 * Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9]. Вывести массив
 * на экран. Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент. При
 * этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки. Порядок остальных
 * элементов строки не важен (т.е. можно соврешить только одну перестановку, а можно отсортировать по убыванию каждую
 * строку). Вывести преобразованный массив на экран.
 * НЕ РАБОТАЕТ
 */

//public class Main{
//    public static void main(String[] args){
//        int [][] Mas = new int[6][7];
//        for(int i =0;i<Mas.length;i++){
//            System.out.print("Строка №" + i + " ");
//            for(int j = 0; j < Mas[i].length; j++){
//                Mas[i][j]=(int)(Math.random()*10);
//                //Выведем на экран элементы строки
//                System.out.print(Mas[i][j] + " ");
//                //Создадим две переменные, в которых будет храниться значение максимального элемента строки массива и его индекс
//                int max = 0,temp_index = 0;;
//                //Сохраним значение первого элемента в переменную, с которой будем сравнивать остальные значения элементов. Если значение переменной меньше, переменная получает новое значение, индекс элемента в строке сохраняется во вторую переменную
//                if(j == 0)
//                    max = Mas[i][j];
//                else {
//                    if(max < Mas[i][j]){
//                        max = Mas[i][j];
//                        temp_index = j;
//                    }
//                }
//                //По достижению конца строки, меняем местами первый и максимальный элемент, если они отличаются
//                if(j == Mas[i].length - 1){
//                    int temp = Mas[i][0];
//                    Mas[i][0] = Mas[i][temp_index];
//                    Mas[i][temp_index] = temp;
//                }
//            }
//            System.out.println(" ");
//        }
//        //Выводим обработанный массив на экран
//        for(int i = 0; i < Mas.length; i++){
//            System.out.print("Обработанная строка №" + i + "\t");
//            for(int j = 0; j < Mas[i].length; j++){
//                System.out.print(Mas[i][j]+" ");
//            }
//            System.out.println(" ");
//        }
//    }
//}

/**
 * Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил начинать каждый урок с
 * того, чтобы задавать каждому ученику пример из таблицы умножения, но в классе 15 человек, а примеры среди них не
 * должны повторяться. В помощь учителю напишите программу, которая будет выводить на экран 15 случайных примеров из
 * таблицы умножения (от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 — слишком просты). При этом среди 15
 * примеров не должно быть повторяющихся (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).
 * НЕ РАБОТАЕТ
 */

//public class Main{
//    public static void main(String[] args){
//        //Создадим массив зададий для учеников. Так как учеников 15, каждый из них получит свою строку (задание).
//        //Задание у нас состоит из 2 множителей и их произведения, т.е. в каждой строке будет 3 элемента
//        int [][] Mas = new int[15][3];
//        //Заполним массив заданий
//        for(int i = 0; i < Mas.length; i++){
//            for(int j = 0; j < Mas[i].length; j++){
//                //Первым двум элементам строки (множителям) присвоим рандомные значения от 2 до 9
//                Mas[i][j]=(int)(Math.random()*8) + 2;
//                //3 элемент - это результат умножения первых двух элементов строки
//                if(j == Mas[i].length-1){
//                    Mas[i][j]=Mas[i][j - 2]*Mas[i][j - 1];
//                    //Проверим, нет ли среди уже сформированых заданий (строк), таких, которые по условиям задачи нельзя
//                    //задавать другому ученику. Для этого переберем все результаты умножения (3 элементы) предыдущих строк.
//                    for(int q = 0; q < i; q++){
//                        if(Mas[i][j] == Mas[q][j] && i > 0){
//                            //Если мы нашли такую строку, надо убедиться, что множители в ней тоже совпадают. Для этого
//                            //нам достаточно проверить совпадение одного множителя.
//                            if(Mas[i][j - 1] == Mas[q][j - 1] || Mas[i][j - 2] == Mas[q][j - 2])
//                                //Если мы находим такое совпадение - заполним элементы строки заново
//                                --i;
//                        }
//                    }
//                }
//            }
//        }
//        //С помощью простого цикла выведем уже отобранные задания на экран
//        for(int i = 0; i < Mas.length; i++){
//            System.out.print("Задание №" + ( i + 1 + " Умножить "));
//            for(int j = 0;j < Mas[i].length; j++){
//                if(j == 0)
//                    System.out.print(Mas[i][j]+" на ");
//                if(j == 1)
//                    System.out.println(Mas[i][j]);
//            }
//        }
//    }
//}