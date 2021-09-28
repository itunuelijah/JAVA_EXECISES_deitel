package Assignment;

public class MusicState {
    private boolean playMusic;
    private boolean pauseMusic;
    private int nextMusic = 1;
    private int previousMusic = -1;
    private int playRandom;

    public void setNextMusic(int nextMusic) {
        if(nextMusic > 1);
        nextMusic = nextMusic + 1;
    }

    public int getNextMusic() {
        return nextMusic;
    }

    public void setPreviousMusic(int previousMusic) {
        if(nextMusic < 1);
        nextMusic = nextMusic - 1;
    }



    public int getPreviousMusic() {
        return previousMusic;
    }
}