package pbo1.pkg10118033.latihan50;

public class BolaBaseball {
    private double massa, kecepatan, EK;

    public double getMassa() {
        return massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double hitungEnergi(){
        massa = massa/1000;
        return EK = 0.5*massa*kecepatan*kecepatan;
    }
    
    public double hitungUsahaDiam(){
        return EK-0;
    }
}