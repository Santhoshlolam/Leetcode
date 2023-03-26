class Solution {
    public int[] plusOne(int[] digits) {
      /*  String str=String.valueOf(digits[0]);
        for(int i=1;i<digits.length;i++)
        {
            str=str+String.valueOf(digits[i]);
        }
        int num=Integer.parseInt(str);
        num=num+1;
        String str2=String.valueOf(num);
        int[] arr=new int[str2.length()-1];
        int i=0;
        while(num!=0)
        {
            arr[i]=num%10;
            num=num/10;
            i++;
        }
        int k=0;
        int n=str2.length()-1;
        while(k<n)
        {
            int temp=arr[k];
            arr[k]=arr[n];
            arr[n]=temp;
          k++;
          n--;
        }
        return arr;*/
      /*  int num=0;
        for(int i=0;i<digits.length;i++)
        {
            num=num*10+digits[i];
            
        }
      //  System.out.println(num);
        num=num+1;
        String str="";
        str=str+num;
        //System.out.println(str);
        int[] arr=new int[str.length()];
        for(int i=0;i<str.length();i++)
            arr[i]=str.charAt(i)-'0';
        return arr;   */
      
    int carry=1;  
        int n=digits.length;
        for(int i=n-1;i>=0;i--)
        {
            int sum=digits[i]+carry;
            carry=sum/10;
            digits[i]=sum%10;
        }
        if(carry==0)
            return digits;
        else
        {
            int[] arr=new int[n+1];
            arr[0]=carry;
            for(int i=1;i<digits.length;i++)
                arr[i]=digits[i];
            return arr;
        }
        
        
        
        
    }
}