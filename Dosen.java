import java.util.ArrayList;
import java.util.List;

public class Dosen {
    private String nama;
    private String kodeDosen;
    // Task 1.1: Tambahkan atribut List
    private List<Mahasiswa> mahasiswaBimbingan;

    public Dosen(String nama, String kodeDosen) {
        this.nama = nama;
        this.kodeDosen = kodeDosen;
        this.mahasiswaBimbingan = new ArrayList<>(); // <-- Ini sekarang valid
    }

    // Task 1.2: Buat metode tambahMahasiswaBimbingan
    public void tambahMahasiswaBimbingan(Mahasiswa mhs) {
        this.mahasiswaBimbingan.add(mhs);
        
        // Task 1.3: Pastikan relasi dua arah
        // Memanggil setter di class Mahasiswa agar data konsisten
        mhs.setDosenPembimbing(this); 
    }

    public String getNama() {
        return nama;
    }

    public void tampilkanMahasiswaBimbingan() {
        System.out.println("Daftar Mahasiswa Bimbingan Dosen: " + this.nama);
        for (Mahasiswa mhs : mahasiswaBimbingan) {
            System.out.println("- " + mhs.getNama() + " (" + mhs.getNim() + ")"); // <-- Ini akan valid SETELAH Mahasiswa.java diperbarui
        }
    }
}
