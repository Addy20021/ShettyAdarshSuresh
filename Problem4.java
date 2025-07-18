import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter numbers separated by space:");
        String line = sc.nextLine();
        String[] ps = line.split(" ");

        int[] input = new int[ps.length];
        for (int i = 0; i < ps.length; i++) {
            input[i] = Integer.parseInt(ps[i]);
        }

       
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            map.put(i, 0);
        }

       
        for (int num : input) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    map.put(i, map.get(i) + 1);
                }
            }
        }

        
        System.out.println(map);
    }
}
