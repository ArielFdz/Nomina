public class Main{
   public static void main(String[] args){

   Empleado[] empleadosDePrueba= new Empleado[4];
   inicializarEmpleados(empleadosDePrueba);
   int tamanioAux=4;
   Nomina prueba = new Nomina();
   
   System.out.println("\n");
   System.out.println("----------------EMPLEADOS ORIGINALES------------------");
   System.out.println("\n");
   prueba.administradorDatos(empleadosDePrueba, tamanioAux);
   prueba.jornaleroDatos(empleadosDePrueba, tamanioAux);
   prueba.sumaTotales();
   prueba.imprimirDatos(empleadosDePrueba, tamanioAux);

   System.out.println("\n");
   System.out.println("----------------EMPLEADOS ELIMINANDO A UN USUARIO------------------");
   System.out.println("\n");
   tamanioAux=prueba.borrarDato(empleadosDePrueba, 3, tamanioAux);
   prueba.administradorDatos(empleadosDePrueba, tamanioAux);
   prueba.jornaleroDatos(empleadosDePrueba, tamanioAux);
   prueba.sumaTotales();
   prueba.imprimirDatos(empleadosDePrueba, tamanioAux);

   System.out.println("\n");
   System.out.println("----------------EMPLEADOS AGREGANDO A UN USARIO------------------");
   System.out.println("\n");
   tamanioAux=prueba.agregarDato(empleadosDePrueba, 3, 0, tamanioAux);
   prueba.administradorDatos(empleadosDePrueba, tamanioAux);
   prueba.jornaleroDatos(empleadosDePrueba, tamanioAux);
   prueba.sumaTotales();
   prueba.imprimirDatos(empleadosDePrueba, tamanioAux);

   System.out.println("\n");
   System.out.println("----------------EMPLEADOS ORDENADOS POR TIPO------------------");
   System.out.println("\n");
   prueba.ordenar(empleadosDePrueba, tamanioAux);
   prueba.imprimirDatos(empleadosDePrueba, tamanioAux);
   }


   public static void inicializarEmpleados(Empleado[] empleadosDePrueba){
      //datos de los empleados que usaremos para probar el funcionamiento del programa
      //los administradores son horas totales y los jornaleros son horas trabajadas sin contar horas extra
      empleadosDePrueba[0]=new Jornalero("Juan", 98); 
      empleadosDePrueba[1]=new Administrador("Daniel", 80);
      empleadosDePrueba[2]=new Jornalero("Mariana", 100);
      empleadosDePrueba[3]=new Administrador("Martha", 70);
   }
}





/*/imprimimos datos por trabajador, sea de tipo administrador o jornalero
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
   System.out.println("-----------------------------------------------");*/
