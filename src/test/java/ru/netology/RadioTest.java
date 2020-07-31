package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'stationBetweenMaxAndMin', 2, 2",
                    "'stationEqualMax', 10, 10",
                    "'stationEqualMin', 0, 0",
                    "'stationOverMax', 100, 0",
                    "'stationLessMin', -100, 0"
            }
    )
    void shouldSetCurrentStation(String test, int currentStation, int expected) {
        Radio tempRadio = new Radio();
        tempRadio.setCurrentStation(currentStation);
        assertEquals(tempRadio.getCurrentStation(), expected);
    }

    @Test
    void shouldCreateRadioWithChooseCountStation(int countStation) {
        Radio tempRadio = new Radio(countStation);

        assertEquals(tempRadio.getMaxStation(), countStation);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'volumeBetweenMaxAndMin', 5, 5",
                    "'volumeEqualMax', 100, 100",
                    "'volumeEqualMin', 0, 0",
                    "'volumeOverMax', 1000, 0",
                    "'volumeLessMin', -100, 0"
            }
    )
    void shouldSetCurrentVolume(String test, int currentVolume, int expected) {
        Radio tempRadio = new Radio();
        tempRadio.setCurrentVolume(currentVolume);
        assertEquals(tempRadio.getCurrentVolume(), expected);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'nextStationBetweenMaxAndMin', 2, 3",
                    "'nextStationEqualMax', 10, 0"
            }
    )
    void shouldNextStation(String test, int currentStation, int expected) {
        Radio tempRadio = new Radio();
        tempRadio.setCurrentStation(currentStation);
        tempRadio.nextStation();
        assertEquals(tempRadio.getCurrentStation(), expected);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'prevStationBetweenMaxAndMin', 4, 3",
                    "'prevStationLessMin', 0, 10"
            }
    )
    void shouldPrevStation(String test, int currentStation, int expected) {
        Radio tempRadio = new Radio();
        tempRadio.setCurrentStation(currentStation);
        tempRadio.prevStation();
        assertEquals(tempRadio.getCurrentStation(), expected);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'increaseVolumeBetweenMaxAndMin', 4, 5",
                    "'increaseVolumeEqualMax', 99, 100",
                    "'increaseVolumeOverMax', 100, 100"
            }
    )
    void shouldIncreaseVolume(String test, int currentVolume, int expected) {
        Radio tempRadio = new Radio();
        tempRadio.setCurrentVolume(currentVolume);
        tempRadio.increaseVolume();
        assertEquals(tempRadio.getCurrentVolume(), expected);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'decreaseVolumeBetweenMaxAndMin', 6, 5",
                    "'decreaseVolumeEqualMin', 1, 0",
                    "'decreaseVolumeLessMin', 0, 0"
            }
    )
    void shouldDecreaseVolume(String test, int currentVolume, int expected) {
        Radio tempRadio = new Radio();
        tempRadio.setCurrentVolume(currentVolume);
        tempRadio.decreaseVolume();
        assertEquals(tempRadio.getCurrentVolume(), expected);
    }
}