public class Administrador extends Empleado{
    
    private double incrementoSalario;

    //constructor
    public Administrador(String nombre, double numHorasTrabajadas){
        super(nombre,numHorasTrabajadas);
    }
    
    //sett y gett
    public void setIncrementoSalario(double incrementoSalario){
		this.incrementoSalario=incrementoSalario;
	}
    public double getIncrementoSalario(){
		return incrementoSalario;
	}
    
    //función para calcular el salario del Administrador
	public void setCalcularSalario(double tarifa){
        double incrementoSalarioAdministrador;
    
        if (getNumHorasTrabajadas()<80){
            incrementoSalarioAdministrador=1.2;
        }
        else{
            incrementoSalarioAdministrador=1.3;
        }
        setSalario(getNumHorasTrabajadas()*tarifa*incrementoSalarioAdministrador);
    }
}
