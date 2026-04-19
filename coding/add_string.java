class Solution {
    public String addStrings(String num1, String num2) {
        if(num1==null)return num2;
        if(num2==null)return num1;

     int i=num1.length()-1;
     int j=num2.length()-1;
     int carry=0;
     StringBuffer str=new StringBuffer();
    while(i>=0 || j>=0)
    {
        int number1=0,number2=0,sum=0;
       if(i>=0)
       {
         number1=num1.charAt(i)-'0';
         i--;
       }

       if(j>=0)
       {
         number2=num2.charAt(j)-'0';
         j--;
       }
       sum = number1 + number2 + carry;
       if(sum >= 10)
       {
         carry=sum/10;
         str.append(sum%10);
       }else
       {
        str.append(sum);
        carry=0;
       }

       if(i<0 && j<0 && carry!=0)
       {
        str.append(carry);
       }
      
    }
     str.reverse();
     return str.toString();
    }
}
