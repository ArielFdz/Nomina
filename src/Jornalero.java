public class Jornalero extends Empleado{
    
    private double numHorasExtra;

    //constructor
    public Jornalero(String nombre, double numHorasTrabajadas){
        super(nombre,numHorasTrabajadas);
        numHorasExtra=0;
    }

    //sett y gett
    public void setNumHorasExtra(double numHorasExtra){
		this.numHorasExtra=numHorasExtra;
	}
    public double getNumHorasExtra(){
        return numHorasExtra;
    }

    //función para calcular el salario del jornalero
    public void setCalcularSalario(double tarifa){
        double salarioJornalero;
        salarioJornalero=(tarifa*2*getNumHorasExtra()+getNumHorasTrabajadas()*tarifa);
        setSalario(salarioJornalero);
    }
}
