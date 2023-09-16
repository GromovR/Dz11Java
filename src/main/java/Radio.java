public class Radio {
    private int station;
    private int volume;
    private int maxStation;


    public Radio() {
        this.maxStation = 9;

    }

    public Radio(int quantitiStation) {

        this.maxStation = quantitiStation;
    }


    public int getStation() {

        return station;
    }

    public void setStation(int station) {
        if (station < 0) {
            return;
        }
        if (station > maxStation) {
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
        if (station < maxStation) {
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
            station = maxStation;
        }
    }

    public void prevVolume() {
        if (volume > 0) {
            volume--;
        } else {
            volume = 100;
        }
    }

    public void nextVolume2() {
        if (volume < 100) {
            volume++;
        } else {
            volume = 100;
        }
    }

    public void prevVolume2() {
        if (volume > 0) {
            volume--;
        } else {
            volume = 0;
        }
    }
}