public class Radio {
    private int stationNumber;
    private int soundVolume;


    public void next() {
        if (stationNumber != 9) {
            stationNumber++;
        } else {
            stationNumber = 0;
        }


    }


    public void prev() {
        if (stationNumber != 0) {
            stationNumber--;
        } else {
            stationNumber = 9;
        }
    }


    public int getCurrentStationNumber() {
        return stationNumber;
    }

    public void setCurrentStationNumber(int stationNumber) {

        if (stationNumber > 9) {
            return;
        }
        if (stationNumber < 0) {
            return;
        }
        this.stationNumber = stationNumber;


    }

    public void increaseVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        } else {
            soundVolume = 100;
        }
    }

    public void reduceVolume() {
        if (soundVolume > 1) {
            soundVolume = soundVolume - 1;
        } else {
            soundVolume = 0;
        }
    }

    public int getCurrentSoundVolume() {
        return soundVolume;
    }

    public void setCurrentSoundVolume(int soundVolume) {

        if (soundVolume > 100) {
            return;
        }
        if (soundVolume < 0) {
            return;
        }
        this.soundVolume = soundVolume;
    }

}