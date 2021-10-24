public class Jornalero extends Empleado {
    private double numHorasExtra;
    public Jornalero(String nombre, double numHorasTrabajadas){
        super(nombre,numHorasTrabajadas);
        numHorasExtra=0;
    }

    public void setNumHorasExtra(double numHorasExtra) {
		this.numHorasExtra=numHorasExtra;
	}
    public double getNumHorasExtra(){
        return numHorasExtra;
    }

    public void setCalcularSalario(double tarifa){
        double salario;
        salario= (getNumHorasTrabajadas()*tarifa + tarifa*2*getNumHorasExtra());
        setSalario(salario);
    }
}
