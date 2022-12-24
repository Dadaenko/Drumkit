package com.company;

public class Main {

    public class DrumKitTestDrive {
        public void main(String[] args) {

            DrumKit d = new DrumKit();
            d.playSnare();
            d.snare = false;
            d.playTopHat();

            if (d.snare == true) {
                d.playSnare();
            }
        }
    }
}
