package co.edu.uniquindio.poo;


public class UIfactory  {
 
    public static Object createButton(String os){
    if ( os.equals( "windows")){
        return new WIndowsButton();
    }else if (os.equals("mac")){
        return new MacButton();
    }else{
        throw new IllegalArgumentException("OS no existe");
    }
   }

   public static Object crearText(String os){
    if ( os.equals("windows")){
        return new WindowTextBox();
    }else if (os.equals("mac")){
        return new MacTextBox();
    }else{
        throw new IllegalArgumentException("OS no existe");
    }
   }
}
