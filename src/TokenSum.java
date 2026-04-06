import java.util.*;

public class TokenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        StringTokenizer st = new StringTokenizer(input);
        int sum = 0;
        
        while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
        }
        
        System.out.print(sum);
    }
}
