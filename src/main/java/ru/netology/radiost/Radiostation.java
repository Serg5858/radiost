package ru.netology.radiost;

public class Radiostation {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxStation() {
        currentStation = 9;
    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public void increaseStation() {
        if (currentStation ==9) {
            currentStation = 0;
        }
        else {currentStation++;
        }
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;

        }
    }


    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;

        }
    }


    public void belowVolumeToMax() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
    }
}
