import java.util.Arrays;

public class Main{
   public static void main(String[] args){

   Empleado[] empleadosDePrueba= new Empleado[4];
   empleadosOriginales(empleadosDePrueba);
   int tamanioVector=4;
   Nomina prueba = new Nomina();
   
   System.out.println("\n");
   System.out.println("----------------EMPLEADOS ORIGINALES------------------");
   System.out.println("\n");
   prueba.informacionAdministrador(empleadosDePrueba, tamanioVector);
   prueba.informacionJornaleros(empleadosDePrueba, tamanioVector);
   prueba.totalHorasNomina();
   prueba.imprimirInformacion(empleadosDePrueba, tamanioVector);

   System.out.println("\n");
   System.out.println("----------------EMPLEADOS ELIMINANDO A UN USUARIO------------------");
   System.out.println("\n");
   tamanioVector=prueba.borrarEmpleado(empleadosDePrueba, 3, tamanioVector);
   prueba.informacionAdministrador(empleadosDePrueba, tamanioVector);
   prueba.informacionJornaleros(empleadosDePrueba, tamanioVector);
   prueba.totalHorasNomina();
   prueba.imprimirInformacion(empleadosDePrueba, tamanioVector);

   System.out.println("\n");
   System.out.println("----------------EMPLEADOS AGREGANDO A UN USARIO------------------");
   System.out.println("\n");
   tamanioVector=prueba.agregarEmpleado(empleadosDePrueba, 3, 0, tamanioVector);
   prueba.informacionAdministrador(empleadosDePrueba, tamanioVector);
   prueba.informacionJornaleros(empleadosDePrueba, tamanioVector);
   prueba.totalHorasNomina();
   prueba.imprimirInformacion(empleadosDePrueba, tamanioVector);

   System.out.println("\n");
   System.out.println("----------------EMPLEADOS ORDENADOS POR TIPO------------------");
   System.out.println("\n");
   Arrays.sort(empleadosDePrueba);
   empleadosDePrueba=prueba.ordenarEmpleados(empleadosDePrueba, tamanioVector);//
   prueba.imprimirInformacion(empleadosDePrueba, tamanioVector);
   }

   public static void empleadosOriginales(Empleado[] empleadosDePrueba){
      //datos de los empleados que usaremos para probar el funcionamiento del programa
      //los administradores son horas totales y los jornaleros son horas trabajadas sin contar horas extra
      empleadosDePrueba[0]=new Jornalero("Juan", 98); 
      empleadosDePrueba[1]=new Administrador("Daniel", 80);
      empleadosDePrueba[2]=new Jornalero("Mariana", 100);
      empleadosDePrueba[3]=new Administrador("Martha", 70);
   }
}
