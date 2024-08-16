package co.edu.uniquindio.poo;

public class Email implements IINotification{

    @Override
    public void send_notification() {
       System.out.println("Sending Email notification");
    }

}
