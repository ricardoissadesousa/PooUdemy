package introducaoPoo.application;


import introducaoPoo.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x , y;
        x = new Triangle();
        y = new Triangle();


        System.out.println("Enter the measures of triangule X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangule Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triangle X area %.4f%n", areaX);
        System.out.printf("Triangle Y area %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Large area X: " + areaX);
        } else {
            System.out.println("Large area Y: " + areaY);
        }

    }
}