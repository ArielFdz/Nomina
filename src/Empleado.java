public class Empleado {
    private String nombre;
    private double salario;
    private double numHorasTrabajadas;
    
    public Empleado(String nombre, double numHorasTrabajadas) {
        this.nombre = nombre;
        this.numHorasTrabajadas = numHorasTrabajadas;
        
    }
    //setter and getter name
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    //setter y getter salario
    public void setSalario(double salario) {
        this.salario = salario;
    
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    //setter y getter horas trabajadas

    public void setNumHorasTrabajadas(double numHorasTrabajadas) {
        this.numHorasTrabajadas = numHorasTrabajadas;
    }
    
    public double getNumHorasTrabajadas() {
        return this.numHorasTrabajadas;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nSalario: " + this.salario;
    }

    @Override
    public void calcularSalario(double tarifa){
        salario = getNumHorasTrabajadas() * tarifa;
    }
    public double devolvercalcularSalario() {
        return salario;
    }
    
    
}
