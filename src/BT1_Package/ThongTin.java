package BT1_Package;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();

        nv.setName("Hương");
        nv.setAge(24);
        nv.setAddress("Hà Nội");
        nv.setGender("Nữ");
        nv.setPhone("123456789");

        System.out.println("Họ và tên: " + nv.getName());
        System.out.println("Tuổi: " + nv.getAge());
        System.out.println("Địa chỉ: " + nv.getAddress());
        System.out.println("Giới tính: " + nv.getGender());
        System.out.println("SĐT: " + nv.getPhone());
    }
}