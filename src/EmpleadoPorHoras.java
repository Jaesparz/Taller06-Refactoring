package src;

public class EmpleadoPorHoras extends Empleado {

    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, tarifaHora, departamento, genero);
        super.setSalarioBase(calcularSalario());
    }

    @Override
    public double calcularSalario() {
        double salario = super.getHorasTrabajadas() * tarifaHora;
        return salario;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }


    // Más metodos
}