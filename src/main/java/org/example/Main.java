package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int km;
        double perKm = 2.20, total, acilisucreti = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen Mesafe : ");
        km = input.nextInt();

        total = (km * perKm) + acilisucreti;

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar : " + total);






    }
}