package liskovSubstitutionPrinciple;

import java.util.ArrayList;
import java.util.List;

public class ClientTestProgram {
    public static void main(String[] args) {

        List<VideoMediaPlayer> allPlayers = new ArrayList<VideoMediaPlayer>();
        allPlayers.add(new VlcMediaPlayer());
        allPlayers.add(new DivMediaPlayer());

        playVideoInAllMediaPlayers(allPlayers);

        System.out.println("---------------------------");

    }

    /**
     * This method is playing video in all players
     *
     * @param allPlayers
     */
    public static void playVideoInAllMediaPlayers(List<VideoMediaPlayer> allPlayers) {

        for (VideoMediaPlayer player : allPlayers) {
            player.playVideo();
        }
    }
}
