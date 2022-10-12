public class UmsatzDemo {

    public static void main(String[] args) {

        double[] umsaetze = new double[12];
        umsaetze = new double[]{1232.4, 2343.2, 2313.3, 4321, 6932.3, 3243.2, 1232.4, 2343.2, 2313.3, 4321, 6932.3, 3243.2};
        int neueVar = getUmsatzsteigerung(umsaetze);


    }


    public static int getUmsatzsteigerung(double[] umsaetze) {
        int counter = 0;
        double hilfsvariable1 = 1.1;

        for (int i = 1; i < umsaetze.length; i++) {

            if ((umsaetze[i] / umsaetze[i-1]) > hilfsvariable1)
                counter++;
        }
        System.out.println("Es gibt " + counter + " Monate mit über 10% Umsatzsteigerung");

        return counter;
    }


}


