import java.util.*;

public class Maximise_the_Tastiness {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int a = s.nextInt(),b= s.nextInt(),c=s.nextInt(),d=s.nextInt();
            System.out.println(Math.max(a,b)+Math.max(c,d));
            
        }
    }
}
