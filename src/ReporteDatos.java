



public class ReporteDatos extends Estadistica{

    public ReporteDatos(double[] Cal, int num) {
        super(Cal, num);
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
