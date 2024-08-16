package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
       
        NotificationFactory notification = new NotificationFactory();
        IINotification email = notification.getNotification("sms");
        IINotification sms = notification.getNotification("Email");
        IINotification mensaje = notification.getNotification("whatssap");


        email.send_notification();
        sms.send_notification();
        mensaje.send_notification();

        



        
    }
}
