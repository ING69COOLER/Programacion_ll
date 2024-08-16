package co.edu.uniquindio.poo;

public class WindowsFactory implements Ifactory {
    public IButton createButton(){
        return new WIndowsButton();
    }

    public ITextBox createTexBox() {
        return new WindowTextBox();
    }
}
