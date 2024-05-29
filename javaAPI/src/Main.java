import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        byte[] b={23,54,67,87,78,84,55};
//        System.out.println(getStrByByte(b));
//        char[] c={12,43,456,654,34654,4325,225};
//        System.out.println(getStrByChar(c));
//        String s="china";
//        StringBuffer stringBuffer=new StringBuffer(s);
//        stringBuffer.append("NB");//添加
//        System.out.println(stringBuffer);
//        stringBuffer.delete(5,7);//删除
//        System.out.println(stringBuffer);
//        stringBuffer.replace(5,7,"AiNi");//替换
//        System.out.println(stringBuffer);
//        stringBuffer.reverse();
//        System.out.println(stringBuffer);
//        stringBuffer.reverse();//翻转
//        String s1=stringBuffer.substring(0,5);//截取
//        System.out.println(s1);
//        //String
//        //String：字符串是常量，作为方法形参传递,不会改变实际参数，一旦被赋值不能被更改；
//        // 每次对String的操作都会生成新的String对象，这样效率低下并且会浪费有限的内存空间；
//        //StringBuilder
//        // StringBuilder：线程不安全的类，能够被多次的修改并且不产生新的未使用对象，
//        // 单线程程序中使用，不同步，执行效率高
//
//        int[] arr={1,3,6754,242,5365,236352,342,3425,523,552,342};
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        System.out.println(Arrays.binarySearch(arr,552));
//        //java常见面试题
//        //12
//        String s2="abc";
//        String s3="abc";
//        System.out.println(s2==s3);//true地址相等，说明是同一个对象
//        System.out.println(s2.equals(s3));//true值相等
//        String s4=new String("abc");//创建了两个对象
//        System.out.println(s2==s4);//false地址不相等，说明是不同的两个对象
//        System.out.println(s2.equals(s4));//true,值相等
//        String s5="a"+"b"+"c";
//        System.out.println(s5==s2);
        String a="abc";
        String b="abd";
        int i=a.compareTo(b);
        System.out.println(i);
        System.out.println('河'+0);
        String s1="                                   nrtrewghntge rghnhf reht ";
        System.out.println(s1.trim());//只清除开头结尾的空格


    }
    public static String getStrByByte(byte[] b){//字节数组转换为字符串
        return new String(b);
    }
    public static String getStrByChar(char[] c){//字符数组转换为字符串
        return new String(c);
    }

}