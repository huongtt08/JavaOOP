package BT2_Phamvitruycap.person;

public class Information extends Person {
    public Information(String name, int age, String gender, String address, String phone) {
        super(name, age, gender, address, phone);
    }

    public static void main(String[] args) {
        Information info = new Information("Mi", 20, "Nữ", "Hà Nội", "123456");
        info.getInfo();

    }


}
