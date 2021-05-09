package etsisi.ems2020.trabajo3.lineadehorizonte;

public class Edificio {
	private int xi;
    private int y;
    private int xDerechaerecha;
    
    public Edificio()
    {
        this.xDerechaerecha = 0;
        this.xi = 0;
        this.y = 0;
    }    
    public Edificio(int xi, int y, int xDerechaerecha)
    {
        this.xDerechaerecha = xDerechaerecha;
        this.xi = xi;
        this.y = y;
    }    
    public int getXi() {
        return this.xi;
    }
    public void setXi(int xi) {
        this.xi = xi;
    }
    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getxDerechaerecha() {
        return this.xDerechaerecha;
    }
    public void setxDerechaerecha(int xDerechaerecha) {
        this.xDerechaerecha = xDerechaerecha;
    }
}
