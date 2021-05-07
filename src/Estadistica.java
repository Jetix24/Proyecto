public class Estadistica extends Alumnos{
    
    public Estadistica(double[] Cal, int num){
        super (Cal, num);
    }

    public double Sumatoria() {
        double Sum = 0;
        for(int i=0; i < num; ++i){
            Sum = Cal[i] + Sum;
        }
        return Sum;
    }
    public void Ordenar(){
      int k = 0;  
      double aux;
      
        for(int j=0; j < num; ++j){
            for(int i=0; i < num-1; ++i){
                if(Cal[i] > Cal[i+1]){
                  aux = Cal[i];
                  Cal[i] = Cal[i+1];
                  Cal[i+1] = aux;
                }
            }
        }
    
    }
    public double Media(){
        double media = (Sumatoria()/num);
        return media;
    }
}
