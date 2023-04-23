
package Bai1_Lab4;


public class BenhNhan extends Nguoi {
    private String tienSu;
    private String chanDoan;
    private BenhVien benhVien;
    public BenhNhan(String tienSu,String chanDoan, BenhVien benhVien,String ten, int tuoi,String gioiTinh){
        super(ten,tuoi,gioiTinh);
        this.tienSu=tienSu;
        this.chanDoan=chanDoan;
        this.benhVien=benhVien;
    }

    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }

    public String getTienSu() {
        return tienSu;
    }

    public String getChanDoan() {
        return chanDoan;
    }

    public BenhVien getBenhVien() {
        return benhVien;
    }
    Nguoi a=new Nguoi("Dao",10,"Nam");
    BenhVien m=new BenhVien("bv Phuong Dong","Ha Noi","Giang");
    
    @Override
    public String toString(){
        System.out.println(a.toString());
        System.out.println(m.toString());
        return "tieu su:"+tienSu+"\t chuan doan: "+chanDoan+"\t benh vien: "+benhVien;
    }
    
}
