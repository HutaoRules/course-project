import javax.swing.JOptionPane;
public class mathwithdouble {
    public static void main(String[] args){
        String strnum1 = JOptionPane.showInputDialog("Enter num1");
        String strnum2 = JOptionPane.showInputDialog("Enter num2");
        double num1 = Double.parseDouble(strnum1);
        double num2 = Double.parseDouble(strnum2);
        JOptionPane.showMessageDialog(null,"sum =" + (num1+num2));
        JOptionPane.showMessageDialog(null,"difference=" + (num1 -num2));
        JOptionPane.showMessageDialog(null, "product = " + (num1*num2));
        JOptionPane.showMessageDialog(null, "quotient = " +(num1/num2));
        System.exit(0);
    }
}
