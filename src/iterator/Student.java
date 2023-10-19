package iterator;

public class Student {
    private String regNo;
    private String name;
    private String gender;
    private String phoneNumber;

    public Student(String regNo, String name, String gender, String phoneNumber) {
        this.regNo = regNo;
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}