import java.util.Scanner;
class finalassignment
{
public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
      		String s = in.nextLine();
      		System.out.println("The entered string is "+s);
		char[] c=s.toCharArray();
                int sz=c.length;
                int count=0;
                int len=s.length();
                System.out.println("Count the no of occurance of particular char in the string  ");
                 for(int i=0;i<sz;++i)
                     {
                        count=0;
                        for(int j=0;j<sz;++j)
                          {
                               if(j<i && c[i]==c[j])
                                 {
                                     break;
                                 }
                                if(c[j]==c[i])
                                 {
                                   count++;
                                 }
                                if(j==sz-1)
                                   {
                                     System.out.println("the character "+c[i]+" is present "+count+" times");
                                   }
                           }
                     }

                  System.out.println("Capitalize the alternate char of the string ");
	
		for (int i = 0;i < len; i++)
		{
    			char ch = s.charAt(i);
    			if (i % 2 == 0) 
			{
        			System.out.print(Character.toLowerCase(ch));
   			}
			else
			{
        			System.out.print(Character.toUpperCase(ch));
    			}
		}
		System.out.println();
}
}
