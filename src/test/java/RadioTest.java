import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void MaxStation() {
        Radio radio = new Radio();

        radio.setStation(9);

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinStation() {
        Radio radio = new Radio();

        radio.setStation(9);
        radio.setStation(0);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void centerStation() {
        Radio radio = new Radio();

        radio.setStation(5);

        int expected = 5;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusStation() {
        Radio radio = new Radio();

        radio.setStation(-1);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SmaxStation() {
        Radio radio = new Radio();

        radio.setStation(10);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxVolume() {
        Radio radio = new Radio();

        radio.setVolume(100);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinVolume() {
        Radio radio = new Radio();

        radio.setVolume(100);
        radio.setVolume(0);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void centerVolume() {
        Radio radio = new Radio();

        radio.setVolume(50);

        int expected = 50;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolume() {
        Radio radio = new Radio();

        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusmaxVolume() {
        Radio radio = new Radio();

        radio.setVolume(101);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinNextStation() {
        Radio radio = new Radio();

        radio.setStation(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextStation() {
        Radio radio = new Radio();

        radio.setStation(4);
        radio.nextStation();

        int expected = 5;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextEndStation() {
        Radio radio = new Radio();

        radio.setStation(8);
        radio.nextStation();

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextMaxStation() {
        Radio radio = new Radio();

        radio.setStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinNextVolume() {
        Radio radio = new Radio();

        radio.setVolume(0);
        radio.nextVolume();

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextVolume() {
        Radio radio = new Radio();

        radio.setVolume(49);
        radio.nextVolume();

        int expected = 50;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextOneVolume() {
        Radio radio = new Radio();

        radio.setVolume(99);
        radio.nextVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextMaxVolume() {
        Radio radio = new Radio();

        radio.setVolume(100);
        radio.nextVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinPrevStation() {
        Radio radio = new Radio();

        radio.setStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();

        radio.setStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevEndStation() {
        Radio radio = new Radio();

        radio.setStation(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevStation() {
        Radio radio = new Radio();

        radio.setStation(5);
        radio.prevStation();

        int expected = 4;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinPrevVolume() {
        Radio radio = new Radio();

        radio.setVolume(1);
        radio.prevVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevVolume() {
        Radio radio = new Radio();

        radio.setVolume(50);
        radio.prevVolume();

        int expected = 49;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevOneVolume() {
        Radio radio = new Radio();

        radio.setVolume(100);
        radio.prevVolume();

        int expected = 99;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevMinVolume() {
        Radio radio = new Radio();

        radio.setVolume(0);
        radio.prevVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}
