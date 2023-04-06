package top.ashun.packagetest.util;

/**
 * @author 18483
 */
public class MyStringUtil {
    public static String publicStaticString= "publicStaticString";
    public String publicObjectString = "publicObjectString";

    static String defaultStaticString = "defaultStaticString";
    String defaultObjectString = "defaultObjectString";

    protected static String protectedStaticString = "protectedStaticString";
    protected String protectedObjectString = "defaultObjectString";

    private static String privateStaticString = "privateStaticString";
    private String privateObjectString = "privateObjectString";

    public static String getPublicStaticString(){
        return "getPublicStaticString";
    }

    public String getPublicObjectString(){
        return "getPublicObjectString";
    }



    static String getDefaultStaticString(){
        return "getDefaultStaticString";
    }

    String getDefaultObjectString(){
        return "getDefaultObjectString";
    }



    protected static String getProtectedStaticString(){
        return "getProtectedStaticString";
    }

    protected String getProtectedObjectString(){
        return "getProtectedObjectString";
    }



    private static String getPrivateStaticString(){
        return "getPrivateStaticString";
    }

    private String getPrivateObjectString(){
        return "getPrivateObjectString";
    }

    static {
        String s;
        s = MyStringUtil.getPublicStaticString();
        s = MyStringUtil.getDefaultStaticString();
        s = MyStringUtil.getProtectedStaticString();
        s = MyStringUtil.getPrivateStaticString();
        System.out.println(s);
    }
    static {
        String s;
        MyStringUtil myStringUtil = new MyStringUtil();
        s = myStringUtil.getPublicObjectString();
        s = myStringUtil.getDefaultObjectString();
        s = myStringUtil.getProtectedObjectString();
        s = myStringUtil.getPrivateObjectString();
        System.out.println(s);
    }
}
