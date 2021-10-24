public class Main{
    public static void main(String[] args) {
       // El cálculo del salario es quincenal. 
        // El salario del Administrador incrementa 30% cuando 
        //completa al menos las 80 hrs quincenales, de otra forma el incremento es del 20%. El salario del Jornalero se determina con base en el número de horas trabajadas + horas extras. Cada hora extra se paga al doble de la tarifa del costo por hora.
    
    Empleado[] misEmpleados= new Empleado[5];
    //variables nomina quincenal
    double nominaQuincenalTotal=0,nominaQuincenalTotalAdministrador=0,nominaQuincenalTotalJornalero=0;
    //variables horas trabajadas
    double horasTotalEmpleados=0,horasTotalAdministrador=0,horasTotalJornalero=0;
    //variables contador tipo empleado 
    int contadorAdministrador=0,contadorJornaleros=0;
    misEmpleados[0]= new Administrador("Wilberth Gamboa", 120);
    misEmpleados[1]= new Jornalero("Luis Donaldo Colosio", 300);
    misEmpleados[2]= new Administrador("Jacob Jesús", 200);
    misEmpleados[3]= new Jornalero("Edgar Cambranes ", 96);
    misEmpleados[4]= new Administrador("Jorge Carlos", 40); //:0
    //BUCLES CONTADORES
   //CAMBIAR TOTAL HORAS
    //QUITAR ESTO
    for(int i=0;i<5;i++){
      // horasTotalEmpleados= misEmpleados[i].getNumHorasTrabajadas() + horasTotalEmpleados;
       
        
    }
    for(int i=0;i<5;i++){
      if(misEmpleados[i] instanceof Administrador){
         horasTotalAdministrador=horasTotalAdministrador+misEmpleados[i].getNumHorasTrabajadas();
         contadorAdministrador++;
         //PIDE LA TARIFA POR CADA EMPLEADO 
         misEmpleados[i].calcularSalario(10);
         //REALIZA LA SUMATORAI DE LAS TARIFAS DE CADA EMPLEADO
         nominaQuincenalTotalAdministrador= nominaQuincenalTotalAdministrador + misEmpleados[i].getSalario();
         

      }
        
    }
    Jornalero aux;
    for(int i=0;i<5;i++){
      if(misEmpleados[i] instanceof Jornalero){
         
         aux= (Jornalero) misEmpleados[i];
         //Se colocan las horas extras por cada jornalero
         aux.setHorasExtras(10);
         //Se realiza la sumatoria de las horas de cada jornalero con sus x horas correspondientes 
         horasTotalJornalero=horasTotalJornalero+misEmpleados[i].getNumHorasTrabajadas()+aux.getHorasExtras();
         
         //Insertar la tarifa
         misEmpleados[i].calcularSalario(10);
         //Total nomina quuincenal
         nominaQuincenalTotalJornalero= nominaQuincenalTotalJornalero + misEmpleados[i].getSalario();
        

         contadorJornaleros++;

         
         
        
      }
        
    }

    nominaQuincenalTotal=nominaQuincenalTotalAdministrador+nominaQuincenalTotalJornalero;
    horasTotalEmpleados=horasTotalAdministrador+horasTotalJornalero;


    System.out.println("DATOS DE LOS EMPLEADOS");
    for(int i=0;i<5;i++){
       System.out.println(misEmpleados[i].toString());
       System.out.println("Horas trabajadas:"  +misEmpleados[i].getNumHorasTrabajadas());
       if(misEmpleados[i] instanceof Jornalero){
          aux= (Jornalero) misEmpleados[i];

          System.out.println("Horas trabadas extra: "+ aux.getHorasExtras());

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
