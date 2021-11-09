public class Nomina {

    private double totalNominaAdministrador,totalHorasTrabajadasAdministrador;
    
    //jornalero
    private double totalNominaJornalero,totalHorasTrabajadasJornalero;
    Jornalero auxiliar;
   
    //general
    private double totalNomina,totalHorasTrabajadas;
    private int numeroDeAdministradores;
    private int i,numeroDeJornaleros;

    public Nomina(){
        totalNominaAdministrador=0;
        totalHorasTrabajadasAdministrador=0;
        totalNominaJornalero=0;
        totalHorasTrabajadasJornalero=0;
        totalNomina=0;
        totalHorasTrabajadas=0;
        numeroDeAdministradores=0;
        numeroDeJornaleros=0;
    }


    public void administradorDatos(Empleado[] empleadosDePrueba,int tamanioAux){
        //hallar el numero de Administradores
        for(i=0;i<tamanioAux;i++){
            if(empleadosDePrueba[i] instanceof Administrador){
            numeroDeAdministradores=numeroDeAdministradores+1;
            }  
        }

        //hallar las horas que trabajaron los administradores
        for(i=0;i<tamanioAux;i++){
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
    }


    public  void jornaleroDatos(Empleado[] empleadosDePrueba,int tamanioAux){
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
        
      
    }
    
    
    public void sumaTotales(){
        totalNomina=totalNominaAdministrador+totalNominaJornalero;
        totalHorasTrabajadas=totalHorasTrabajadasAdministrador+totalHorasTrabajadasJornalero;
    }

     
  
    public  int borrarDato(Empleado[] misEmpleados,int posicion,int tamanioAux){
        tamanioAux--;
        for(int i=posicion;i<tamanioAux;i++){
           misEmpleados[i]=misEmpleados[i+1];
  
        }
  
        return tamanioAux;
     }
     public  int agregarDato(Empleado[] misEmpleados,int posicion,int selector,int tamanioAux){
        tamanioAux++;
        if(selector==0){
           misEmpleados[posicion]=new Administrador("Prueba Nuevo Admin", 100);
  
  
        }else if(selector==1){
           misEmpleados[posicion]=new Jornalero("Prueba Nuevo Jornalero ", 100);
  
        }
        
        //Seleccionar si agregar jornalero o administrador
        
  
        
  
        return tamanioAux;
     }
     public void ordenar(Empleado[] misEmpleados,int tamanioAux){
        Empleado[] auxObjeto= new Empleado[5];
        auxObjeto=misEmpleados;
        int contador1=0;
        int i;
        
        
        for( i=0;i<tamanioAux;i++){
            if(misEmpleados[i] instanceof Administrador){
                auxObjeto[contador1]=misEmpleados[i];
                
                System.out.println(contador1);
                contador1++;

            }

        }

        for (i=0; i<tamanioAux;i++){
            if(misEmpleados[i] instanceof Jornalero){
                auxObjeto[contador1]=misEmpleados[i];
                System.out.println(contador1);

                contador1++;
            }
        }
        misEmpleados=auxObjeto;


        
        


     }

     public  void imprimirDatos(Empleado[] misEmpleados,int tamanioAux){
        Jornalero aux;
        System.out.println("DATOS DE LOS EMPLEADOS");
        for(int i=0;i<tamanioAux;i++){
           System.out.println(misEmpleados[i].toString());
           System.out.println("Horas trabajadas:"+misEmpleados[i].getNumHorasTrabajadas());
           if(misEmpleados[i] instanceof Jornalero){
              aux= (Jornalero) misEmpleados[i];
              System.out.println("Horas trabadas extra: "+ aux.getHorasExtras());
         }
      }
      //Total nomina quincenal
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
