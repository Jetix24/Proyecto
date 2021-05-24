


import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager; 

public class Alumnos {
      private String[] Nom;
      double[] Cal;
      private long[] Mat; 
      int num;
      
    public Alumnos(double[] Cal,int num){
          this.Cal = Cal;
          this.num =num;
      }
    
    public void Estudiante() {
        UIManager UI=new UIManager(); 
        UI.put("OptionPane.background", Color.orange); 
        UI.put("Panel.background", Color.ORANGE); 
        
        num = Integer.parseInt(JOptionPane.showInputDialog(null, new JLabel("Ingresa la cantidad de alumnos que se evaluaran"),"Cantidad de alumnos",3));             
        Nom = new String[num];
        Cal = new double[num];
        Mat = new long[num];
        
        TendenciaCentral Ten = new TendenciaCentral(Cal, num);    
        Dispersion Dis = new Dispersion(Cal, num);
        ReporteDatos Rd = new ReporteDatos(Cal, num);       
        
        for(int i=0; i < num; ++i){ 
              Nom[i] =  JOptionPane.showInputDialog(null,new JLabel("Ingresa el nombre del alumno"),"Nombres",3);           
              Mat[i] =  Integer.parseInt(JOptionPane.showInputDialog(null, new JLabel("Ingresa la matricula de " + Nom[i]),"Matrículas",3));
              Cal[i] =  Double.parseDouble(JOptionPane.showInputDialog(null,new JLabel("Ingresa la calificación de " + Nom[i]),"Calificaciones",3));    
        } 
          for(int i=0; i<=num-1; i++){
             JOptionPane.showMessageDialog(null, "Nombre: " + Nom[i] + "   Matricula: " + Mat[i] + "    Calificacion: " + Cal[i],"Alumno",3);
             
        }        
        Resultados res = new Resultados(Dis.Desviacion(), Dis.Rango(), Dis.Varianza(), Rd.CalMa(), Rd.Calme(), Dis.Media(), Ten.Moda(), Ten.Repeticiones, Ten.Mediana());
        res.setVisible(true);
    }
    
}
