public class ConvertANumberToHexadecimal_405 {
    public static void main(String[] args) {
        int num=26;
        System.out.println("The integer is:"+num);
        System.out.println("Number in hexadecimal is:"+toHex(num));
    }
    public static String toHex(int num) {
        if(num==0)
        {
            return "0";
        }
        
        char[] hexChars={
            '0','1','2','3','4','5','6','7',
            '8','9','a','b','c','d','e','f'
        };

        StringBuilder result=new StringBuilder();

        while(num!=0)
        {
            result.append(hexChars[num & 15]);
            num>>>=4;
        }
        return result.reverse().toString();
    }
}

