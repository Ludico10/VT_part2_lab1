import fundamentalClasses.Task1.Formula;
import fundamentalClasses.Task2.Region;
import fundamentalClasses.Task3.TgRange;
import fundamentalClasses.Task4.SimpleArray;
import fundamentalClasses.Task5.TableIncreaseCleaner;
import fundamentalClasses.Task6.Matrix;
import fundamentalClasses.Task7.Shellsort;
import fundamentalClasses.Task8.Increase;
import objectClasses.Task12.Book;
import objectClasses.Task13.ProgrammerBook;
import objectClasses.Task15.AuthorComparator;
import objectClasses.Task15.PriceComparator;
import objectClasses.Task15.TitleComparator;
import objectClasses.Task9.Ball;
import objectClasses.Task9.Basket;
import objectClasses.Task9.Color;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

    public class Main {
        private static void Config(Comparator<Book> bookComparator) {

            TreeSet<Book> bookSet = new TreeSet<>(bookComparator);
            bookSet.add(new Book("Name1", "Author1", 1, 2, 3));
            bookSet.add(new Book("Name4", "Author2", 154, 4, 1));
            bookSet.add(new Book("Name3", "Author4", 156, 3, 2));
            bookSet.add(new Book("Name2", "Author4", 127, 1, 4));
            bookSet.forEach(System.out::println);
            System.out.println("-------------------------------------------------------------------------------");
        }

        public static void main(String[] args) {
            System.out.println("--------------------------------------TASK 1-----------------------------------------");
            System.out.println(Formula.calculate(9.99, 20.22));

            System.out.println("--------------------------------------TASK 2-----------------------------------------");
            System.out.println(Region.inside(4, -4));

            System.out.println("--------------------------------------TASK 3-----------------------------------------");
            System.out.println("X     :     Y");
            var map = TgRange.createTable(1, 9, 0.7);
            map.forEach((k, v) -> System.out.println(k + " : " + v));

            System.out.println("--------------------------------------TASK 4-----------------------------------------");
            var listPositions = SimpleArray.PrimesSearch(new int[]{-1, 5, 3, 2, 4, 9, 111, 20});
            if (listPositions.isEmpty())
                System.out.println("No prime numbers");
            else {
                System.out.println("Positions: ");
                listPositions.forEach(index -> System.out.print(index + " "));
            }
            System.out.println();

            System.out.println("--------------------------------------TASK 5-----------------------------------------");
            System.out.println("Exclude " + TableIncreaseCleaner.longest(new int[]{5, 2, 6, 9, 22, 7, 17, 28, 9, 16}, 10) + " elements");

            System.out.println("--------------------------------------TASK 6-----------------------------------------");
            var matrix = Matrix.transform(new double[]{5, 3, 2, 4, 9, 111, 20});
            for (var item : matrix) {
                System.out.println(Arrays.toString(item));
            }

            System.out.println("--------------------------------------TASK 7-----------------------------------------");
            var arr = new double[]{5, -7, 99, 111, 21, 5, -5, 20, 99, 31, 82, 15, -3};
            Shellsort.sort(arr);
            System.out.println("Sort :" + Arrays.toString(arr));

            System.out.println("--------------------------------------TASK 8-----------------------------------------");
            System.out.println("Positions to insert elements of the 2nd sequence into the 1st: ");
            var arrPos = Increase.positions(new double[]{2, 3, 8, 8, 17, 42, 111, 200}, new double[]{3, 5, 7, 11, 13, 17, 19, 23, 100});
            arrPos.forEach(value -> System.out.print(value + " "));
            System.out.println();

            System.out.println("--------------------------------------TASK 9-----------------------------------------");
            var balls = new Ball[]{
                    new Ball(Color.BLUE, 4.2),
                    new Ball(Color.RED, 1.1),
                    new Ball(Color.YELLOW, 2.1),
                    new Ball(Color.GREEN, 9.6),
                    new Ball(Color.PURPLE, 11)};

            var basket = new Basket(balls);
            System.out.println("Weight: " + basket.getTotalWeight() + " BlueCount: " + basket.getCountOfColor(Color.BLUE));

            System.out.println("--------------------------------------TASK 12----------------------------------------");
            Book book1 = new Book("Name1", "Author1", 42, 5);
            Book book2 = new Book("Name2", "Author2", 42, 1);
            Book book3 = new Book("Name3", "Author3", 21, 5);
            System.out.println(book1.equals(book2));
            System.out.println(book1.equals(book3));
            System.out.println(book3.hashCode());
            System.out.println(book2.hashCode());
            System.out.println(book1);

            System.out.println("--------------------------------------TASK 13----------------------------------------");
            Book programmerBook1 = new ProgrammerBook("en", 3);
            Book programmerBook2 = new ProgrammerBook("ru", 3);
            Book programmerBook3 = new ProgrammerBook("en", 1);
            System.out.println(programmerBook1.equals(programmerBook2));
            System.out.println(programmerBook3.equals(programmerBook1));
            System.out.println(programmerBook3.hashCode());
            System.out.println(programmerBook1.hashCode());
            System.out.println(programmerBook2);

            System.out.println("--------------------------------------TASK 15----------------------------------------");
            Config(null);

            System.out.println("--------------------------------------TASK 16 ---------------------------------------");
            System.out.println("Sort by Title: ");
            Config(new TitleComparator());
            System.out.println("Sort by Title -> Author: ");
            Config(new TitleComparator().thenComparing(new AuthorComparator()));
            System.out.println("Sort by Author -> Title: ");
            Config(new AuthorComparator().thenComparing(new TitleComparator()));
            System.out.println("Sort by Author->Title->Price: ");
            Config(new AuthorComparator().thenComparing(new TitleComparator()).thenComparing(new PriceComparator()));
        }
    }