
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Dispersion extends Estadistica {

    public Dispersion(double[] Cal, int num) {
        super (Cal, num);
    }
    public double Rango() {
       double r;
       Ordenar();
       r = Cal[num-1] - Cal[0];
       //JOptionPane.showMessageDialog(null,"El rango es = " + r);
       return r;
    }
    public double Varianza() {
       double varianza = (float) pow(Desviacion(),2);
       //JOptionPane.showMessageDialog(null,"La varianza es = " + varianza);
       return varianza;
    }
    public double Desviacion() {
      double desviacion = 0;
      
      for(int i = 0 ; i < num; i++){
       float calculo = (float) (pow((Cal[i] - Media()),2));
          desviacion = desviacion + calculo; 
       }
      desviacion = (float) sqrt(desviacion/num);
      return desviacion;       
    }
      
}

