
package Bai1_Lab4;
public class Nguoi {
     String ten;
     int tuoi;
     String gioiTinh;   
     public Nguoi(String ten,int tuoi,String gioiTinh){
        this.ten=ten;
        this.tuoi=tuoi;
        this.gioiTinh=gioiTinh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

     @Override
    public String toString(){
        return "ten:" +ten+ "\t tuoi: "+tuoi+"\t gioi tinh: "+gioiTinh;
    }
   
}
