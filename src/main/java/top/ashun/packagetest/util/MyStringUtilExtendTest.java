package top.ashun.packagetest.util;

/**
 * @author 18483
 */
public class MyStringUtilExtendTest extends MyStringUtil{
    public static void main(String[] args) {
        MyStringUtil myStringUtil = new MyStringUtil();
        myStringUtil.getPublicObjectString();
        myStringUtil.getDefaultObjectString();
        myStringUtil.getProtectedObjectString();
        MyStringUtil.getPublicStaticString();
        MyStringUtil.getDefaultStaticString();
        MyStringUtil.getProtectedStaticString();
    }
}
