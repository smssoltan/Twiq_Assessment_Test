import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class twq {
    public static long calNumbs(int x, int y, String op) {
        long sum=0;
        if (op=="+"){sum =x+y; }
        else if (op=="*"){sum =x*y; }
        else if (op=="/"){sum =x/y; }
        else if (op=="-"){sum =x-y; }
        else if (op=="%"){sum =x%y; }
        return sum;
    }

    public static String toUpper(String str){
        return str.toUpperCase();
    }

    public static int largestEven(int[] array){
        int[] newArray= new int[array.length];
        int max=0;

        for (int x=0; x < array.length;x++){

            int index=array[x];
            int rem=index%2;
            if(rem==0){
                newArray[x]=index;
         }
            else ;
        }
        for (int x=0; x<newArray.length;x++){
            if(newArray[x]>=max){max=newArray[x];}
            else ;
            }

        return max;
    }

    public static String invertCase(String value){
        String newValue = value;
        char[] chars = newValue.toCharArray();
        for(int x=0;x<newValue.length();x++){
            char c = chars[x];
            if (Character.isUpperCase(c)){chars[x] = Character.toLowerCase(c);}
            else if (Character.isLowerCase(c)){chars[x] = Character.toUpperCase(c);;}
            else;
        }
        return new String(chars);
    }

    public static String timeConvert(int sec) {
        String Time;
        double timeinSec =sec /60.0;
        String str = String.format("%.02f", timeinSec);
        String substr=str.substring(str.indexOf('.')+1,str.indexOf('.')+3);
        long minutes= sec / 60;
        long hours;
        if(sec %60==0 ){ timeinSec = 0; }
        else if (timeinSec>=60 ){timeinSec=Integer.parseInt(substr);}

        if (sec %3600==0 ){minutes= 0;}
        else if (minutes>=60 ){minutes=minutes-60;}
        hours = sec / 3600;
        Time = String.format("%02d", hours)+":"+String.format("%02d", minutes)+":"+substr;
        return  Time;
    }

    public static int toAsciiCode(String symbol){
        char c=symbol.charAt(0);
        int castAscii = (int) c;

        return castAscii;

    }

}