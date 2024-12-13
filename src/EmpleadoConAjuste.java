package src;

public abstract class EmpleadoConAjuste extends Empleado {
    public EmpleadoConAjuste(String nombre, double salarioBase, int horasTrabajadas) {
        super(nombre, salarioBase, horasTrabajadas);
    }

    @Override
    protected abstract double ajustarPorDepartamento();
}
