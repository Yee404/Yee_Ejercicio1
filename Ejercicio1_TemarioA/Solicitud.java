import java.util.Random;

public class Solicitud {
    private int A;
    private int b;
    private int c;
    private int valor;
    private Random rand;

    public Solicitud() {
        this.A = 0;
        this.b = 0;
        this.c = 0;
        rand = new Random();
    }

    public int getA(){
        return.this.A;
    }

    public int getb(){
        return.this.b;
    }

    public int getc(){
        return.this.c;
    }

    public void Solicitud() {
        this.A = this.rand.nextInt(1499) + 1;
        this.b = this.rand.nextInt(1499) + 1;
        this.c = this.rand.nextInt(1499) + 1;
    }
}