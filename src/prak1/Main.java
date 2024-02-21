package prak1;

import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        IntegerComparator integerComparator = new IntegerComparator();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(integerComparator.compare(a, b));
    }
}
