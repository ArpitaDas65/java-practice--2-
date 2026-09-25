import javax.swing.JOptionPane;
public class JOptionPaneDemo {
    public static void main(String[] args) {
        String name =JOptionPane.showInputDialog("enter your name:");

        String ageInput=JOptionPane.showInputDialog("enter your age:");

        int age=Integer.parseInt(ageInput);

        JOptionPane.showMessageDialog(null,
            "name:"+name+"\n age:"+age
        );

    }
    
}
