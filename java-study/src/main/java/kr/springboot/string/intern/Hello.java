package kr.springboot.string.intern;

public class Hello {

    public static void main(String[] args) {

        String a = "a";
        String aa = "aa";
        String aaa = "aaa";


        System.out.println(aaa == (a + aa).intern());
        System.out.println("aaa" == aaa.intern());
        System.out.println("aaa".intern() == aaa);

        System.out.println("aaa".hashCode());
        System.out.println(aaa.hashCode());

    }

}
