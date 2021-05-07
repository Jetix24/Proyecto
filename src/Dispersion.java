
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Dispersion extends Estadistica {

    public Dispersion(double[] Cal, int num) {
        super (Cal, num);
    }
    public void Mostrar_Disper(){
        Rango();
        System.out.println("La desviación estandar es = " + Desviacion());
        Varianza();
    }
    public void Rango() {
       double r;
       Ordenar();
       r = Cal[num-1] - Cal[0];
       System.out.println("El rango es = " + r);
    }
    public void Varianza() {
       double varianza = (float) pow(Desviacion(),2);
       System.out.println("La varianza es = " + varianza);
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

