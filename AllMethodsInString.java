public class AllMethodsInString {
    //String Comperssion
    public static void main(String args[])
    {
        String str=new String("aabbiissuu");
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'|| ch=='i'||ch=='o'||ch=='u')
            {
                count++;
            }
        }
        System.out.println("Vowel is:"+count);
    }
    
}



/*-------------------------------------------------------------
//PALINDROME
public class PalindromeString {
        public static boolean isPalindrome(String str)
        {
            for(int i=0;i<str.length()/2;i++)
            {
                int n=str.length();
                if(str.charAt(i)!=str.charAt(n-1-i))
                {
                    //not palindrome
                    return false;
                }
            }
            return true;
        }
    
    public static void main(String args[])
    {
        String str="racecar";
        System.out.println(isPalindrome(str));
    }
    
}
--------------------------------------------------------
//Shortest path using East , West , North , South
public class PalindromeString {
    //Shortest path using East , West , North , South
    public static float ShortestPath(String path)
    {
        int x=0,y=0;

        for(int i=0;i<path.length();i++)
        {
            char dir=path.charAt(i);
            //south
            if(dir=='S')
            {
                y--;
            }
            //North
           else if(dir=='N')
            {
                y++;
            }
            //West
            else if(dir=='W')
            {
                x--;
            }
            //East
            else
            {
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return(float)Math.sqrt(X2+Y2);
    }     
    public static void main(String args[])
    {
        String path="WNEENESENN";
        System.out.println(ShortestPath(path));
    }   
}
----------------------------------------------------------
    //COMPARISION
    public static void main(String args[])
    {
        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");

        if(s1.equals(s2))
        {
            System.out.println("Strings are equal");
        }
        else 
        {
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3))
        {
            System.out.println("Strings are equal");
        }
        else 
        {
            System.out.println("Strings are not equal");
        }
    }
    
}
-----------------------------------------------------------
  //SubString
public class AllMethodsInString {
    public static String SubString(String str, int si, int ei)
    {
        String substr="";
        for(int i=si; i<ei;i++)
        {
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[])
    {
        String str="HelloWorld";
        System.out.println(SubString(str, 0, 5));
        
    }
    
}
---------------------------------------------------------
 //largest String
public class AllMethodsInString {
    public static void main(String args[])
    {
        String fruits[]={"apple","mango","banana"};

        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++)
        {
            if(largest.compareTo(fruits[i])<0)
            {
                largest=fruits[i];
            }
        }
        System.out.println(largest);
        
    }
    
}
-------------------------------------------------------------------
//Small String
public class AllMethodsInString {
    public static void main(String args[])
    {
        String fruits[]={"apple","mango","banana"};

        String smalleString=fruits[0];
        for(int i=1;i>fruits.length;i++)
        {
            if(smalleString.compareTo(fruits[i])<0)
            {
               smalleString=fruits[i];
            }
        }
        System.out.println(smalleString);
        
    }
    
}
------------------------------------------------------------------------------
 //String Builder
public class AllMethodsInString {
    public static void main(String args[])
    {
        StringBuilder sb =new StringBuilder(" ");
        for(char ch='a';ch<='z';ch++)
        {
            sb.append(ch);
        }
        System.out.println(sb);
        
    }
    
}
---------------------------------------------------------------------------------------
 //String First Letter Is In UpperCase
public class AllMethodsInString {
    public static String toUpperCase(String str)
    {
        StringBuilder sb=new StringBuilder("");

        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' '&& i<str.length()-1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }
    public static void main(String args[])
    {
        String str="hi, i am shradha";
        System.out.println(toUpperCase(str));
        
    }
    
}
--------------------------------------------------------
//String Comperssion
public class AllMethodsInString {
    public static String Compress(String str)
    {
        String newStr=" ";
        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1)
            {
                newStr +=count.toString(i);
            }

        }
        return newStr;

    }
    public static void main(String args[])
    {
        String str="aaabbcccdd";
        System.out.println(Compress(str));
        
    }
    
}
*/
