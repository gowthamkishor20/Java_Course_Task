class Fib
{  
    static int n1=0,n2=1,n3=0;    
    static void fib_series(int num)
    {    
        if(num>0)
        {    
            n3 = n1 + n2;    
            n1 = n2;    
            n2 = n3;    
            System.out.print(" "+n3);   
            fib_series(num-1);    
        }    
    }    
    public static void main(String[] gk)
    {    
        int num = Integer.parseInt(gk[0]);    
        System.out.print(n1+" "+n2);    
        fib_series(num-2);   
    }  
}
 