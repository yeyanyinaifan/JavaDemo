package demo;

public class Student {

    private long Id;
    private String Username;
    private int Math;
    private int English;
    private int Chinese;

    public Student() {
    }

    public Student(long id, String username, int math, int english, int chinese) {
        Id = id;
        Username = username;
        Math = math;
        English = english;
        Chinese = chinese;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Username='" + Username + '\'' +
                ", Math=" + Math +
                ", English=" + English +
                ", Chinese=" + Chinese +
                '}';
    }
}
