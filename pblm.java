interface camera {
    void clickphoto();
}
interface musicplayer {
    void playmusic();
}
class smartphone implements camera,musicplayer
{
    public void clickphoto()
    {
        System.out.println("Photo is clicked");
    }
    public void playmusic()
    {
        System.out.println("Music is playing");
    }
}
public class pblm {
    public static void main(String[] args) {
        smartphone s=new smartphone();
        s.clickphoto();
        s.playmusic();
    }
}