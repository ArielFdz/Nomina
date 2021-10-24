public class Jornalero extends Empleado {
    private int horasExtras;
    public Jornalero(String nombre, double numHorasTrabajadas){
        super(nombre,numHorasTrabajadas);
        horasExtras=0;
    }

    //setter y getter horasExtra
    public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

    public int getHorasExtras(){
        return horasExtras;
    }

    //Salario
    public void calcularSalario( double tarifa){
        double salario;
        salario= (getNumHorasTrabajadas()*tarifa) + (tarifa*2*getHorasExtras());
        setSalario(salario);
    }
}
