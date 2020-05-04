package test;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/04/27 21:02
 */
class Price {
    static Price P = new Price(2.7);
    static double apple = 20;
    double Price;

    public Price(double orange) {
        Price = apple - orange;
    }
}

public class PriceTest {
    public static void main(String[] args) {
        System.out.println(Price.P.Price);
    }

}
