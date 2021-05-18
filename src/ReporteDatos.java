
import javax.swing.JOptionPane;

public class ReporteDatos extends Estadistica{

    public ReporteDatos(double[] Cal, int num) {
        super(Cal, num);
    }
    public void Mostrar_Reporte() {      
        Ordenar();
        JOptionPane.showMessageDialog(null, "Reporte de Datos \n La mayor calificación es " + Cal[num-1] + "\n La menor calificación es " + Cal[0]);     
    }
    public double CalMa(){
        Ordenar();
        double calMa = Cal[num-1];
        return calMa;
   }
    public double Calme(){
        Ordenar();
        double calme = Cal[0];
        return calme;
   }
}
