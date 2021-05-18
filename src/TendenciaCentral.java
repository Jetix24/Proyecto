
import javax.swing.JOptionPane;

public class TendenciaCentral extends Estadistica {

    double moda;
    
    public TendenciaCentral(double[]Cal, int num){
        super (Cal, num);
    }
    public void Mostrar_centrales(){
        GetMedia();
        Moda();
        Mediana();
        JOptionPane.showMessageDialog(null, "La media es = " + Media()); 
    }
    public void GetMedia() {
      JOptionPane.showMessageDialog(null, "La media es = " + Media()); 
    }
    public String Moda() {
        Ordenar();
        int Max_Rep = 0;
        double moda = 0;
        double moda2 = 0;
        
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
        if(moda2 != 0){ return "Las modas son = "+moda+" y "+moda2+ " y se repitieron " + Max_Rep+ " veces";   
        } else{
            return "La moda es = "+moda+" y se repitió "+Max_Rep+" veces"; 
        }
        
        
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
