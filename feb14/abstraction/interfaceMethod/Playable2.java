package feb14.interfaceMethod;

interface playables {
    void play();
    void pause();
    void stop();
}

class MP3player implements playables{

    @Override
    public void play() {
        System.out.println("play the mp3player");
    }

    @Override
    public void pause() {
        System.out.println("pause the mp3player");
    }

    @Override
    public void stop() {
        System.out.println("stop the mp3player");
    }
}

class CDPlayer implements playables{

    @Override
    public void play() {
        System.out.println("play the cdplayer");
    }

    @Override
    public void pause() {
        System.out.println("pause the cdplayer");
    }

    @Override
    public void stop() {
        System.out.println("stop the cdplayer");
    }
}

public class Playable2 {
    public static void main(String[] args) {
        MP3player m3=new MP3player();
        CDPlayer cd=new CDPlayer();
        m3.play();
        m3.pause();
        m3.stop();
        cd.play();
        cd.pause();
        cd.stop();

    }
}
