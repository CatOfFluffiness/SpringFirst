package org.example;

public class MusicPlayer {

    private Music music;

    //InversionOfControl - инверсия управления
    public MusicPlayer(Music music) {this.music = music;}

    public void playMusic (){
        System.out.println("Playing: " + music.getSong());
    }
}
