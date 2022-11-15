import javax.swing.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        int numero;
        long factorial = 1;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));

        for(int i =1; i<=numero; i++){
            factorial *= i; //Multipliciación iterativa
        }

        System.out.println("El factorial de " +numero+ " es " +factorial);
    }
}
