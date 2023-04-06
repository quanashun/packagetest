package top.ashun.packagetest;

import top.ashun.packagetest.util.MyStringUtil;

/**
 * @author 18483
 */
public class MyStringUtilExtendTest extends MyStringUtil{
    public static void main(String[] args) {
        //实例成员
        MyStringUtil myStringUtil = new MyStringUtil();
        myStringUtil.getPublicObjectString();
        System.out.println(myStringUtil.publicObjectString);

        //静态成员
        MyStringUtil.getPublicStaticString();
        MyStringUtil.getProtectedStaticString();
        System.out.println(MyStringUtil.publicStaticString);
        System.out.println(MyStringUtil.protectedStaticString);
    }
}
