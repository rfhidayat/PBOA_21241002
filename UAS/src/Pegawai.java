public class Pegawai {
    public String nama;
    public String jabatan;
    public double pajak;
    private double gajipokok;
    private double gajibersih;


    public Pegawai(String nama, String jabatan, double pajak) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.pajak = pajak;

    }

    public void setgajipokok(double gajipokok) {
        this.gajipokok = gajipokok;
    }
    

    public double getgajibersih() {
        return gajibersih;
    }
    
    void display(){
        gajibersih = gajipokok - (gajipokok * pajak) ;
        System.out.println("Nama : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Gaji Bersih " + gajibersih);
    }

    public static void main(String[] args) throws Exception {
        Pegawai Pegawai1 = new Pegawai ("Adam",  "Direktur",  0.1);
        Pegawai1.setgajipokok(20.000);
        Pegawai1.display();
    }
}