public class Empleado implements Comparable<Empleado>{

    private String nombre;
    private double salario;
    private double numHorasTrabajadas;
    
    public Empleado(String nombre, double numHorasTrabajadas){
        this.nombre=nombre;
        this.numHorasTrabajadas=numHorasTrabajadas;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setSalario(double salario){
        this.salario=salario;
    
    }
    public double getSalario(){
        return this.salario;
    }

    public void setNumHorasTrabajadas(double numHorasTrabajadas){
        this.numHorasTrabajadas=numHorasTrabajadas;
    }
    public double getNumHorasTrabajadas(){
        return this.numHorasTrabajadas;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+"\nSalario: "+this.salario;
    }
    
    //se separó el método calcularSalario en set y get
    public void setCalcularSalario(double tarifa){
        salario=getNumHorasTrabajadas()*tarifa;
    }
    public double getCalcularSalario(){
        return salario;
    }

    //el main se transporta a la clase Main para tener un solo main en el programa
    @Override
    public int compareTo(Empleado o) {
        if(o.getSalario()>this.getSalario()){
            return 1;
        }else if(o.getSalario()<this.getSalario()){
            return -1;
        }else{
            return 0;
        }
    } 
}
