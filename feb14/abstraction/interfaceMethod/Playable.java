package feb14.interfaceMethod;

interface Playable1 {
    void play();
    void pause();
}

class MusicPlayer implements Playable1 {
    String name;

    public MusicPlayer(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(this.name + " is now playing.");
    }

    @Override
    public void pause() {
        System.out.println(this.name + " is paused.");
    }
}

public class Playable extends MusicPlayer{
    public Playable(String name) {
        super(name);
    }

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer("Spotify");

        player.play();
        player.pause();
    }
}
