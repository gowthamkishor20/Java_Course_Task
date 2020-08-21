class Deci_to_bin
{  
  public static long deci_to_bin(int n)
  {
     long bin = 0;
     int remain, i;
     for(i = 1; n != 0; i = i * 10)
     {
        remain = n % 2;
        n /= 2;
        bin += remain * i;
      }
      return bin;
  }

  public static void main(String[] gk)
  {
     System.out.println("Decimal Num: "+gk[0] );
     int n = Integer.parseInt(gk[0]);
     System.out.println("Binary Num: " + deci_to_bin(n));
  }
}