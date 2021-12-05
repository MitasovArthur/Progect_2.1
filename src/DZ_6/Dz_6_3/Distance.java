package DZ_6.Dz_6_3;

class Distance {
    double distance;

   // public Distance(double distance) {
   //     this.distance = distance;
 //   }

    void print() {
        System.out.println();
    }

    static class Convector {
        static double sm_m(double distance){
            return distance *100;
        }
        static double sm_km(double distance){
            return distance *10000;
        }
        static double m_km(double distance){
            return distance *1000;
        }
        static double m_sm(double distance){
           return distance/100;
        }
        static double km_m(double distance){
            return distance/1000;
        }
        static double km_sm(double distance){
            return distance/10000;
        }
    }
}
class main{
    public static void main(String[] args) {
        Distance distance = new Distance();
        System.out.println(Distance.Convector.sm_m(12));
    }
}
