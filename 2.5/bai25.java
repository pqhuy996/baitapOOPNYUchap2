public class bai25 {
    public static void main(String[] args) {
        Customer customer1 = new Customer(101, "Nguyen Van A", 'm');
        System.out.println("Thông tin khách hàng:");
        System.out.println(customer1);
        Account account1 = new Account(1001, customer1, 500.0);
        System.out.println("\nThông tin tài khoản ban đầu:");
        System.out.println(account1);
        account1.deposit(200.0);
        System.out.println("\nSau khi nạp thêm 200.0:");
        System.out.println(account1);
        account1.withdraw(150.0);
        System.out.println("\nSau khi rút 150.0:");
        System.out.println(account1);
        account1.withdraw(700.0);
        System.out.println("\nSau khi cố gắng rút 700.0 (vượt số dư):");
        System.out.println(account1);
        Account account2 = new Account(1002, customer1);
        System.out.println("\nTạo tài khoản mới không có số dư ban đầu:");
        System.out.println(account2);
    }
}
