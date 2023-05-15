import javax.swing.JOptionPane;
public class solver {
    public static void main(String[] args){
        String stringtype = JOptionPane.showInputDialog("which type of equation you want to solve: \n" +
                "The first-degree equation with one variable: 1 \n" +
                "The system of first-degree equations (linear system) with two variables:2 \n" +
                "The second-degree equation with one variable: 3");
        int type = Integer.parseInt(stringtype);
        if (type == 1){
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter num1"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter num2"));
            JOptionPane.showMessageDialog(null,"the solution = " + (-num2/num1));
        } else if (type == 2) {
            double a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter a11"));
            double a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter a12"));
            double b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter b1"));
            double a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter a21"));
            double a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter a22"));
            double b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter b2"));
            double x1,x2;
            double D = a11* a22 - a21*a12;
            double D1 = b1*a22 -b2*a12;
            double D2= a11*b2 - a21*b1;
            if (D ==0 && (D1 != 0 || D2!=0)) {
                JOptionPane.showMessageDialog(null,"No solution");
            } else if (D==0 && D2 ==0 && D1 ==0) {
                JOptionPane.showMessageDialog(null,"Many solution");
            }else{
                x1 = D1/D;
                x2 = D2/D;
                JOptionPane.showMessageDialog(null,"the solution is x1,x2 = " +x1+ ", " + x2);
            }
        } else if (type ==3){
            double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a"));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b"));
            double c = Double.parseDouble(JOptionPane.showInputDialog("Enter c"));
            double delta = b*b -4*a*c;
            if (delta<0){
                JOptionPane.showMessageDialog(null,"No solution");
            } else if (delta ==0) {
                JOptionPane.showMessageDialog(null,"Solution = " + -b/(2*a));
            }else{
            double x1 = (-b +Math.sqrt(delta))/(2*a);
            double x2 = (-b -Math.sqrt(delta))/(2*a);
                JOptionPane.showMessageDialog(null,"solution = " + x1 + "and" + x2);
       }
    }System.exit(0);
}}
