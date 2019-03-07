package pkg5ejercicios.vectores;
/**
 * ejercicios de cadenas de caracteres
 * materia: programacion 1
 * author: Luis Eduardo Ocampo Wilches
 */
import javax.swing.JOptionPane;
import palabras.palabras;
import recurcividad.recurcividad;
import vectores.vectores;
public class Vectores {
    
    public static void main(String[] args) {
        double[] x;
        System.out.println(recurcividad.divicionentera(7, 8)+"."+recurcividad.residuodivicion(7, 8));
        x=vectores.lectura();
        System.out.println(recurcividad.sumatoriaelementos(x)+"-----"+recurcividad.multimplicarelementos(x));
        System.out.println(recurcividad.sumatoria(10)+"."+recurcividad.producto(3, 2));
        
    }        
}
