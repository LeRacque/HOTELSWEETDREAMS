import javax.swing.*;

public class Boleta {
    public static  void main(String[] arStrings) {

        String nCliente = JOptionPane.showInputDialog("Ingrese su nombre");
        String nProducto = JOptionPane.showInputDialog("Ingresa el nombre del producto");
        String direccion = JOptionPane.showInputDialog("Ingresa su direccion");
        String numeroinicial = JOptionPane.showInputDialog("Ingresa su numero");
        Integer numerofinal = Integer.parseInt(numeroinicial);
        String maiz = "maiz";
        String pan = "pan";
        String papa = "papa";
        String tomate = "tomate";

        System.out.println("Nombre: " + nCliente);
        System.out.println("Direccion: " + direccion);
        System.out.println("Numero: " +numerofinal);

        if (nProducto.equals(maiz)) {
            System.out.println("El total es 5 PEN");
        }

        if (nProducto.equals(pan)) {
            System.out.println("El total es 2 PEN");
        }

        if (nProducto.equals(papa)) {
            System.out.println("El total es 6 PEN");
        }

        if (nProducto.equals(tomate)) {
            System.out.println("El total es 5 PEN");
        }

    }
}
