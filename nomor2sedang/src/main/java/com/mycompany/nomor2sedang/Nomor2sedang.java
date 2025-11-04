/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nomor2sedang;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Nomor2sedang {

    


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MENGHITUNG VOLUME TABUNG ===");
        System.out.print("Masukkan jari-jari tabung (cm): ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double t = input.nextDouble();

        double volume = hitungVolumeTabung(r, t);
        System.out.println("Volume tabung = " + volume + " cm³");
    }
    public static double hitungVolumeTabung(double r, double t) {
        return Math.PI * r * r * t;
    }
}

