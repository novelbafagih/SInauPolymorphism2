package com.company;

public class Speaker implements AudioJack{
    private String nama;
    private int soundInDb;

    public Speaker(String nama, int soundInDb) {
        this.nama = nama;
        this.soundInDb = soundInDb;
    }

    @Override
    public void mengeluarkanSuara() {
        System.out.println("Suara keluar lewat speaker " + nama);
        System.out.println("Suara " + soundInDb + " DB");
    }
}
