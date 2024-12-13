package src;

public class EmpleadoContabilidad extends Empleado{
    @Override
    protected double ajustarPorDepartamento(){
        return 10;
    }
}
