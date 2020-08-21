import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> points = new ArrayList<List<Integer>>();
        int ans = 0;
    
        int n = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        for (int i=0; i<n; i++) {
            points.add(Arrays.asList(sc.nextLine().split(" ", 0)).stream().map(str -> Integer.valueOf(str)).collect(Collectors.toList()));
        }
        for (List<Integer> point: points) {
            if(distanceFromOrigin(point) <= (double)d) { 
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static double distanceFromOrigin(List<Integer> point) {
        double p = (double)point.get(0);
        double q = (double)point.get(1);
        return Math.sqrt(p*p + q*q);
    }
}

