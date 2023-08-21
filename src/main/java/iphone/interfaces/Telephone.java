package iphone.interfaces;

public interface Telephone {
    public default void powerTelephone(){System.out.println("STARTING THE CELL PHONE");}
    public default void makePhoneCall(){
        System.out.println("MAKING A CALL WITH THE CELL PHONE");
    }
    public default void startVoiceEmail(){
        System.out.println("STARTING EMAIL");
    }
}
