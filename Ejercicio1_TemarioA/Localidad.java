import java.util.Random;

public class Localidad {
    private int Local;
    private int Dispo;
    private int Gasto;
    // private int Valor;
    // private int Req;

    public Localidad() {
        this.Local = 0;
        rand = new Random();
        this.Dispo = 60;
        // this.Valor = Local * cant_b
    }

    public void Solicitud() {
        this.Local = this.rand.nextInt(2) + 1;
    }
}
