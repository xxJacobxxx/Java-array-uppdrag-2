import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner (System.in);
        int [] fält1 = new int [4];
        System.out.println("Droppa lite tal");
        fält1[0] = tb.nextInt();
        fält1[1] = tb.nextInt();
        fält1[2] = tb.nextInt();
        fält1[3] = tb.nextInt();
        int middle = fält1[0];
        fält1[0] = fält1[3];
        fält1[3] = middle;
        middle = fält1[1];
        fält1[1] = fält1[2];
        fält1[2] = middle;

        System.out.println("Finit, Nexxt progratime");
        

    }
}
