package ru.netology.radiost;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadiostationTest {
    @Test
    public void shouldSetStation() {
        Radiostation radiostation = new Radiostation();
        radiostation.currentStation = 5;
        int expected = 5;
        int actual = radiostation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationOfMaxBorder() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentStation(9);
        radiostation.increaseStation();
        int expected = 0;
        int actual = radiostation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationBelowMax() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentStation(2);
        radiostation.increaseStation();
        int expected = 3;
        int actual = radiostation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifCurrentStationLessThanZero() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentStation(-1);
        int expected = 0;
        int actual = radiostation.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifCurrentStationMoreThanNine() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentStation(11);
        int expected = 0;
        int actual = radiostation.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void buttonPrevStation() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentStation(2);
        radiostation.prevStation();
        int expected = 1;
        int actual = radiostation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonPrevFromZero() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentStation(0);
        radiostation.prevStation();
        int expected = 9;
        int actual = radiostation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationOfLowerBorder() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentStation(0);
        radiostation.increaseStation();
        int expected = 1;
        int actual = radiostation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationMax() {
        Radiostation radiostation = new Radiostation();
        radiostation.setToMaxStation();
        int expected = 9;
        int actual = radiostation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifCurrentVolumeLessThanZero() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentVolume(-1);
        int expected = 0;
        int actual = radiostation.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifCurrentVolumeMoreThanTen() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentVolume(12);
        int expected = 0;
        int actual = radiostation.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeMax() {
        Radiostation radiostation = new Radiostation();
        radiostation.setToMaxVolume();
        int expected = 10;
        int actual = radiostation.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeBelowMax() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentVolume(2);
        radiostation.increaseVolume();
        int expected = 3;
        int actual = radiostation.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpToMax() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentVolume(10);
        radiostation.increaseVolume();
        int expected = 10;
        int actual = radiostation.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void buttonPrevVolume() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentVolume(5);
        radiostation.belowVolumeToMax();
        int expected = 4;
        int actual = radiostation.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonPrevVolumeFromZero() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentVolume(0);
        radiostation.belowVolumeToMax();
        int expected = 0;
        int actual = radiostation.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonPrevVolumeFromLowerBorder() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentVolume(1);
        radiostation.belowVolumeToMax();
        int expected = 0;
        int actual = radiostation.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonPrevVolumeFromUpperBorder() {
        Radiostation radiostation = new Radiostation();
        radiostation.setCurrentVolume(10);
        radiostation.belowVolumeToMax();
        int expected = 9;
        int actual = radiostation.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
