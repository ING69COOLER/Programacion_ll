package co.edu.uniquindio.poo;

public class Carro  implements ICarro{
    private String engine;
  
    private int wheels;
    private String transmission;
    private String color;
    private boolean airConditioning;


    public Carro(String engine,String transmission, int wheels, String color, boolean airConditioning) {
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
        this.color = color;
        this.airConditioning = airConditioning;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

   

    @Override
    public String toString() {
        return "Carro [engine=" + engine + ", wheels=" + wheels + ", transsmision=" + transmission + ", color=" + color
                + ", airConditioning=" + airConditioning + "]";
    }

    @Override
    public void prender() {
        System.out.println("BRUm bRUm");
    }

    @Override
    public void apagar() {
        System.out.println("EL carro se apago");
    }

    @Override
    public void arrancar() {
        System.out.println("El carro esta andando");
    }

    @Override
    public void detenerse() {
        System.out.println("El carro se ha detenido");
    }
}


