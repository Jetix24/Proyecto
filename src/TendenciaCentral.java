
import javax.swing.JOptionPane;

public class TendenciaCentral extends Estadistica {

    String Repeticiones;
    
    public TendenciaCentral(double[]Cal, int num){
        super (Cal, num);
    }

    public String Moda() {
        Ordenar();
        int Max_Rep = 0;
        double moda = 0;
        double moda2 = 0;
            String numCadena;
        
        for(int i=0; i<num; i++){
        int Rep = 0;
          for(int j=0; j<num; j++){
            if(Cal[i] == Cal[j])
               Rep++;
            }
              if(Rep > Max_Rep){
                moda = Cal[i];
                Max_Rep = Rep;
              }if(Rep == Max_Rep && Cal[i] != moda){
                moda2 = Cal[i];
             }
          }
            numCadena = String.valueOf(Max_Rep);
            this.Repeticiones = numCadena;
        if(moda2 != 0){        
            return moda+" y "+moda2;   
        } else{      
            return moda+""; 
        }
    }
    public String Num_Rep(){
      return Repeticiones;
   }
    public double Mediana() {
        double pos;
        Ordenar();
              if( num% 2 == 0){
                  pos = (Cal[(num-2)/2] + Cal[num/2])/2;
                  return pos;
              }else{
                  pos = Cal[(num)/2];
                  return pos;
              }
    }       
}
