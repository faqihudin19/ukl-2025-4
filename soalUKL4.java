package soal2;

import java.util.Scanner;

public class soalUKL4 {
    public static double hitungVolume(double radius, double tinggi) {
        final double PI = 3.14159;
        return PI * radius * radius * tinggi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari tabung: ");
        double r = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double h = scanner.nextDouble();
        
        double volume = hitungVolume(r, h);
        System.out.println("Volume tabung adalah " + volume);
        scanner.close();
    }
}