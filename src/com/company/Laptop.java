package com.company;

public class Laptop {
    private boolean nyala;

    public Laptop(){
        nyala = false;
    }

    public void nyalakan(){
        nyala = true;
        System.out.println("Laptop Menyala...");
    }

    public void masukkanMikrofon(MicrophoneJack microphone){
        if(!nyala){
            System.out.println("nyalakan Laptop terlebih dahulu");
            return;
        }
        System.out.println("Mikrophone Diterima");
        microphone.menerimaSuara();
    }

    public void masukkanAudio(AudioJack audio){
        if(!nyala){
            System.out.println("nyalakan Laptop");
            return;
        }
        System.out.println("Audio Diterima");
        audio.mengeluarkanSuara();
    }
}
