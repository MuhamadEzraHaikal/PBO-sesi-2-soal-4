class Takjil {
    String nama;
    int harga;

    // Konstruktor untuk menginisialisasi nama dan harga takjil
    Takjil(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Method untuk menampilkan informasi takjil
    void tampilkanInfo() {
        System.out.println("Takjil: " + this.nama);
        System.out.println("Harga: Rp" + this.harga);
    }
}

public class Infotakjil {
    public static void main(String[] args) {
        // Membuat objek takjil dengan nama "Kolak Pisang" dan harga 5000
        Takjil takjil1 = new Takjil("Kolak Pisang", 5000);
        
        // Memanggil method untuk menampilkan informasi takjil
        takjil1.tampilkanInfo();
    }
}
