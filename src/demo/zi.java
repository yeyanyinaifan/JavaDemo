package demo;

import java.util.Objects;

public class zi extends fu implements Comparable<zi>{
    private int ziNum = 666;

    public void ziMethod() {
        System.out.println("ziNum:" + this.ziNum);
        System.out.println("fuNum:" + super.getFuNum());
    }

    public zi() {
    }

    public zi(int ziNum) {
        this.ziNum = ziNum;
    }

    public int getZiNum() {
        return ziNum;
    }

    public void setZiNum(int ziNum) {
        this.ziNum = ziNum;
    }

    @Override
    public String toString() {
        return "zi{" +
                "ziNum=" + ziNum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        zi zi = (zi) o;
        return ziNum == zi.ziNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ziNum);
    }


    @Override
    public int compareTo(zi o) {
        // 自定义比较的规则
        return this.getZiNum() - o.getZiNum();
    }
}
