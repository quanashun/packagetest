package top.ashun.packagetest;


import top.ashun.packagetest.util.MyStringUtil;

/**
 * @author 18483
 */
public class MainApplication{
    public static void main(String[] args) {
        //访问静态成员
        MyStringUtil.getPublicStaticString();
        System.out.println(MyStringUtil.publicStaticString);

        //访问实例成员
        MyStringUtil myStringUtil = new MyStringUtil();
        myStringUtil.getPublicObjectString();
        System.out.println(myStringUtil.publicObjectString);
    }
}
