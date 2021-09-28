package Assignment

public class volume{
    private int volume = 5;

    public void increaseVolume(int volume) {
        if(volume > 100);
        volume= 100;
    } else{
        volume = volume + 5;
    }

    public void decreaseVolume(int volume) {
        if(volume < 0);
        volume= 0;
    } else{
        volume = volume - 5;
    }


    public int getVolume() {
        return volume;
    }
}