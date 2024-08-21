                package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        CarroFactory factory = new CarroFactory();
      
      
        ICarro porche = factory.setAirConditioning(true).setColor("Azul").setEngine("V8").setWheels(4).getCarro("manual");
        porche.prender();
        porche.arrancar();
        porche.detenerse();
        porche.apagar();
        System.out.println(porche);

        ICarro camaro = factory.setAirConditioning(true).setColor("Black").setEngine("V8").setWheels(4).getCarro("automatico");

        camaro.prender();
        camaro.arrancar();
        camaro.detenerse();
        camaro.apagar();
        System.out.println(camaro);
        
    }
}
