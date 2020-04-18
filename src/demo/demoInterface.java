package demo;

public interface demoInterface {
    public static final int NUM = 0;
    
    public abstract void method();

    public default void methodDefault() {
        System.out.println("默认方法");
    }

    public static void methodStatic() {
        System.out.println("静态方法");
    }

//    private void  methodPrivate() {
//        System.out.println("私有方法");
//    }
}
