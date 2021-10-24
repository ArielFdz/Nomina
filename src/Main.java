public class Main{
   public static void main(String[] args) {

   Empleado[] empleadosDePrueba= new Empleado[5];
   Jornalero aux;
   int i, numeroDeAdministradores,numeroDeJornaleros;
   double totalHorasTrabajadas,totalHorasTrabajadasAdministrador,totalHorasTrabajadasJornalero; 
   double totalNomina,totalNominaAdministrador,totalNominaJornalero;

   //se inicializan las variables
   numeroDeAdministradores=0;
   numeroDeJornaleros=0;
   totalNomina=0;
   totalNominaAdministrador=0;
   totalNominaJornalero=0;
   totalHorasTrabajadas=0;
   totalHorasTrabajadasAdministrador=0;
   totalHorasTrabajadasJornalero=0;
   
   //datos de los empleados que usaremos para probar el funcionamiento del programa
   //los administradores son horas totales y los jornaleros son horas trabajadas sin contar horas extra 
   empleadosDePrueba[0]=new Administrador("Wilberth Gamboa", 120);
   empleadosDePrueba[1]=new Jornalero("Luis Donaldo Colosio", 300);
   empleadosDePrueba[2]=new Administrador("Jacob Jesús", 200);
   empleadosDePrueba[3]=new Jornalero("Edgar Cambranes ", 96);
   empleadosDePrueba[4]=new Administrador("Jorge Carlos", 40);

   //hallar el numero de Administradores
   for(i=0;i<5;i++){
      if(empleadosDePrueba[i] instanceof Administrador){
         numeroDeAdministradores=numeroDeAdministradores+1;
      }  
   }

   //hallar las horas que trabajaron los administradores
   for(i=0;i<5;i++){
      if(empleadosDePrueba[i] instanceof Administrador){
         totalHorasTrabajadasAdministrador=totalHorasTrabajadasAdministrador+empleadosDePrueba[i].getNumHorasTrabajadas();
      }  
   }

   //hallar la nomina total de los administradores
   for(i=0;i<5;i++){
      if(empleadosDePrueba[i] instanceof Administrador){
         //ingresamos la tarifa
         empleadosDePrueba[i].setCalcularSalario(10);
         totalNominaAdministrador= totalNominaAdministrador + empleadosDePrueba[i].getSalario();
      }  
   }

   //hallar el numero de jornaleros
   for(i=0;i<5;i++){
      if(empleadosDePrueba[i] instanceof Jornalero){
         numeroDeJornaleros=numeroDeJornaleros+1;
      }   
   }

   //hallar las horas que trabajaron los jornaleros
   for(i=0;i<5;i++){
      if(empleadosDePrueba[i] instanceof Jornalero){
         aux= (Jornalero) empleadosDePrueba[i];
         //ingresamos las horas extras trabajadas
         aux.setNumHorasExtra(10);
         totalHorasTrabajadasJornalero=totalHorasTrabajadasJornalero+empleadosDePrueba[i].getNumHorasTrabajadas()+aux.getNumHorasExtra();
      }   
   }
   
   //hallar la nomina total de los jornaleros
   for(i=0;i<5;i++){
      if(empleadosDePrueba[i] instanceof Jornalero){
         //ingresamos la tarifa
         empleadosDePrueba[i].setCalcularSalario(10);
         totalNominaJornalero= totalNominaJornalero + empleadosDePrueba[i].getSalario();
      }   
   }

   //suma total de la nomina y de las horas trabajadas
   totalNomina=totalNominaAdministrador+totalNominaJornalero;
   totalHorasTrabajadas=totalHorasTrabajadasAdministrador+totalHorasTrabajadasJornalero;


   //imprimimos todo en pantalla
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
   System.out.println("Horas totales de los empleados: "+ totalHorasTrabajadas);
   System.out.println("Horas totales de todos los administrador: "+totalHorasTrabajadasAdministrador);
   System.out.println("Horas totales de los jornaleros: "+totalHorasTrabajadasJornalero);
 
   }
}
