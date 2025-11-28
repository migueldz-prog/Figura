public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }


    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public void mostrarDatos() {
        System.out.println("Figura: " + nombre);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("-----------");
    }

}
