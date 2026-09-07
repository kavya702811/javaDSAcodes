package Demo;
public class countfrequency {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 3, 2};
        for (int i = 0; i < arr.length; i++) {
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " = " + count);
        }
    }
}