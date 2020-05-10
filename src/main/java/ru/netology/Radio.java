package ru.netology;

public class Radio {
    private int currentStation;
    private  int minStation;
    private int maxStation = 9;
    private int currentVolume;
    private int minVolume;
    private int maxVolume = 10;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation)
            return;
        if (currentStation < minStation)
            return;

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
        if (currentVolume > maxVolume)
            return;
        if (currentVolume < minVolume)
            return;

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
        int temp = currentStation + 1;
        if (temp > maxStation)
            this.currentStation = minStation;
        else
            this.currentStation = temp;
    }

    public void prevStation(){
        int temp = currentStation - 1;
        if (temp < minStation)
            this.currentStation = maxStation;
        else
            this.currentStation = temp;
    }

    public void increaseVolume(){
        int temp = currentVolume + 1;
        if (temp > maxVolume)
            return;

        currentVolume = temp;
    }

    public void decreaseVolume(){
        int temp = currentVolume - 1;
        if(temp < minVolume)
            return;

        currentVolume = temp;
    }
}
