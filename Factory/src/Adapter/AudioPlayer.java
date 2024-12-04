package Adapter;

public class AudioPlayer implements MediaPlayer{
    private MediaAdapter mediaAdapter;

    public void play(String fileType, String fileName){
        if(fileType.equalsIgnoreCase("mp3")){
            System.out.println("Mp3 File is Playing..."+fileName);
        }
        else if(fileType.equalsIgnoreCase("mp4") || fileType.equalsIgnoreCase("vlc")){
            mediaAdapter = new MediaAdapter(fileType);
            mediaAdapter.play(fileType, fileName);
        }
        else{
            System.out.println("Audio player of type "+fileType+" not supporting, please try again");
        }
    }
}
