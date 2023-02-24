package student;


public class student {
    private String name;
    private int age;
    private String address;
    private String className;

    public student(String name, int age, String address, String className) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void getStudentInfo() {
        System.out.println("Student Name: " + this.getName());
        System.out.println("Student Age: " + this.getAge());
        System.out.println("Student Address: " + this.getAddress());
        System.out.println("Student ClassName: " + this.getClassName());
    }
}
