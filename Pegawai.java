package account;

/**
 *
 * Nama     : IKA
 * NIM      : 20210040096
 * Kelas    : TI21f
 * MatKul   : Pemograman Berorientasi Objek
 */
public class Pegawai {
    public String nama;
    public double gaji;
}

class Manajer extends Pegawai {
    public String departemen;
    
    public void IsiData(String n, String d) {
        nama=n;
        departemen=d;
    }
}
    

