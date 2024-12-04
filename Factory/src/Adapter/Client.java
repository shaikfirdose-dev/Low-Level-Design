package Adapter;

public class Client {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","jhalle.mp3");
        audioPlayer.play("mp4", "walmart.mp4");
        audioPlayer.play("vlc", "Avengers.vlc");
    }
}
