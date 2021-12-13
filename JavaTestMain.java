import java.io.BufferedReader;
import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * JavaTestMain
 */
public class JavaTestMain {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("cakeOrder.txt"));
        // PrintWriter pickOut = new PrintWriter(new FileWriter("pickup.txt"));
        // PrintWriter delOut = new PrintWriter(new FileWriter("delivery.txt"));

        String buffer = null;
        while ((buffer = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(buffer, "*");

            Cake cake = new Cake(st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()));
            System.out.println(cake.toString());
        }
    }
}