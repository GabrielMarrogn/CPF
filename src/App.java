import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        
        String[] arr = new String[3];
        arr = a.split("\\.");

        String[] arr2 = new String[2];
        arr2 = arr[2].split("-");

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
    }
}
