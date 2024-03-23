package JavaSkript.HW006;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.Scanner;
/* Задание:
-Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
методы. Реализовать в java.
-Создать множество ноутбуков.
-Написать метод, который будет запрашивать у пользователя критерий (или критерии)
фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
хранить в Map.*/
public class MainLaptor {
    public static void main(String[] args) { 
        boolean bl = true;
        while (bl == true) {
            int co = whatDo();
            if (co == 1) {
                HashSet<Laptop> laptops = spawnsLaptopsLog();
        System.out.println("Весь каталог:");
        printHashSet(laptops);
        TreeMap<Integer, String> cotolChoice = spawnsChoiceLog();
        int num = ques(cotolChoice, cotolChoice.size());
        int numm = spawnsAdvancedChoiceLog(num);
        HashSet<Laptop> laptops1 = filtrLaptopsLog(num, numm, laptops);
        if (laptops1.isEmpty()){
            System.out.println("По вашемму запросу ничего не найдено :(\n      ");
        }else{
            printHashSet(laptops1);  
        }
            }
            if (co ==0 ) {
                bl = false;
            }
        }
    }
    // Спрашивает что хотим сделать
    public static int whatDo() {
        String n = "Введи 1 если хочешь начать поиск \nВведи 0 если хочешь выйти";
        int a = inputNumber(n);
        return a;
    }
    // Красивый вывод HasSet
    public static void printHashSet(HashSet<Laptop> laptops ) {
        for (Laptop elem : laptops) {
            System.out.println(elem + "\n");
        }
    }
    // Запрашивает число для коталога и др
    public static int inputNumber(String n) {
        System.out.println(n);
        Scanner input = new Scanner(System.in);
        int number;
        if(input.hasNextInt()) {
            number = input.nextInt();
            if (number > 1) {
                System.out.println("Вы ввели не допустимое значение \nПопробуйте еще разок");
                return inputNumber(n);
            }
            return number;
        }else{
            System.out.println("Вы ввели не допустимое значение \nПопробуйте еще раз");
            return inputNumber(n);
        }
    }
    // Список компьютероав
    public static HashSet<Laptop> spawnsLaptopsLog() {
        Laptop lap1 = new Laptop("24 Гб" ,"Windows" , 64 , "Белый", 16, 2030, 7000, 10);
        Laptop lap2 = new Laptop("16 Гб" ,"Linux" , 32 , "Синий", 8, 2017, 7444, 20);
        Laptop lap3 = new Laptop("32 Гб" ,"MacOS" , 64 , "Черный", 14, 2019, 7000, 20);
        Laptop lap4 = new Laptop("24 Гб" ,"Windows" , 64 , "Черный", 16, 2030, 7000, 18);
        Laptop lap5 = new Laptop("24 Гб" ,"Windows" , 64 , "Фиолетовый", 16, 2030, 7000, 100);
        Laptop lap6 = new Laptop("24 Гб" ,"Windows" , 64 , "Синий", 16, 2030, 7000, 29);
        Laptop lap7 = new Laptop("24 Гб" ,"Windows" , 64 , "Серый", 16, 2030, 7000, 22);
        HashSet<Laptop> laptops =new HashSet<>(Arrays.asList(lap1, lap2, lap3, lap4, lap5, lap6, lap7));
        return laptops;
    }
    // Фильтрация 
    public static HashSet<Laptop> filtrLaptopsLog(int num1, int num2, HashSet<Laptop> laptops ) {
        if (num1 == 1) {
            HashSet<Laptop> laptops1 = new HashSet<>();
            TreeMap<Integer, String> cotoll = ozySearch();
            String str = cotoll.get(num2);
            System.out.println(str);
            for (Laptop lapt : laptops) {
                if (lapt.ozyCompar(str)) {
                    laptops1.add(lapt);
                }
            }
            return laptops1;
        }if (num1 == 2) {
            HashSet<Laptop> laptops1 = new HashSet<>();
            TreeMap<Integer, String> cotoll = operatingSystemSearch();
            String str = cotoll.get(num2);
            System.out.println(str);
            for (Laptop lapt : laptops) {
                if (lapt.operatingSystemCompar(str)) {
                    laptops1.add(lapt);
                }
            }
            return laptops1;
        }if (num1 == 3) {
            HashSet<Laptop> laptops1 = new HashSet<>();
            TreeMap<Integer, Integer> cotoll = vLDSearchInteger();
            int str = cotoll.get(num2);
            System.out.println(str);
            for (Laptop lapt : laptops) {
                if (lapt.vLDCompar(str)) {
                    laptops1.add(lapt);
                }
            }
            return laptops1;
        }if (num1 == 4) {
            HashSet<Laptop> laptops1 = new HashSet<>();
            TreeMap<Integer, String> cotoll = colorSearch();
            String str = cotoll.get(num2);
            System.out.println(str);
            for (Laptop lapt : laptops) {
                if (lapt.colorCompar(str)) {
                    laptops1.add(lapt);
                }
            }
            return laptops1;
        }if (num1 == 5) {
            HashSet<Laptop> laptops1 = new HashSet<>();
            TreeMap<Integer, Integer> cotoll = quantityCoreSearchInteger();
            int str = cotoll.get(num2);
            //System.out.println(str);
            for (Laptop lapt : laptops) {
                if (lapt.quantityCoreCompar(str)) {
                    laptops1.add(lapt);
                }
            }
            return laptops1;
        } if (num1 == 6) {
            HashSet<Laptop> laptops1 = new HashSet<>();
            TreeMap<Integer, Integer> cotoll = ageSearchInteger();
            if (num2 == 1) {
                for (Laptop elem : laptops) {
                    if (elem.ageExist(0, cotoll.get(1) )) {
                        laptops1.add(elem);
                    }
                }
                return laptops1;
            }if (num2 == 2) {
                for (Laptop elem : laptops) {
                    if (elem.ageExist(cotoll.get(1), cotoll.get(2) )) {
                        laptops1.add(elem);
                    }
                }
                return laptops1;
            }if (num2 == 3) {
                for (Laptop elem : laptops) {
                    if (elem.ageExist(cotoll.get(2), cotoll.get(3) )) {
                        laptops1.add(elem);
                    }
                }
                return laptops1;
            }
            return laptops1;
        }if (num1 == 7) {
            HashSet<Laptop> laptops1 = new HashSet<>();
            TreeMap<Integer, Integer> cotoll = praceInteger();
            if (num2 == 1) {
                for (Laptop elem : laptops) {
                    if (elem.priceExist(1,cotoll.get(1)  )) {
                    laptops1.add(elem);
                     }
                }
                return laptops1;
            }if (num2 == 2) {
                for (Laptop elem : laptops) {
                    if (elem.priceExist(cotoll.get(1), cotoll.get(2) )) {
                        laptops1.add(elem);
                    }
                }
                return laptops1;
            }if (num2 == 3) {
                for (Laptop elem : laptops) {
                    if (elem.priceExist(cotoll.get(2), cotoll.get(3) )) {
                        laptops1.add(elem);
                }
            }
            return laptops1;
        }
        return laptops1;
        }if (num1 == 8) {
            HashSet<Laptop> laptops1 = new HashSet<>();
            TreeMap<Integer, Integer> cotoll = quantityInShopSearchInteger();
            if (num2 == 1) {
                for (Laptop elem : laptops) {
                    if (elem.quantityInShopExist(1,cotoll.get(1)  )) {
                    laptops1.add(elem);
                     }
                }
                return laptops1;
            }if (num2 == 2) {
                for (Laptop elem : laptops) {
                    if (elem.quantityInShopExist(cotoll.get(1), cotoll.get(2) )) {
                        laptops1.add(elem);
                    }
                }
                return laptops1;
            }if (num2 == 3) {
                for (Laptop elem : laptops) {
                    if (elem.quantityInShopExist(cotoll.get(2), cotoll.get(3) )) {
                        laptops1.add(elem);
                }
            }
            return laptops1;
        }
        return laptops1;
        } 
        HashSet<Laptop> laptops1 =  new HashSet<>(); ;
        return laptops1;
    }
    // Унивирсальный метод для запроса числа для фильтрации
    public static int ques(TreeMap<Integer, String> arr, int a) {
        for (int i = 1; i < arr.size()+ 1; i++) {
            //String a = i, " "+ arr.get(i);
            System.out.println(i+". "+ arr.get(i));
        }
        System.out.println("Введите номер критерия по которому хотите осуществить поиск:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > a) {
            System.out.println("\nВЫ ВВЕЛИ НОМЕР КРИТЕРИЯ КОТОРОГО НЕТ В СПИСКЕ!!! \nПОПРОБУЙТЕ ЕЩЕ РАЗОК!!!");
            return ques(arr, a);
        }
        return number;
    }
    // Узнаем второе число для фильтрации
    public static int  spawnsAdvancedChoiceLog(int numm) {
        if (numm == 1) {
            TreeMap<Integer, String> cotoll = ozySearch();
            int a = ques(cotoll, cotoll.size());
            return a; 
       }if (numm == 2) {
            TreeMap<Integer, String> cotol1  = operatingSystemSearch();
            int a = ques(cotol1, cotol1.size());
            return a;   
        }if (numm == 3) {
            TreeMap<Integer, String> cotol1  = vLDSearch();
            int a = ques(cotol1, cotol1.size());
            return a; 
        }if (numm == 4) {
               TreeMap<Integer, String> cotol1  = colorSearch();
            int a = ques(cotol1, cotol1.size());
            return a; 
        }if (numm == 5) {
            TreeMap<Integer, String> cotol1  = quantityCoreSearch();
            int a = ques(cotol1, cotol1.size());
            return a;  
        }if (numm == 6) {
            TreeMap<Integer, String> cotol1  = ageSearch();
            int a = ques(cotol1, cotol1.size());
            return a;
        }if (numm == 7) {
            TreeMap<Integer, String> cotol1  = priceSearch();
            int a = ques(cotol1, cotol1.size());
            return a;  
        }if (numm == 8) {
           TreeMap<Integer, String> cotol1  = quantityInShopSearch();
            int a = ques(cotol1, cotol1.size());
            return a; 
        }
       return 0 ;        
    }
    //------------------КАТАЛОГИ ПОИСКА------------------///
    // Поиск 1 (общий)
    public static TreeMap<Integer, String>  spawnsChoiceLog() {
        TreeMap<Integer, String> cotol = new TreeMap<>();
        cotol.putIfAbsent(1,"ОЗУ" );
        cotol.putIfAbsent(2,"Oперационная система");
        cotol.putIfAbsent(3,"Объём жесткого диска");
        cotol.putIfAbsent(4,"Цвет");
        cotol.putIfAbsent(5,"Кол-во ядер");
        cotol.putIfAbsent(6,"Год производства");
        cotol.putIfAbsent(7,"Цена");
        cotol.putIfAbsent(8,"Количество в магазине");
        return cotol;
    }
    // поиск 2 Озу(1)
    public static TreeMap<Integer, String> ozySearch() {
        TreeMap<Integer, String>  log = new TreeMap<>();
        log.putIfAbsent(1,"4 Гб" );
        log.putIfAbsent(2,"8 Гб");
        log.putIfAbsent(3,"16 Гб");
        log.putIfAbsent(4,"32 Гб");
        log.putIfAbsent(5,"64 Гб");
        return log;
    }
    // Поиск 2 операционная система(2)
    public static  TreeMap<Integer, String>  operatingSystemSearch() {
        TreeMap<Integer, String>  log = new TreeMap<>();
        log.putIfAbsent(1,"Windows" );
        log.putIfAbsent(2,"MacOS");
        log.putIfAbsent(3,"Linux");
        return log;
    }
    // Поиск 2 Объём ЖД(3)
    public static  TreeMap<Integer, String> vLDSearch() {
        TreeMap<Integer, String>  log = new TreeMap<>();
        log.putIfAbsent(1,"128 Гб" );
        log.putIfAbsent(2,"256 Гб");
        log.putIfAbsent(3,"512 Гб");
        log.putIfAbsent(4,"1 Тб");
        log.putIfAbsent(5,"2 Тб");
        return log;
    }
    // Фильтрация Объём ЖД (3)
    public static  TreeMap<Integer, Integer> vLDSearchInteger() {
        TreeMap<Integer, Integer>  log = new TreeMap<>();
        log.putIfAbsent(1,128 );
        log.putIfAbsent(2,256 );
        log.putIfAbsent(3,512);
        log.putIfAbsent(4,1);
        log.putIfAbsent(5,2 );
        return log;
    }
    // Поиск 2 Цвет(4)
    public static  TreeMap<Integer, String> colorSearch() {
        TreeMap<Integer, String>  log = new TreeMap<>();
        log.putIfAbsent(1,"Белый" );
        log.putIfAbsent(2,"Синий");
        log.putIfAbsent(3,"Черный");
        log.putIfAbsent(4,"Фиолетовый");
        log.putIfAbsent(5,"Серый");
        return log;
    }
    // Поиск 2 Кол-во ядер (5)
    public static  TreeMap<Integer, String> quantityCoreSearch() {
        TreeMap<Integer, String>  log = new TreeMap<>();
        log.putIfAbsent(1,"2 ядра" );
        log.putIfAbsent(2,"4 ядра");
        log.putIfAbsent(3,"10 ядер");
        log.putIfAbsent(4,"12 ядер");
        log.putIfAbsent(5,"14 ядер");
        log.putIfAbsent(6,"16 ядер");
        log.putIfAbsent(7,"24 ядра");
        return log;
    }
    // Фильтрация Кол-во ядер (5)
    public static  TreeMap<Integer,Integer> quantityCoreSearchInteger() {
        TreeMap<Integer, Integer>  log = new TreeMap<>();
        log.putIfAbsent(1,2 );
        log.putIfAbsent(2,4);
        log.putIfAbsent(3,10);
        log.putIfAbsent(4,12);
        log.putIfAbsent(5,14);
        log.putIfAbsent(6,16);
        log.putIfAbsent(7,24);
        return log;
    }
    //поиск 2 дата(6)
    public static  TreeMap<Integer, String>  ageSearch() {
        TreeMap<Integer, String>  log = new TreeMap<>();
        log.putIfAbsent(1,"До 2000г." );
        log.putIfAbsent(2,"От 2000г. до 2050г.");
        log.putIfAbsent(3,"От 2050г.");
        return log;
    }
    // Фильтрация дата(6)
    public static  TreeMap<Integer, Integer>  ageSearchInteger(){
        TreeMap<Integer, Integer>  log = new TreeMap<>();
        log.putIfAbsent(1,2000 );
        log.putIfAbsent(2,2050);
        log.putIfAbsent(3,3000);
        return log;
    }
    // поиск 2 Цена(7)
    public static  TreeMap<Integer, String>  priceSearch() {
        TreeMap<Integer, String>  log = new TreeMap<>();
        log.putIfAbsent(1,"До 10_000 рублей" );
        log.putIfAbsent(2,"От 10_000 до 50_000 рублей");
        log.putIfAbsent(3,"От 50_000 рублей");
        return log;
    }
    //Фильтрация Цена(7) 
    public static  TreeMap<Integer,Integer>  praceInteger() {
        TreeMap<Integer, Integer>  log = new TreeMap<>();
        log.putIfAbsent(1,10_000  );
        log.putIfAbsent(2,50_000);
        log.putIfAbsent(3,100_000);
        return log;
    }
    // Поиск 2 Кол-во в магазине(8)
    public static  TreeMap<Integer, String>  quantityInShopSearch() {
        TreeMap<Integer, String>  log = new TreeMap<>();
        log.putIfAbsent(1,"До 10 шт." );
        log.putIfAbsent(2,"От 10 до 50 шт.");
        log.putIfAbsent(3,"От 50 шт.");
        return log;
    }
    //Фильтрация Кол-во в магазине(8)
    public static  TreeMap<Integer, Integer>  quantityInShopSearchInteger() {
        TreeMap<Integer, Integer>  log = new TreeMap<>();
        log.putIfAbsent(1,10 );
        log.putIfAbsent(2,50 );
        log.putIfAbsent(3,2000);
        return log;
    }
}