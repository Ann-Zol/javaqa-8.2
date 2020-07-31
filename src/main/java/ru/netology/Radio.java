package ru.netology;

public class Radio {
    private int currentStation;
    private  int minStation;
    private int maxStation;
    private int currentVolume;
    private int minVolume;
    private int maxVolume;

    public Radio() {
        this.maxStation = 10;
        this.minStation = 0;
        this.minVolume = 0;
        this.maxVolume = 100;
        this.currentVolume = 0;
        this.currentStation = 0;
    }

    public Radio(int station){
        this.maxStation = station;
        this.maxVolume = 100;
        this.minStation = 0;
        this.minVolume = 0;
        this.currentVolume = 0;
        this.currentStation = 0;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation){
            return;
        }
        if (currentStation < minStation){
            return;
        }

        this.currentStation = currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume){
            return;
        }
        if (currentVolume < minVolume){
            return;
        }

        this.currentVolume = currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void nextStation(){
        if (this.currentStation >= maxStation){
            this.currentStation = minStation;
        }
        else{
            this.currentStation ++;
        }
    }

    public void prevStation(){
        if (currentStation <= minStation){
            this.currentStation = maxStation;
        }
        else{
            this.currentStation --;
        }
    }

    public void increaseVolume(){
        if (currentVolume >= maxVolume){
            return;
        }
        
        currentVolume ++;
    }

    public void decreaseVolume(){
        if(currentVolume <= minVolume){
            return;
        }

        currentVolume --;
    }
}
