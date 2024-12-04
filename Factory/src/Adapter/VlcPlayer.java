package Adapter;

public class VlcPlayer implements AdvancedMediaPlayed{
    @Override
    public void playMp4(String fileName) {
        //do nothing
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("Vcl player is playing of file: "+fileName);
    }
}
