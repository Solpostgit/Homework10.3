public class Main {
    public static void main(String[] args) {
        task1();/*
        task1();
        task1();
        task1();
        task1();*/
    }

    public static void task1() {
        System.out.println("Task 1");
        String phone = "79604503737";
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Номер телефона длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Номер телефона короткий");
        }
        System.out.println("phone = " + phone);
    }
}