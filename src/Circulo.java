public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super("Circulo");
        if (radio <= 0) throw new IllegalArgumentException("El radio debe ser positivo.");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
