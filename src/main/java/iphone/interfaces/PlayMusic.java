package iphone.interfaces;

public interface PlayMusic {
    public default void playMusic(){System.out.println("PLAYING SONGS");}
    public default void pauseMusic(){System.out.println("PAUSING SONGS");}
    public default void selectMusic(){System.out.println("SELECTING SONGS");}
}
