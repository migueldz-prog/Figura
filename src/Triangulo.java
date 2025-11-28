public class Triangulo extends Figura {
    private double base;
    private double altura;
    private double lado;


    public Triangulo(double base, double altura, double lado) {
        super("Triángulo");
        if (base <= 0 || altura <= 0 || lado <= 0)
            throw new IllegalArgumentException("Todos los lados tiene que  ser positivos.");
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base + altura + lado;
    }
}
