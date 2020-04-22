import java.util.*;
public class Data {

    private String nim;
    private String nama;
    private String kelas;
    private String program_studi;
    private String alamat;
    private String no_hp;

    public Data() {
        nim = "";
        nama = "";
        kelas = "";
        program_studi = "";
        alamat ="";
        no_hp = "";
    }

    public Data(String nim, String nama, String kelas, String program_studi, String alamat, String no_hp) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.program_studi = program_studi;
        this.alamat = alamat;
        this.no_hp =no_hp;
    }

    

    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    public void setProgram_Studi(String program_studi) {
        this.program_studi = program_studi;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setNo_Hp(String alamat) {
        this.no_hp = no_hp;
    }
    

    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public String getKelas() { return kelas; }
    public String getProgram_Studi() { return program_studi; }
    public String getAlamat() { return alamat; }
    public String getNo_Hp() { return no_hp; }
}