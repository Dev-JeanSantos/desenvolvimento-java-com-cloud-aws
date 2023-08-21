import iphone.entities.Iphone;

public class Run {
    public static void main(String[] args) {
        Iphone myIphone = new Iphone();
        System.out.println("*********METHODS CALL PLAY MUSIC*********");
        myIphone.playMusic();
        myIphone.pauseMusic();
        myIphone.selectMusic();

        System.out.println("*********METHODS CALL TELEPHONE*********" );
        myIphone.powerTelephone();
        myIphone.makePhoneCall();
        myIphone.startVoiceEmail();

        System.out.println("*********METHODS CALL INTERNET BROWSER*********");
        myIphone.displayPage();
        myIphone.addNewPage();
        myIphone.refreshPage();
    }
}
