package co.edu.uniquindio.poo;



public class NotificationFactory {
    
    
    public IINotification getNotification(String type) {
    type = type.toLowerCase(); // Asignar el resultado a 'type'
    switch (type) {
        case "email":
            return new Email();
            
        case "sms":
            return new SMS();
            
        default:
            System.out.println("No es ninguno de los casos");
            return null; // Retornar null o lanzar una excepción, dependiendo de tu lógica
    }
}

}
