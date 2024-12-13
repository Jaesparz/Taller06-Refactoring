package src;

public abstract class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private String departamento;
    private double tarifaHora;

    public Empleado(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
        this.departamento = departamento;
    }
    
    public Empleado(String nombre, double salarioBase, int horasTrabajadas,String departamento) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    public Empleado(String nombre, double salarioBase, int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalario() {

        if (salarioBase <= 0) {
            throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        }
        if(horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
        }

        double salarioTotal = salarioBase;
        salarioTotal += calcularHorasExtra();
        salarioTotal += ajustarPorDepartamento();

        return salarioTotal;
    }

    private double calcularHorasExtra() {
        if (horasTrabajadas <= 40) {
            return 0; //Sin horas extra
        }
        return (horasTrabajadas - 40) * 50; //Horas extra
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + nombre);
        System.out.println("Salario: " + salarioBase);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Departamento: " + departamento);
    }


    protected double ajustarPorDepartamento(){
        return 0;
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Más metodos
}
