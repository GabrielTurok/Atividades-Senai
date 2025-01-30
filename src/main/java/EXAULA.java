

public class EXAULA {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products: \n%s, whichpriceis$ %.2f \n%s, whichpriceis$ %.2f \n \nRecord: %d yearsold, code%d andgender : %s\n  \nMeasue witheight decimal places: %.8f\nRouded(three decimal places): %.3f\nUS decimal point: %.3f ", product1, price1,product2, price2, age, code,gender, measure, measure, measure);
    }
}
