import java.util.Scanner;

public class FindNumber {
    public static void large(int n1,int n2,int n3){
        if(n1>n2 && n1>n3){
            System.out.println(n1+" is large");
        } else if (n2>n1 && n2>n3) {
            System.out.println(n2+" is large");

        }
        else{
            System.out.println(n3+" is large");
        }
    }
    static void smal(int n1,int n2,int n3){
        if(n1<=n2 && n1<=n3){
            System.out.println(n1+" is small");
        } else if (n2<=n1 && n2<=n3) {
            System.out.println(n2+" is small");

        }
        else{
            System.out.println(n3+" is small");
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter number \n 1-Find Largest of 3 numbers \n 2-find smallest of 3 numbers " +
                "\n 3-check prime or not \n 4-check even or not \n 5-  reverse of your number 6-Exit");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Enter 3 numbers...\n");
                Scanner sc1=new Scanner(System.in);
                large(sc1.nextInt(),sc1.nextInt(),sc1.nextInt());
                break;
            case 2:
                System.out.println("Enter 3 numbers...");
                Scanner sc2=new Scanner(System.in);
                smal(sc2.nextInt(),sc2.nextInt(),sc2.nextInt());
                break;


        }
    }
}
