package src;

public class EmpleadoSistemas extends EmpleadoConAjuste{
    public EmpleadoSistemas(String nombre, double salarioBase, int horasTrabajadas) {
        super(nombre, salarioBase, horasTrabajadas);
    }
    @Override
    protected double ajustarPorDepartamento(){
        return 20;
    }

}
