package src;

public class EmpleadoSistemas extends Empleado{
    @Override
    protected double ajustarPorDepartamento(){
        return 20;
    }
}
