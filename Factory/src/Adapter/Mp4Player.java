package Adapter;

public class Mp4Player implements AdvancedMediaPlayed{

    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4 is playing of name: "+fileName);
    }

    @Override
    public void playVlc(String fileName) {
        //do nothing
    }
}
