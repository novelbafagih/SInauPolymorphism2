package com.company;

public class Microphone implements MicrophoneJack{
    private final String nama;
    private final int samplingFreqInKhz;

    public Microphone(String nama, int samplingFreqInKhz) {
        this.nama = nama;
        this.samplingFreqInKhz = samplingFreqInKhz;
    }

    @Override
    public void menerimaSuara() {
        System.out.println("Keluarkan Suara Anda dengan mikrofon " + nama);
        System.out.println("Frekuensi " + samplingFreqInKhz + " KHZ");
    }
}
