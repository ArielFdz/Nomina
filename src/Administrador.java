public class Administrador extends Empleado{
    private double porcentajeIncremento; //es el 20 u 30%

    public Administrador(String nombre, double numHorasTrabajadas){
        super(nombre,numHorasTrabajadas);
        

    }
    
    //setter and getter de porcentaje del incremento
    public void setPorcentajeIncremento(double porcentajeIncremento) {
		this.porcentajeIncremento = porcentajeIncremento;
	}
    public double getPorcentajeIncremento() {
		return porcentajeIncremento;
	}
    
	public void calcularSalario( double tarifa){
        double porcentajeIncremento;
        
        if ( getNumHorasTrabajadas() >= 80){

            porcentajeIncremento = 1.3;
        }else{
             porcentajeIncremento = 1.2;
        }
            
        setSalario((getNumHorasTrabajadas() * tarifa)*porcentajeIncremento);
    }

    
    

}
