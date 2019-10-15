package ba.unsa.etf.rpr;
import java.util.Scanner;
public class Main {

    static int sumaCifara(int x){
        int sum=0, p=0;
        do{
            p=x%10;
            sum+=p;
            x=x/10;
        }
        while(x!=0);
        return sum;
    }
    public static void main(String[] args) {

        int n;
        Scanner ulaz= new Scanner(System.in);
        System.out.println("Unesi broj: ");
        n=ulaz.nextInt();
        for(int i=1; i<=n; i++){
            if(i%sumaCifara(i)==0) System.out.println(" "+i);
        }
    }
}
