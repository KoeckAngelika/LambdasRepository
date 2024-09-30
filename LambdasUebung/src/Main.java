import java.util.*;

public class Main {
        
    public static void main(String[] args) {

        project1();
        project2();
        project3();
    }

    public static void project1()
    {
        HalloJavamitForEach halloJavamitForEach = new HalloJavamitForEach();
        List<String> oldListTyp = new ArrayList<>();
        oldListTyp.add("A");
        oldListTyp.add("B");
        oldListTyp.add("C");

        for (int i = 0; i < oldListTyp.size(); i++) {
            System.out.println(oldListTyp.get(i));
        }

        oldListTyp.forEach(System.out::println);

        for (String string : oldListTyp) {
            Consumer ask = text -> string + "?";
            halloJavamitForEach.setConsumer(ask);
            halloJavamitForEach.formatText(string);
        }
    }

    public static void project2()
    {
        NumberTester numberTest = new NumberTester();
        Map<Integer, List<String>> listMap = new HashMap<>(numberTest.getListMap());



        for (List<String> value : listMap.values()) {
            for (String string : value) {
                String[] parts = string.split(" ");
                int number1 = Integer.parseInt(parts[0]);
                int number2 = Integer.parseInt(parts[1]);

                if (number1 == 1) {
                    System.out.println("Gerade / Ungerade");
                    numberTest.setOddEvenTester(number2);
                    int evenNumberCalculate = numberTest.even(number2);
                    if (evenNumberCalculate == 0)
                    {
                        System.out.println(number2 + " ODD");
                    }else
                    {
                        System.out.println(number2 + " EVEN");
                    }
                    System.out.println();

                } else if (number1 == 2) {
                    System.out.println("Primzahl / KeinePrimzahl");
                    numberTest.setPrimeTester(number2);
                    boolean primNumberCalculate = numberTest.prime(number2);
                    if (primNumberCalculate)
                    {
                        System.out.println(number2 + " PRIME");
                    }else
                    {
                        System.out.println(number2 + " NO PRIME");
                    }
                    System.out.println();


                } else if (number1 == 3) {

                    System.out.println("Palidrom");
                    numberTest.setPalindromeTester(number2);
                    int evenNumberCalculate = numberTest.palindrome(number2);
                    if (evenNumberCalculate == 0)
                    {
                        System.out.println(number2 + " NO PALIDROM");
                    }else
                    {
                        System.out.println(number2 + " PALIDROM");
                    }
                    System.out.println();
                }

            }

        }
    }

    public static void project3()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chosse calculator:");
        System.out.println("1# Relationalcalculator");
        System.out.println("2# Vectorcalculator");
        System.out.println("3# Complexcalculator");
        System.out.println("4# Exit programm");
        int whichCalculator = Integer.parseInt(scanner.nextLine());
        System.out.println(">" + whichCalculator);
        while (whichCalculator == 4)
        {




            System.out.println("Chosse calculator:");
            System.out.println("1# Relationalcalculator");
            System.out.println("2# Vectorcalculator");
            System.out.println("3# Complexcalculator");
            System.out.println("4# Exit programm");
            whichCalculator = Integer.parseInt(scanner.nextLine());
            System.out.println(">" + whichCalculator);
        }


    }








}
