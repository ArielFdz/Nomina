public class Main{
   public static void main(String[] args) {

   Empleado[] misEmpleados= new Empleado[5];
   double nominaQuincenalTotal=0,nominaQuincenalTotalAdministrador=0,nominaQuincenalTotalJornalero=0;
   double horasTotalEmpleados=0,horasTotalAdministrador=0,horasTotalJornalero=0; 
   int i, contadorAdministrador=0,contadorJornaleros=0;
   misEmpleados[0]= new Administrador("Wilberth Gamboa", 120);
   misEmpleados[1]= new Jornalero("Luis Donaldo Colosio", 300);
   misEmpleados[2]= new Administrador("Jacob Jesús", 200);
   misEmpleados[3]= new Jornalero("Edgar Cambranes ", 96);
   misEmpleados[4]= new Administrador("Jorge Carlos", 40);

   for(i=0;i<5;i++){
      if(misEmpleados[i] instanceof Administrador){
         horasTotalAdministrador=horasTotalAdministrador+misEmpleados[i].getNumHorasTrabajadas();
         contadorAdministrador++;
         //PIDE LA TARIFA POR CADA EMPLEADO 
         misEmpleados[i].setCalcularSalario(10);
         //REALIZA LA SUMATORAI DE LAS TARIFAS DE CADA EMPLEADO
         nominaQuincenalTotalAdministrador= nominaQuincenalTotalAdministrador + misEmpleados[i].getSalario();
      }  
   }


   Jornalero aux;
   for(i=0;i<5;i++){
      if(misEmpleados[i] instanceof Jornalero){
         
         aux= (Jornalero) misEmpleados[i];
         //Se colocan las horas extras por cada jornalero
         aux.setNumHorasExtra(10);
         //Se realiza la sumatoria de las horas de cada jornalero con sus x horas correspondientes 
         horasTotalJornalero=horasTotalJornalero+misEmpleados[i].getNumHorasTrabajadas()+aux.getNumHorasExtra();
         
         //Insertar la tarifa
         misEmpleados[i].setCalcularSalario(10);
         //Total nomina quuincenal
         nominaQuincenalTotalJornalero= nominaQuincenalTotalJornalero + misEmpleados[i].getSalario();
         contadorJornaleros++;
      }   
   }

   nominaQuincenalTotal=nominaQuincenalTotalAdministrador+nominaQuincenalTotalJornalero;
   horasTotalEmpleados=horasTotalAdministrador+horasTotalJornalero;


   System.out.println("DATOS DE LOS EMPLEADOS");

   for(i=0;i<5;i++){
      System.out.println(misEmpleados[i].toString());
      System.out.println("Horas trabajadas:"  +misEmpleados[i].getNumHorasTrabajadas());
      if(misEmpleados[i] instanceof Jornalero){
         aux= (Jornalero) misEmpleados[i];

         System.out.println("Horas trabadas extra: "+ aux.getNumHorasExtra());
      }
   }



   //Total nomina quincenal
   System.out.println("CANTIDAD DE NOMINA QUINCENAL TOTAL: "+nominaQuincenalTotal);
   System.out.println("Nomina total quincenal trabajadores "+nominaQuincenalTotalAdministrador);
   System.out.println("Nomina total quincenal jornalero "+nominaQuincenalTotalJornalero);

   //NUMERO DE TRABAJADORES

   System.out.println("CANTIDAD DE TRABAJADORES:");
   System.out.println("Administradores: "+contadorAdministrador);
   System.out.println("Jornaleros: "+contadorJornaleros);

   //HORAS TRABAJADAS 
   System.out.println("CANTIDAD DE HORAS TRABAJADAS");
   System.out.println("Horas totales de los empleados: "+ horasTotalEmpleados);
   System.out.println("Horas totales de todos los administrador: "+horasTotalAdministrador);
   System.out.println("Horas totales de los jornaleros: "+horasTotalJornalero);
 
   }
}
