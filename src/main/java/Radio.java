public class Radio {
    private int station;
    private int volume;


    public int getStation() {

        return station;
    }

    public void setStation(int station) {
        if (station < 0) {
            return;
        }
        if (station > 9) {
            return;
        }
        this.station = station;
    }

    public int getVolume() {

        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        this.volume = volume;
    }

    public void nextStation() {
        if (station < 9) {
            station++;
        } else {
            station = 0;
        }
    }

    public void nextVolume() {
        if (volume < 100) {
            volume++;
        } else {
            volume = 0;
        }
    }

    public void prevStation() {
        if (station > 0) {
            station--;
        } else {
            station = 9;
        }
    }

    public void prevVolume() {
        if (volume > 0) {
            volume--;
        } else {
            volume = 100;
        }
    }

}