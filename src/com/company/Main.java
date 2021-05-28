package com.company;

public class Main {

    public static void main(String[] args) {
        Laptop lenovi = new Laptop();

        Microphone sonyc = new Microphone("a6000 sonyc",50);
        Speaker xiomay = new Speaker("300b xiomay",50);
        HeadPhone rajer = new HeadPhone("Kraken rajer", 3,30);

        lenovi.nyalakan();
        System.out.println();
        lenovi.masukkanAudio(xiomay);
        System.out.println();
        lenovi.masukkanMikrofon(sonyc);
        System.out.println();
        lenovi.masukkanMikrofon(rajer);
        lenovi.masukkanAudio(rajer);

    }
}
