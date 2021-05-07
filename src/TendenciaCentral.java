public class TendenciaCentral extends Estadistica {

    public TendenciaCentral(double[]Cal, int num){
        super (Cal, num);
    }
    public void Mostrar_centrales(){
        GetMedia();
        Moda();
        Mediana();
    }
    public void GetMedia() {
      System.out.println("La media es = " + Media());
    }
    public void Moda() {
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
        if(moda2 != 0){ System.out.println("Las modas son = "+moda+" y "+moda2+ " y se repitieron " + Max_Rep+ " veces");    
        } else{
           System.out.println("La moda es = "+moda+" y se repitió "+Max_Rep+" veces"); 
        }
        }
    public void Mediana() {
        double pos;
        Ordenar();
              if( num% 2 == 0){
                  pos = (Cal[(num-2)/2] + Cal[num/2])/2;
              }else{
                  pos = Cal[(num)/2];
              }
        System.out.println("La mediana es = " + pos);
    }       
}
