class Countcononents{
public static void main(String[] args){
String str="java is programming language";
str=str.replaceAll("[aeiouAEIOU]","");
String[] s=str.split(" ");
for(int i=0;i<s.length;i++)
{System.out.println(s[i]+s[i].length()+" ");
}
}
}