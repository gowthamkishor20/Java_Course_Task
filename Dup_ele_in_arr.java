class Dup_ele_in_arr
{
    public static void main(String[] gk)
    {
         int arr[] =new int[gk.length];
         for(int i=0;i<arr.length;i++)
         {
           arr[i]=Integer.parseInt(gk[i]);
          }
      dup_ele(arr);
    }
   static void dup_ele(int arr[])
   {
         for(int i=0;i<arr.length;i++)
         {
           int count=0;
             for(int j=i;j<arr.length;j++)
             {
                 if(arr[i]==arr[j])
                 {       
                     count++;
                  }
              }   
                  if(count==2)
                  {
                     System.out.println(arr[i]);
                  }    
          }
    }
}