package practice.extra;
interface a{
    void bored();
    void letsplay();
}

class b implements a{
    @Override
    public void bored() {
        System.out.println("just sleep lol");
    }

    @Override
    public void letsplay() {
        System.out.println("wat do we play");
    }
}
public class Idk {
    public static void main(String[] args) {
        b n=new b();
        n.bored();
        n.letsplay();
    }
}
