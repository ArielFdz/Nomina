public class Main{
   public static void main(String[] args) {

   Empleado[] empleadosDePrueba= new Empleado[5];
   int i, numeroDeAdministradores,numeroDeJornaleros;
   double horasTotalEmpleados=0,horasTotalAdministrador=0,horasTotalJornalero=0; 
   double totalNomina,totalNominaAdministrador,totalNominaJornalero;

   //se inicializan las variables
   numeroDeAdministradores=0;
   numeroDeJornaleros=0;
   totalNomina=0;
   totalNominaAdministrador=0;
   totalNominaJornalero=0;
   
   //datos de los empleados que usaremos para probar el funcionamiento del programa 
   empleadosDePrueba[0]=new Administrador("Wilberth Gamboa", 120);
   empleadosDePrueba[1]=new Jornalero("Luis Donaldo Colosio", 300);
   empleadosDePrueba[2]=new Administrador("Jacob Jesús", 200);
   empleadosDePrueba[3]=new Jornalero("Edgar Cambranes ", 96);
   empleadosDePrueba[4]=new Administrador("Jorge Carlos", 40);


   for(i=0;i<5;i++){
      if(empleadosDePrueba[i] instanceof Administrador){
         horasTotalAdministrador=horasTotalAdministrador+empleadosDePrueba[i].getNumHorasTrabajadas();
         //PIDE LA TARIFA POR CADA EMPLEADO 
         empleadosDePrueba[i].setCalcularSalario(10);
         //REALIZA LA SUMATORAI DE LAS TARIFAS DE CADA EMPLEADO
         totalNominaAdministrador= totalNominaAdministrador + empleadosDePrueba[i].getSalario();
         numeroDeAdministradores=numeroDeAdministradores+1;
      }  
   }


   Jornalero aux;
   for(i=0;i<5;i++){
      if(empleadosDePrueba[i] instanceof Jornalero){
         
         aux= (Jornalero) empleadosDePrueba[i];
         //Se colocan las horas extras por cada jornalero
         aux.setNumHorasExtra(10);
         //Se realiza la sumatoria de las horas de cada jornalero con sus x horas correspondientes 
         horasTotalJornalero=horasTotalJornalero+empleadosDePrueba[i].getNumHorasTrabajadas()+aux.getNumHorasExtra();
         
         //Insertar la tarifa
         empleadosDePrueba[i].setCalcularSalario(10);
         //Total nomina quuincenal
         totalNominaJornalero= totalNominaJornalero + empleadosDePrueba[i].getSalario();
         numeroDeJornaleros=numeroDeJornaleros+1;
      }   
   }

   totalNomina=totalNominaAdministrador+totalNominaJornalero;
   horasTotalEmpleados=horasTotalAdministrador+horasTotalJornalero;


   System.out.println("DATOS DE LOS EMPLEADOS");

   for(i=0;i<5;i++){
      System.out.println(empleadosDePrueba[i].toString());
      System.out.println("Horas trabajadas:"  +empleadosDePrueba[i].getNumHorasTrabajadas());
      if(empleadosDePrueba[i] instanceof Jornalero){
         aux= (Jornalero) empleadosDePrueba[i];

         System.out.println("Horas trabadas extra: "+ aux.getNumHorasExtra());
      }
   }



   //Total nomina quincenal
   System.out.println("CANTIDAD DE NOMINA QUINCENAL TOTAL: "+totalNomina);
   System.out.println("Nomina total quincenal trabajadores "+totalNominaAdministrador);
   System.out.println("Nomina total quincenal jornalero "+totalNominaJornalero);

   //NUMERO DE TRABAJADORES

   System.out.println("CANTIDAD DE TRABAJADORES:");
   System.out.println("Administradores: "+numeroDeAdministradores);
   System.out.println("Jornaleros: "+numeroDeJornaleros);

   //HORAS TRABAJADAS 
   System.out.println("CANTIDAD DE HORAS TRABAJADAS");
   System.out.println("Horas totales de los empleados: "+ horasTotalEmpleados);
   System.out.println("Horas totales de todos los administrador: "+horasTotalAdministrador);
   System.out.println("Horas totales de los jornaleros: "+horasTotalJornalero);
 
   }
}
