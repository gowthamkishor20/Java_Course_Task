class Grtest_ele_in_arr
 {

    public static void main(String[] gk)
    {
        int arr[] = new int[gk.length];
        for (int i=0; i<arr.length; i++)
        {
          arr[i] = Integer.parseInt(gk[i]);
        }
    grt_ele(arr);
    }
 static void grt_ele(int arr[])
 {
        int temp;
        for(int i=0;i<arr.length;i++)
        {
          for(int j=i;j<arr.length;j++)
          {
            if(arr[i]<arr[j])
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
                
          }
            
        }
       System.out.println(arr[0]+" is the Greatest element"); 
  }
}