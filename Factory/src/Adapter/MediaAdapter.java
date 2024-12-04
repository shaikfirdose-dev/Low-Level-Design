package Adapter;

public class MediaAdapter implements MediaPlayer{
    private AdvancedMediaPlayed advancedMediaPlayer;

    public MediaAdapter(String fileType){
        if(fileType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }
        else if(fileType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }
    public void play(String fileType, String fileName){
        if(fileType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }
        else{
            advancedMediaPlayer.playMp4(fileName);
        }

    }
}
