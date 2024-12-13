package src;

public class EmpleadoContabilidad extends EmpleadoConAjuste{
    public EmpleadoContabilidad(String nombre, double salarioBase, int horasTrabajadas) {
        super(nombre, salarioBase, horasTrabajadas);
    }
    @Override
    protected double ajustarPorDepartamento(){
        return 10;
    }
}
