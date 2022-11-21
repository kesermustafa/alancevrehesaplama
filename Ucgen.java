package alancevrehesaplama;

public class Ucgen extends Sekil{

   /*
   sekil <--Üçgen    cevre = a+b+c
    Alan = √(s(s-a)(s-b)(s-c))   ==== s = (a+b+c)/2
   */

    public double ucgenCevre(double a, double b, double c){
        return a+b+c;
    }

    public double ucgenAlan(double a, double b, double c){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }







}
