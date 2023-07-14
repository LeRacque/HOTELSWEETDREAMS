import javax.swing.*;

public class compras {
    public static void main(String[] args) {
        System.out.println("Las habitaciones disponibles son: \n" +
                           "A-101 con el costo de 100 S/. por noche \n" +
                           "A-102 con el costo de 100 S/. por noche \n" +
                           "A-103 con el costo de 100 S/. por noche \n" +
                           "A-204 con el costo de 100 S/. por noche \n" +
                           "A-702 con el costo de 240 S/. por noche \n" +
                           "A-907 con el costo de 300 S/. por noche");
        String habitacionElegida = JOptionPane.showInputDialog("Elija cual habitación tomará");
        System.out.println("Felicitaciones ha hecho compra de la habitación"+habitacionElegida);
    }
}
