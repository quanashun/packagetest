package top.ashun.packagetest.util;

/**
 * @author 18483
 */
public class MyStringUtilTest {
    public static void main(String[] args) {
        //实例成员
        MyStringUtil myStringUtil = new MyStringUtil();
        myStringUtil.getPublicObjectString();
        myStringUtil.getDefaultObjectString();
        myStringUtil.getProtectedObjectString();

        //静态成员
        MyStringUtil.getPublicStaticString();
        MyStringUtil.getDefaultStaticString();
        MyStringUtil.getProtectedStaticString();
    }
}
