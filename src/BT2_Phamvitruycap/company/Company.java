package BT2_Phamvitruycap.company;

import BT2_Phamvitruycap.person.Person;

public class Company extends Person {
    public Company(String name1, int age1, String gender1) {
        super(name1, age1, gender1);
    }

    public static void main(String[] args) {
        Company company = new Company("Hoa", 22, "Nữ");
        company.getInfo();
    }


}



