public class Mahasiswa {
    private String nama;
    private String nim;
    // Task 2.1: Tambahkan atribut Dosen
    private Dosen dosenPembimbing;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Task 2.2: Buat metode setDosenPembimbing
    public void setDosenPembimbing(Dosen dosen) {
        this.dosenPembimbing = dosen;
    }

    // Task 2.3: Buat metode getDosenPembimbing (untuk melihat info)
    public Dosen getDosenPembimbing() {
        return this.dosenPembimbing;
    }

    // --- Metode yang dibutuhkan oleh Dosen.java ---
    
    public String getNama() {
        return nama;
    }

    // Metode ini WAJIB ada untuk memperbaiki error di Dosen.java
    public String getNim() {
        return nim;
    }

    // Metode ini hanya untuk demo di Main.java nanti
    public void tampilkanDosenPembimbing() {
        System.out.print("Mahasiswa: " + this.nama + " (" + this.nim + ")");
        if (dosenPembimbing != null) {
            System.out.println(" -> Dosen Pembimbing: " + dosenPembimbing.getNama());
        } else {
            System.out.println(" -> (Belum memiliki dosen pembimbing)");
        }
    }
}