
package fibonaccirecursivo;

public class FibonacciRecursivo {
  
    public static void main(String[] args) {
        int a=0;
        System.out.println("La serie Fibonacci es: ");
        while(a!=10){
            System.out.print(serie(a)+"-");
            a++;
        }
    }    
    public static int serie(int s){
        if(s==0 || s==1){
            return 1;
        }else{
            return serie(s-1)+serie(s-2);
        }
    }

}
            
            
        
