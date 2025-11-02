public class Main {
    public static void main(String[] args) {
        // 1. Setup Awal
        System.out.println("--- Setup Data ---");
        Dosen dosen1 = new Dosen("Dr. Budi Hartono", "BUD");
        Mahasiswa mhs1 = new Mahasiswa("Andi Hermawan", "25001");
        Mahasiswa mhs2 = new Mahasiswa("Citra Lestari", "25002");

        System.out.println("Dosen: " + dosen1.getNama());
        System.out.println("Mahasiswa 1: " + mhs1.getNama());
        System.out.println("Mahasiswa 2: " + mhs2.getNama());
        System.out.println("");

        // 2. Demo US-001: Dosen menambahkan Mahasiswa bimbingan
        System.out.println("--- Demo US-001: Dosen Menambah Bimbingan ---");
        dosen1.tambahMahasiswaBimbingan(mhs1);
        dosen1.tambahMahasiswaBimbingan(mhs2);
        
        // Bukti: Tampilkan daftar mahasiswa bimbingan dari sisi Dosen
        dosen1.tampilkanMahasiswaBimbingan();
        System.out.println("");

        // 3. Demo US-002: Mahasiswa melihat Dosen Pembimbingnya
        System.out.println("--- Demo US-002: Mahasiswa Melihat Dosbing ---");
        
        // Bukti: Tampilkan info dosen pembimbing dari sisi Mahasiswa
        mhs1.tampilkanDosenPembimbing();
        mhs2.tampilkanDosenPembimbing();
    }
}