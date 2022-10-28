package account;

/**
 *
 * Nama     : IKA
 * NIM      : 20210040096
 * Kelas    : TI21f
 * MatKul   : Pemograman Berorientasi Objek
 */
public class SadObject extends MoodyObject{
   
    protected String getSad(){
        return "sad";
    }
    public void cry(){
        System.out.println("Hoo hoo : "+ getSad());
 }
}
    

