package BT2_Phamvitruycap.person;

public class Person {
    public String name;
    public int age;
    public String gender;
    public String address;
    public String phone;

    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public void getInfo() {
        System.out.println("Tên :" + this.name);
        System.out.println("Tuổi :" + this.age);
        System.out.println("Giới tính: " + this.gender);
        System.out.println("Địa chỉ: " + this.address);
        System.out.println("SĐT: " + this.phone);
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}


