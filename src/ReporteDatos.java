public class ReporteDatos extends Estadistica{

    private Double MayorCal;
    private Double MnorCal;

    public ReporteDatos(double[] Cal, int num) {
        super(Cal, num);
    }
    public void Mostrar_Reporte() {
       MayorCal();
       MenorCal();
    }
    public void MayorCal() {
       Ordenar();
       System.out.println("La mayor calificación es " + Cal[num-1]);
    }
    public void MenorCal() {
       Ordenar();
       System.out.println("La menor calificación es " + Cal[0]);
    }
}
