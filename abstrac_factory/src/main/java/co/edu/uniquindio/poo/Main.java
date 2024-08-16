package co.edu.uniquindio.poo;

public class Main {
    public static void main(String[] args) {
      Ifactory WindowsFactory = new WindowsFactory();
      IButton button = WindowsFactory.createButton();
      ITextBox textBox = WindowsFactory.createTexBox();

      button.mostrar();
      textBox.mostrar();

      Ifactory MacFactory = new MacFactory();
      IButton buttonMac = MacFactory.createButton();
      ITextBox textBoxMac = MacFactory.createTexBox();

      buttonMac.mostrar();
      textBoxMac.mostrar();
}
}