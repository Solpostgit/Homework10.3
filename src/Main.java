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
        String phone = "9604157537";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
// Записываем строку expectedPhone («ожидаемыйТелефон»)
        if (phone.equals(expectedPhone)) {
// Сравниваем phone с expectedPhone с помощью метода equals()
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
    }
}