public class Administrador extends Empleado{
    private double incrementoSalario;


    //constructor
    public Administrador(String nombre, double numHorasTrabajadas){
        super(nombre,numHorasTrabajadas);
    }
    
    public void setIncrementoSalario(double incrementoSalario) {
		this.incrementoSalario = incrementoSalario;
	}
    public double getIncrementoSalario() {
		return incrementoSalario;
	}
    


	public void setCalcularSalario( double tarifa){
        double incrementoSalario;
        
        if ( getNumHorasTrabajadas() >= 80){

            incrementoSalario = 1.3;
        }else{
             incrementoSalario = 1.2;
        }


        setSalario((getNumHorasTrabajadas() * tarifa)*incrementoSalario);
    }
}
