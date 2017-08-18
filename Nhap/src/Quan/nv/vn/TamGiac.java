package Quan.nv.vn;

import java.text.DecimalFormat;

/**
 * Created by NguyenVanQuan on 7/21/2017.
 */
public class TamGiac {
    int canhA, canhB, canhC;
    public TamGiac (int canhA, int canhB, int canhC) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }
    public int getCanhA() {

        return canhA;
    };
    public int getCanhB() {

        return canhB;
    };
    public int getCanhC() {
        return canhC;
    };
    public TamGiac(){

        super();
    }

   // @Override
    public String toString() {

        String s= "Tam giac[canh a:"+canhA+", canh b:" +canhB+", canh c: " +canhC+"]";
        if(KiemTraHopLe()==false){
            return s+" Erron:Tam Giac Khong Hop Le!";
        }
        else {

            return s+"\nCo chu vi la: "+ChuVi()+"\nCo dien tich la: "+DienTich();
        }
    }
    private boolean KiemTraHopLe(){
        boolean kt = this.canhA > 0 && this.canhB > 0 && this.canhC > 0 &&
                     (this.canhA+this.canhB) > this.canhC &&
                     (this.canhA+this.canhC) > this.canhB&&
                     (this.canhC+this.canhB) > this.canhA ;
        return kt;
    }
    private double ChuVi()
    {
        return this.canhA+this.canhB+this.canhC;
    }
    private double DienTich(){
        double p =ChuVi()/2;
        return Math.sqrt(p*(p-this.canhA)*(p-this.canhB)*(p-this.canhC));
    }
}
