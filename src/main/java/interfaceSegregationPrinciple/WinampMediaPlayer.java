package interfaceSegregationPrinciple;

public class WinampMediaPlayer implements AudioMediaPlayer {
    @Override
    public void playAudio() {
        System.out.println(" Playing audio........");
    }
}
