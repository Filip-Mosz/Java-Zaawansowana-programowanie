package FilipM.differentExcercise;

public class test {
    public static void main(String[] args) {
        System.out.println("spacja->\u0020<-spacja");
        System.out.println(".(\u002e)/?(\u003f)/!(\u0021)");
        String smtg = String.valueOf(' ');
        System.out.println(smtg.matches("[ .?!]*"));
    }
}
