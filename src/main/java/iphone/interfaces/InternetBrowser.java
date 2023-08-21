package iphone.interfaces;

public interface InternetBrowser {
    public default void displayPage(){System.out.println("NAVIGATING THE INTERNET");}
    public default void addNewPage(){
        System.out.println("OPENING A NEW NAVIGATION PAGE");
    }
    public default void refreshPage(){
        System.out.println("RELOADING THE NAVIGATION PAGE");
    }
}
