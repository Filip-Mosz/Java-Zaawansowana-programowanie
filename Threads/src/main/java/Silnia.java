import java.math.BigDecimal;

public class Silnia {
    public static BigDecimal silnia(int podstawa) {
        BigDecimal wynik = new BigDecimal("1");

        if (podstawa != 0) {
            for (int i = 1; i <= podstawa; i++) {
                wynik = wynik.multiply(BigDecimal.valueOf(i));
                System.out.println(wynik);
            }
        }
        return wynik;
    }
}
