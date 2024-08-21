package co.edu.uniquindio.poo;

public class CarroFactory  {
    
    private String engine;
    private String transmission;
    private int wheels;
    private String color;
    private boolean airConditioning;
   
    public  ICarro getCarro(String type){
        type = type.toLowerCase();
        switch (type) {
            case "automatico":
            return new CarroAutomatico(this.engine, type, this.wheels, this.color, this.airConditioning);
            
                
            case "manual":
                return new CarroManual(this.engine, type, this.wheels, this.color, this.airConditioning);
                
            default:
                System.out.println("No es ninguno de ltype castype");
                return null; // Retornar null o lanzar una excepción, dependiendo de tu lógica
        }
       }
    

    public CarroFactory setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarroFactory setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarroFactory setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    public CarroFactory setColor(String color) {
        this.color = color;
        return this;
    }

    public CarroFactory setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
        return this;
    }
       
}
