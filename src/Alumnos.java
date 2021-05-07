import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Ingresa la cantidad de alumnos que se evaluaran");
            num = sc.nextInt();
            sc.nextLine();
              Nom = new String[num];
              Cal = new double[num];
              Mat = new long[num];
        
        TendenciaCentral Ten = new TendenciaCentral(Cal, num);    
        Dispersion Dis = new Dispersion(Cal, num);
        ReporteDatos Rd = new ReporteDatos(Cal, num);
        
        for(int i=0; i < num; ++i){
          System.out.println(YELLOW+ "----------------------------------------------------------------------------------------");  
            System.out.println("Ingresa el nombre del alumno");
              Nom[i] =  sc.nextLine();
            System.out.println("Ingresa la matricula de " + Nom[i]);  
              Mat[i] =  sc.nextLong();
              sc.nextLine();
            System.out.println("Ingresa la calificación de " + Nom[i]);
              Cal[i] =  sc.nextDouble();
              sc.nextLine();
        } 
          System.out.println(YELLOW+ "----------------------------------------------------------------------------------------");
          System.out.println(GREEN + "Alumnos");
          for(int i=0; i<=num-1; i++){
             System.out.print("Nombre: " + Nom[i] + "    Matricula: " + Mat[i] + "    Calificacion: " + Cal[i]);
             System.out.println("");
        } 
          System.out.println(YELLOW+ "----------------------------------------------------------------------------------------");
            System.out.println(CIAN+ "Reporte de Datos"); 
            Rd.Mostrar_Reporte();
          System.out.println(YELLOW+ "----------------------------------------------------------------------------------------");
            System.out.println(BLUE+ "Medidas de Tendencia Central");   
            Ten.Mostrar_centrales();
          System.out.println(YELLOW+ "----------------------------------------------------------------------------------------");  
            System.out.println(RED+ "Medidas de Dispersion"); 
            Dis.Mostrar_Disper();
          System.out.println(YELLOW+ "----------------------------------------------------------------------------------------");   
    }
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CIAN = "\u001B[36m";
}
