package JdbcDemo;

public class Student {

    private Integer Id;
    private String Username;
    private Integer Math;
    private Integer English;
    private Integer Chinese;

    public Student() {
    }

    public Student(Integer id, String username, Integer math, Integer english, Integer chinese) {
        Id = id;
        Username = username;
        Math = math;
        English = english;
        Chinese = chinese;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public Integer getMath() {
        return Math;
    }

    public void setMath(Integer math) {
        Math = math;
    }

    public Integer getEnglish() {
        return English;
    }

    public void setEnglish(Integer english) {
        English = english;
    }

    public Integer getChinese() {
        return Chinese;
    }

    public void setChinese(Integer chinese) {
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
