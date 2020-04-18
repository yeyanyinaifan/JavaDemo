package demo;

import java.io.Serializable;
import java.util.Objects;

public class fu implements Serializable {
    private int fuNum = 999;
    static final long serialVersional = 1L;

    public void fuMethod() {
        System.out.println("fuNum:" + this.fuNum);
    }

    public fu() {
    }

    public fu(int fuNum) {
        this.fuNum = fuNum;
    }

    public void setFuNum(int fuNum) {
        this.fuNum = fuNum;
    }

    public int getFuNum() {
        return fuNum;
    }

    @Override
    public String toString() {
        return "fu{" +
                "fuNum=" + fuNum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        fu fu = (fu) o;
        return fuNum == fu.fuNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fuNum);
    }
}
