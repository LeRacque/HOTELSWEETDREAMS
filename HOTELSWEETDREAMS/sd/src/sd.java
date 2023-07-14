import javax.swing.*;
import java.util.jar.JarEntry;

public class sd{
    public static void main(String[] args) {
        System.out.println("Log in");
        String nickname = JOptionPane.showInputDialog("Ingrese su usuario");
        String password = JOptionPane.showInputDialog("Ingrese su constraseña");
        System.out.println("Bienvenido a la plataforma "+nickname);
    }
}