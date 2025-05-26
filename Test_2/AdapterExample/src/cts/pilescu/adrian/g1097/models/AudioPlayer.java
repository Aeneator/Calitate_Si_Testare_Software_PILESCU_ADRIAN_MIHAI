package cts.pilescu.adrian.g1097.models;

public class AudioPlayer implements MediaPlayer{

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            AdvancedMediaPlayer advancedMediaPlayer = new AdvancedMediaPlayer();
            MediaPlayer adapter = new AdvancedMediaPlayerAdapter(advancedMediaPlayer);
            adapter.play(audioType,fileName);
        }else{
            System.out.println("Invalid media type: " + audioType );
        }
    }
}
