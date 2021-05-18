
import javax.swing.JOptionPane;

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
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de alumnos que se evaluaran"));
              Nom = new String[num];
              Cal = new double[num];
              Mat = new long[num];
        
        TendenciaCentral Ten = new TendenciaCentral(Cal, num);    
        Dispersion Dis = new Dispersion(Cal, num);
        ReporteDatos Rd = new ReporteDatos(Cal, num);
        
        for(int i=0; i < num; ++i){ 
              Nom[i] =  JOptionPane.showInputDialog(null,"Ingresa el nombre del alumno");           
              Mat[i] =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la matricula de " + Nom[i]));
              Cal[i] =  Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la calificación de " + Nom[i]));
        
        } 
       
         
          for(int i=0; i<=num-1; i++){
             JOptionPane.showMessageDialog(null, "Alumno:\n Nombre: " + Nom[i] + "    Matricula: " + Mat[i] + "    Calificacion: " + Cal[i]); 
        } 
              Rd.Mostrar_Reporte();
            JOptionPane.showMessageDialog(null, "Medidas de Tendencia Central");  
              Ten.Mostrar_centrales();
            JOptionPane.showMessageDialog(null, "Medidas de Dispersion");  
              Dis.Mostrar_Disper();  
              
         Resultados res = new Resultados(Dis.Desviacion(), Dis.Rango(), Dis.Varianza(), Rd.CalMa(), Rd.Calme(), Dis.Media(), Ten.Moda(), Ten.Mediana());
         res.setVisible(true);
    }
}
