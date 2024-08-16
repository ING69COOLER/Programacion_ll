package co.edu.uniquindio.poo;

public class MacFactory  implements Ifactory{

    @Override
    public IButton createButton() {
       return new MacButton();
    }

    @Override
    public ITextBox createTexBox() {
       return new MacTextBox();
    }

}
