public class Nomina {

    private double totalNominaAdministrador,totalHorasTrabajadasAdministrador;
    private double totalNominaJornalero,totalHorasTrabajadasJornalero;
    Jornalero auxiliar;
    private double totalNomina,totalHorasTrabajadas;
    private int numeroDeAdministradores;
    private int i,numeroDeJornaleros;

    public void informacionAdministrador(Empleado[] empleadosDePrueba,int tamanioVector){
        numeroDeAdministradores=0;
        totalHorasTrabajadasAdministrador=0;
        totalNominaAdministrador=0;

        //hallar el numero de Administradores
        for(i=0;i<tamanioVector;i++){
            if(empleadosDePrueba[i] instanceof Administrador){
            numeroDeAdministradores=numeroDeAdministradores+1;
            }  
        }

        //hallar las horas que trabajaron los administradores
        for(i=0;i<tamanioVector;i++){
            if(empleadosDePrueba[i] instanceof Administrador){
                totalHorasTrabajadasAdministrador=totalHorasTrabajadasAdministrador+empleadosDePrueba[i].getNumHorasTrabajadas();
            }  
        }

         //hallar la nomina total de los administradores
        for(i=0;i<tamanioVector;i++){
            if(empleadosDePrueba[i] instanceof Administrador){
                //ingresamos la tarifa
                empleadosDePrueba[i].setCalcularSalario(20);
                totalNominaAdministrador=totalNominaAdministrador+empleadosDePrueba[i].getSalario();
            }  
        }
    }

    public  void informacionJornaleros(Empleado[] empleadosDePrueba,int tamanioVector){
        numeroDeJornaleros=0;
        totalHorasTrabajadasJornalero=0;
        totalNominaJornalero=0;

        //hallar el numero de jornaleros
        for(i=0;i<tamanioVector;i++){
            if(empleadosDePrueba[i] instanceof Jornalero){
            numeroDeJornaleros=numeroDeJornaleros+1;
            }   
        }

        //hallar las horas que trabajaron los jornaleros
        for(i=0;i<tamanioVector;i++){
            if(empleadosDePrueba[i] instanceof Jornalero){
                auxiliar=(Jornalero)empleadosDePrueba[i];
                //ingresamos las horas extras trabajadas
                auxiliar.setNumHorasExtra(25);
                totalHorasTrabajadasJornalero=totalHorasTrabajadasJornalero+empleadosDePrueba[i].getNumHorasTrabajadas()+auxiliar.getNumHorasExtra();
            }    
        }
 
        //hallar la nomina total de los jornaleros
        for(i=0;i<tamanioVector;i++){
            if(empleadosDePrueba[i] instanceof Jornalero){
            //ingresamos la tarifa
            empleadosDePrueba[i].setCalcularSalario(20);
            totalNominaJornalero=totalNominaJornalero+empleadosDePrueba[i].getSalario();
            }      
        }
    }
    
    //sumatoria de horas y nomina de los usuarios
    public void totalHorasNomina(){
        totalNomina=0;
        totalHorasTrabajadas=0;
        totalNomina=totalNominaAdministrador+totalNominaJornalero;
        totalHorasTrabajadas=totalHorasTrabajadasAdministrador+totalHorasTrabajadasJornalero;
    }

    //eliminar usuario
    public  int borrarEmpleado(Empleado[] empleadosDePrueba,int posicion,int tamanioVector){
        tamanioVector--;

        for(int i=posicion;i<tamanioVector;i++){
           empleadosDePrueba[i]=empleadosDePrueba[i+1];
        }

        return tamanioVector;
    }

    //actualizar o crear ususario
    public  int agregarEmpleado(Empleado[] empleadosDePrueba,int posicion,int selector,int tamanioVector){
        tamanioVector++;

        //Seleccionar si agregar jornalero o administrador
        if(selector==0){
           empleadosDePrueba[posicion]=new Administrador("David Medina", 88);
        }
        if(selector==1){
           empleadosDePrueba[posicion]=new Jornalero("Carlos Vergara", 123);
        }
        
        return tamanioVector;
    }

    //ordenar usuarios
    public Empleado[] ordenarEmpleados(Empleado[] empleadosDePrueba,int tamanioVector){
        Empleado[] auxObjeto= new Empleado[4];
        int contador1=0;
        int i;
        
        
        for( i=0;i<tamanioVector;i++){
            if(empleadosDePrueba[i] instanceof Administrador){
                auxObjeto[contador1]=empleadosDePrueba[i];
                contador1++;
            }

        }
        for (i=0; i<tamanioVector;i++){
            if(empleadosDePrueba[i] instanceof Jornalero){
                auxObjeto[contador1]=empleadosDePrueba[i];
                contador1++;
            }
        }

        return auxObjeto;
    }

    //imprimir datos
    public  void imprimirInformacion(Empleado[] empleadosDePrueba,int tamanioVector){

        //imprimimos datos por trabajador, sea de tipo administrador o jornalero
        for(i=0;i<tamanioVector;i++){
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
        System.out.println("N??mero total de jornaleros: "+numeroDeJornaleros);
        System.out.println("Numero total de administradores: "+numeroDeAdministradores);            
        System.out.println("-----------------------------------------------");

        //imprimimos el numero de horas trabajadas por tipo de empledo y el total  
        System.out.println("Numero de horas totales trabajadas en la empresa: "+ totalHorasTrabajadas);      
        System.out.println("Numero de horas totales trabajadas por los jornaleros: "+totalHorasTrabajadasJornalero);            
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
