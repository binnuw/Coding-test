import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int k = 1; k <=b; k++) {
            for(int i = 1; i<= a; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}