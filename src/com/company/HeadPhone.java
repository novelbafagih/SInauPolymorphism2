package com.company;

public class HeadPhone implements AudioJack,MicrophoneJack{
    private String nama;
    private int samplingFreqInKhz;
    private int soundInDb;

    public HeadPhone(String nama, int samplingFreqInKhz, int soundInDb) {
        this.nama = nama;
        this.samplingFreqInKhz = samplingFreqInKhz;
        this.soundInDb = soundInDb;
    }

    @Override
    public void menerimaSuara() {
        System.out.println("Keluarkan Suara Anda dengan mikrofon " + nama);
        System.out.println("Frekuensi " + samplingFreqInKhz + " KHZ");
    }

    @Override
    public void mengeluarkanSuara() {
        System.out.println("Suara keluar lewat speaker " + nama);
        System.out.println("Suara " + soundInDb + " DB");
    }
}
