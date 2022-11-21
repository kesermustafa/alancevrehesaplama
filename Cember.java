package alancevrehesaplama;

public class Cember extends Sekil {

    // Alanı = π x r2    Cevre = 2πr

    @Override
    public double cevreHesapla(double a) {
        return (2*3.14)*a;
    }

    @Override
    public double alanHesapla(double a) {
        return 3.14*(a*a);
    }
}
