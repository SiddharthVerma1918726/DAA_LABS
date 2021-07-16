import java.util.*;
public class Linear{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=scan.nextInt();
        int k=scan.nextInt();
        int step=0;
        int i=0;
    for( i=0;i<n;i++){
        if(arr[i]==k){
            step++;
            System.out.println(k+" is present and total comparsions "+step);
        }
        step++;
    }
    if(i>=n){
        System.out.println(k+" is not present ");
    }
        scan.close();

    }
}