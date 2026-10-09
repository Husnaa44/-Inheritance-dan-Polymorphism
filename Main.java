public class Main {
    public static void main(String[] args) {
        Bentuk b = new Bentuk("pink");
        b.print();

        BujurSangkar bs = new BujurSangkar(2, "tosca");
        bs.print();

        Lingkaran l = new Lingkaran(3, "abu");
        l.print();

        Silinder s = new Silinder(5, 3, "coklat");
        s.print();
    }
}