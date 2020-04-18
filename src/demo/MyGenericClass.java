package demo;

public class MyGenericClass<MVP> {
    private MVP mvp;

    public void setMVP(MVP mvp) {
        this.mvp = mvp;
    }

    public MVP getMVP() {
        return mvp;
    }

    public static <S> void method(S s) {
        System.out.println(s);
    }
}
