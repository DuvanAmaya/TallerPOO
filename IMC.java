import java.time.LocalDate;

public class IMC {
    private double peso;
    private double altura;
    private LocalDate fecha;
    private Usuario usuario;

    public IMC(double peso, double altura, Usuario usuario) {
        this.peso = peso;
        this.altura = altura;
        this.fecha = LocalDate.now();
        this.usuario = usuario;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    protected double calcularIMC() {
        return peso / (altura * altura);
    }

    public String toString() {
        return " IMC calculado el " + fecha + " es: " + calcularIMC();   
    }
}

