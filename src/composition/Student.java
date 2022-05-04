package composition;

public class Student{

    private String name;
    private int age;
    private Address studentAddress;

    public Student(String streetAddress, int zipCode, String state, String phone, String name, int age) {
        studentAddress = new Address(streetAddress, zipCode, state, phone);
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Address Method Extensions
    public String getPhone() {
        return studentAddress.getPhone();
    }
    public void setPhone(String phone) {
        studentAddress.setPhone(phone);
    }

    public String getState() {
        return studentAddress.getState();
    }
    public void setState(String state) {
        studentAddress.setState(state);
    }

    public String getStreetAddress() {
        return studentAddress.getStreetAddress();
    }
    public void setStreetAddress(String streetAddress) {
        studentAddress.setStreetAddress(streetAddress);
    }

    public int getZipCode() {
        return studentAddress.getZipCode();
    }
    public void setZipCode(int zipCode) {
        studentAddress.setZipCode(zipCode);
    }
}
