import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Radio {
    public int stationNumber;
    private int maxStationNumber = 9;
    private int minStationNumber = 0;

    private int quantityStationNumber = 10;


    public Radio() {
        this.maxStationNumber = 9;

    }

    public Radio(int quantityStationNumber) {
        this.maxStationNumber = quantityStationNumber - 1;

    }


    private int getQuantityStationNumber() {
        return quantityStationNumber;
    }

    private int getMaxStationNumber() {
        return maxStationNumber;
    }

    private int getMinStationNumber() {
        return minStationNumber;
    }


    public void next() {
        if (stationNumber != maxStationNumber) {
            stationNumber++;
        } else {
            stationNumber = 0;
        }


    }


    public void prev() {
        if (stationNumber != minStationNumber) {
            stationNumber--;
        } else {
            stationNumber = 9;
        }
    }


    public int getCurrentStationNumber() {
        return stationNumber;
    }

    public void setCurrentStationNumber(int stationNumber) {

        if (stationNumber > maxStationNumber) {
            return;
        }
        if (stationNumber < 0) {
            return;
        }
        this.stationNumber = stationNumber;


    }

    public int soundVolume;

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