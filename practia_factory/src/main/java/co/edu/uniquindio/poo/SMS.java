package co.edu.uniquindio.poo;

public class SMS implements IINotification{

    @Override
    public void send_notification() {
        System.out.println("Sending an SMS notification");
    }

}
