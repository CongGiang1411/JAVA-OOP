
package Bai2_Lab4;

import java.util.List;


public class SinhVien extends Nguoi {
    private String lop;
    private String nganh;
    private List<Truong> truong;
    public SinhVien(String ten,int tuoi,char gioiTinh,String lop,String nganh,List<Truong> truong){
        super(ten,tuoi,gioiTinh);
        this.lop=lop;
        this.nganh=nganh;
        this.truong=truong;
    }

    public void setTruong(List<Truong> truong) {
        this.truong = truong;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getLop() {
        return lop;
    }

    public String getNganh() {
        return nganh;
    }

    public List<Truong> getTruong() {
        return truong;
    }
    Nguoi a=new Nguoi("Dao",10,'N');
    Truong b=new Truong("Dai hoc bach nghe","Ha Loi","Quat");
    @Override
    public String toString(){
        System.out.println(a.toString());
        System.out.println(b.toString());
        return "lop: "+lop+"\t nganh: "+nganh+"\t truong: "+truong;
    }
}
