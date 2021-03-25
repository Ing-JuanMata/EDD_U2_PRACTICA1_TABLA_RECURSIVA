/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ING-JUANMATA
 */
public class Tabla {

    private static int sum = 0;
    private static int i = 0;

    public Tabla() {
    }

    public void reiniciarTabla() {
        sum = 0;
        i = 0;
    }

    public String Tabla(int n) {
        String r = n + " X " + (i + 1) + " = " + (sum + n) + "\n";
        i++;
        sum += n;

        return (i == 10) ? r : r + Tabla(n);
    }
}
