public class Main{
   public static void main(String[] args){

   Empleado[] empleadosDePrueba= new Empleado[4];
   Jornalero auxiliar;
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
   empleadosDePrueba[0]=new Jornalero("Juan", 98); 
   empleadosDePrueba[1]=new Administrador("Daniel", 80);
   empleadosDePrueba[2]=new Jornalero("Mariana", 100);
   empleadosDePrueba[3]=new Administrador("Martha", 70);


   //hallar el numero de jornaleros
   for(i=0;i<4;i++){
      if(empleadosDePrueba[i] instanceof Jornalero){
         numeroDeJornaleros=numeroDeJornaleros+1;
      }   
   }

   //hallar las horas que trabajaron los jornaleros
   for(i=0;i<4;i++){
      if(empleadosDePrueba[i] instanceof Jornalero){
         auxiliar=(Jornalero)empleadosDePrueba[i];
         //ingresamos las horas extras trabajadas
         auxiliar.setNumHorasExtra(25);
         totalHorasTrabajadasJornalero=totalHorasTrabajadasJornalero+empleadosDePrueba[i].getNumHorasTrabajadas()+auxiliar.getNumHorasExtra();
      }   
   }
   
   //hallar la nomina total de los jornaleros
   for(i=0;i<4;i++){
      if(empleadosDePrueba[i] instanceof Jornalero){
         //ingresamos la tarifa
         empleadosDePrueba[i].setCalcularSalario(20);
         totalNominaJornalero=totalNominaJornalero+empleadosDePrueba[i].getSalario();
      }   
   }

   //hallar el numero de Administradores
   for(i=0;i<4;i++){
      if(empleadosDePrueba[i] instanceof Administrador){
         numeroDeAdministradores=numeroDeAdministradores+1;
      }  
   }

   //hallar las horas que trabajaron los administradores
   for(i=0;i<4;i++){
      if(empleadosDePrueba[i] instanceof Administrador){
         totalHorasTrabajadasAdministrador=totalHorasTrabajadasAdministrador+empleadosDePrueba[i].getNumHorasTrabajadas();
      }  
   }

   //hallar la nomina total de los administradores
   for(i=0;i<4;i++){
      if(empleadosDePrueba[i] instanceof Administrador){
         //ingresamos la tarifa
         empleadosDePrueba[i].setCalcularSalario(20);
         totalNominaAdministrador=totalNominaAdministrador+empleadosDePrueba[i].getSalario();
      }  
   }

   //suma total de la nomina y de las horas trabajadas
   totalNomina=totalNominaAdministrador+totalNominaJornalero;
   totalHorasTrabajadas=totalHorasTrabajadasAdministrador+totalHorasTrabajadasJornalero;

   //imprimimos datos por trabajador, sea de tipo administrador o jornalero
   System.out.println("Empleados");
   System.out.println("-----------------------------------------------");
   for(i=0;i<4;i++){
      System.out.println(empleadosDePrueba[i].toString());
      System.out.println("Numero de horas trabajadas: "+empleadosDePrueba[i].getNumHorasTrabajadas());
      if(empleadosDePrueba[i] instanceof Jornalero){
         auxiliar= (Jornalero) empleadosDePrueba[i];
         System.out.println("Numero de horas extras trabajadas: "+ auxiliar.getNumHorasExtra());
         System.out.println("Tipo de empleado: Jornalero");
      }
      else{
         System.out.println("Numero de horas extras trabajadas: 0");
         System.out.println("Tipo de empleado: Administrador");
      }
      System.out.println("-----------------------------------------------");
   }

   //imprimimos el numero de trabajadores de cada tipo
   System.out.println("Número total de jornaleros: "+numeroDeJornaleros);
   System.out.println("Numero total de administradores: "+numeroDeAdministradores);
   System.out.println("-----------------------------------------------");

   //imprimimos el numero de horas trabajadas por tipo de empledo y el total  
   System.out.println("Numero de horas totales trabajadas en la empresa: "+ totalHorasTrabajadas);      System.out.println("Numero de horas totales trabajadas por los jornaleros: "+totalHorasTrabajadasJornalero);
   System.out.println("Numero de horas totales trabajadas por los administradores: "+totalHorasTrabajadasAdministrador);
   System.out.println("-----------------------------------------------");

   //imprimimos la nomina por tipo de empleado
   System.out.println("Nomina total de los jornaleros: "+totalNominaJornalero);
   System.out.println("Nomina total de los administradores: "+totalNominaAdministrador);
   System.out.println("-----------------------------------------------");

   //imprimimos la nomina total
   System.out.println("Nomina total de la empresa: "+totalNomina);
   System.out.println("-----------------------------------------------");


 
   }
}
