import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void shouldSetNumberRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(7);

        int expected = 7;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaxRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(9);

        int expected = 9;
        int actual = rad.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);


    }


    @Test
    public void shouldSetMinRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(1);

        int expected = 1;
        int actual = rad.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldSetBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(-1);

        int expected = 0;
        int actual = rad.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldSetZero() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(0);

        int expected = 0;
        int actual = rad.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldSetAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(10);

        int expected = 0;
        int actual = rad.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldSetAboveMaxi() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(11);

        int expected = 0;
        int actual = rad.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);


    }


    @Test
    public void shouldSetSoundVolumeRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentSoundVolume(50);

        int expected = 50;
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaxSoundVolumeRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentSoundVolume(100);

        int expected = 100;
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinSoundVolumeRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentSoundVolume(1);

        int expected = 1;
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetBelowMinSoundVolumeRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentSoundVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetAboveMAxSoundVolumeRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentSoundVolume(101);

        int expected = 0;
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextNumberRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentStationNumber(4);

        rad.next();

        int expected = 5;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextMaxNumberRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentStationNumber(9);

        rad.next();

        int expected = 0;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextZeroNumberRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentStationNumber(0);

        rad.next();

        int expected = 1;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldSetPrevNumberRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentStationNumber(5);

        rad.prev();

        int expected = 4;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldSetPrevZeroNumberRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentStationNumber(0);

        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevOneNumberRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentStationNumber(1);

        rad.prev();

        int expected = 0;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetIncreaseSoundVolume() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSet50IncreaseSoundVolume() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(50);

        rad.increaseVolume();

        int expected = 51;
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetReduceSoundVolume() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(1);

        rad.reduceVolume();

        int expected = 0;
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetReduceZeroSoundVolume() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(0);

        rad.reduceVolume();

        int expected = 0;
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetReduceMaxSoundVolume() {
        Radio rad = new Radio();
        rad.setCurrentSoundVolume(100);

        rad.reduceVolume();

        int expected = 99;
        int actual = rad.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }
}
