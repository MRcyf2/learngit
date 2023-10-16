import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int num = sin.nextInt();
        int times = sin.nextInt();
        List<Integer> v = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            v.add(i);
        }

        int[][] change = new int[times][2];
        for (int i = 0; i < times; i++) {
            int x = sin.nextInt();
            int y = sin.nextInt();
            change[i][0] = x;
            change[i][1] = y;

            int j = 0;
            while(j<v.size())
            {
                j++;
                if(v.get(j)==change[i][0])
                    break;

            }

            v.remove(j);
            v.add(j + y, change[i][0]);

//            for (int k = 0; k < v.size(); k++) {
//                System.out.print(v.get(k) + " ");
//            }
//            System.out.println();
        }
        for (int k = 0; k < v.size(); k++) {
            System.out.print(v.get(k) + " ");
        }
    }
}
