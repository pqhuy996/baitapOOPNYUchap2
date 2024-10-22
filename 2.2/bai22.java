public class bai22 {
    public static void main(String[] args){
        Author22[] author1s = new Author22[2];
        author1s[0] = new Author22("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        author1s[1] = new Author22("Paul Tan", "Paul@nowhere.com", 'm');
        Book22 javaDummy = new Book22("Java for Dummy", author1s, 19.99, 99);
        System.out.println(javaDummy);
    }
}
