public class Main {
    public static void main(String[] args) {
            taskTitle();
            task1();
            task2();
            task3();
            task4();
            task5();
            task6();
            task7();
    }
            public static void taskTitle () {

                System.out.println("Hello!");
                System.out.println("Домашнее задание №4 (Условные операторы)");
                System.out.println(" ");
            }
            public static void task1 () {
                System.out.println("Задача №1");
                short age = 25,
                        adultAge = 18;

                if (age >= adultAge) {
                    System.out.println("Если возраст человека равен " + age + " лет, то он взрослый");
                } else {
                    System.out.println("Если возраст человека равен " + age +
                            ", то он не достиг совершеннолетия, нужно немного подождать");
                }
                System.out.println(" ");
            }
            public static void task2 () {
                    System.out.println("Задача 2");

                    float temperature = 7.0f, treshold = 5.0f ;

                System.out.print("На улице "+ temperature + "С градусов, ");

                if (temperature >= treshold) {
                    System.out.println("можно идти без шапки");
                } else {
                    System.out.println("нужно одеть шапку");
                }
                    System.out.println(" ");
            }

    public static void task3 () {
        System.out.println("Задача 3");
        float speed = 55.0f, limit = 60.0f ;
        System.out.print("Скорость " + speed + " км/ч,");
        if (speed > limit) {
            System.out.println(" придется заплатить штраф");}
            else {System.out.println(" можно ездить спокойно");}

        System.out.println(" ");
        }
    public static void task4 () {
        /** Задача 4
         Напишите программу, которая помогает определить, в какое учреждение нужно отправить
         человека в зависимости от его возраста:
         Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад.
         Если человеку от 7 до 18 лет, то ему нужно ходить в школу.
         Если человеку больше 18 лет, но меньше 24, то его место в университете.
         А если человеку больше 24, то ему пора ходить на работу.
         При выполнении каждого условия программа должна выводить в консоль сообщение в формате:
         «Если возраст человека равен …, то ему нужно ходить … (в зависимости от возраста дописать нужное)». */
        short age = 29 ;
        System.out.println("Задача 4");
        System.out.print("Если возраст человека равен " + age + " лет, ");
        boolean newborn = age < 2 ,
                kindergarten = age >= 2 && age <= 6,
                school = age >= 7 && age <= 18,
                university = age > 18 && age <= 24,
                jobReady = age > 24
                        ;
        if (newborn) {
            System.out.println("то такого малыша лучше растить дома"); }
        else if (kindergarten) {
            System.out.println("то ему нужно посещать детский садик");
        }
        else if (school) {
            System.out.println("то ему нужно ходить в школу");
        }
        else if (university) {
            System.out.println("то ему нужно учиться в университете");
        }
        else if (jobReady) {
            System.out.println("то ему нужно работать в полную силу");
        }

        System.out.println(" ");
    }

    public static void task5 () {
        /** Задача 5
         Как правило, на аттракционах действуют ограничения для детей по возрасту:

         Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
         Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.
         Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
         Напишите программу, которая выводит в консоль сообщение в формате: «Если возраст ребенка равен …, то ему … (в зависимости от возраста
         дописать нужное: нельзя кататься на аттракционе, можно кататься на аттракционе в сопровождении /
         без сопровождения взрослого)». */
        System.out.println("Задача 5");
            byte age = 15 ;
            boolean notAllowed = age < 5 ,
                    allowedWithAdult = age >= 5 && age < 14,
                    allowed = age >= 14 ;

        System.out.print("Если возраст ребенка равен " + age + " лет, он ");
        if (notAllowed) {
            System.out.println("не допускается на аттракцион");
                        }
        else if (allowedWithAdult) {
            System.out.println("может посещать аттракцион в сопровождении взрослого");
        }
        else if (allowed) {
            System.out.println("может посещать аттракцион самостоятельно");
        }

        System.out.println(" ");
    }

    public static void task6 () {
        /** Задача 6
         Вместимость одного вагона поезда — 102 человека. Вагон рассчитан на 60 сидячих мест, все остальные — стоячие.
         С помощью условного оператора и конструкции else напишите программу, которая выводит в консоль сообщение
         о том, есть ли место в вагоне, сидячее или стоячее, или вагон уже полностью забит.
         */

        System.out.println("Задача 6");
        int carCapacity = 102,
                sittingPlaces = 60,
                standingPlaces = carCapacity - sittingPlaces,
                soldTickets = 80;

        System.out.println("В этот вагон продано " + soldTickets + " билетов");
        if (soldTickets > carCapacity) {
            System.out.println("он битком наполнен пассажирами");
        } else if (soldTickets < sittingPlaces) {
            System.out.println(" есть свободные сидячие и стоячие места");
        } else if (soldTickets >= sittingPlaces && soldTickets < carCapacity) {
            System.out.println(" есть свободные стоячие места");
        } else {
            System.out.println(" свободных мест нет");
        }
        System.out.println(" ");

    }

        public static void task7 () {
            System.out.println("Задача 7");
            int     one = 31,
                    two = 40,
                    three = 30,
                    maximum = 0 ;

            if (one >= two) { maximum = one ; }
            else { maximum = two ; }
            if (maximum < three) { maximum = three ; }

            System.out.println("Наибольшее число равно " + maximum);
            System.out.println(" ");
        }

    }
