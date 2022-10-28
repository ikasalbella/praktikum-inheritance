package account;

/**
 *
 * Nama     : IKA
 * NIM      : 20210040096
 * Kelas    : TI21f
 * MatKul   : Pemograman Berorientasi Objek
 */
public class HappyObject extends MoodyObject{
    
    protected String getHappy(){
        return"happy";
    }
    public void laugh(){
        System.out.println("Hahaha : " + getHappy());
 }
}
    

