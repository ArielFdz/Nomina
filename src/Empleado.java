public class Empleado {
    private String nombre;
    private double salario;
    private double numHorasTrabajadas;
    
    public Empleado(String nombre, double numHorasTrabajadas) {
        this.nombre = nombre;
        this.numHorasTrabajadas = numHorasTrabajadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    
    }
    public double getSalario() {
        return this.salario;
    }

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

    public void setCalcularSalario(double tarifa){
        salario=getNumHorasTrabajadas() * tarifa;
    }
    public double getCalcularSalario() {
        return salario;
    }
}
