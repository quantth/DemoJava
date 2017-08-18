package Quan.main;

/**
 * Created by NguyenVanQuan on 7/29/2017.
 */
public class Main {
    public static void main (String[] args){
         int hangPhanTram, hangPhanMuoi, hangDonVi;
        for (hangPhanTram = 0; hangPhanTram < 10; hangPhanTram++ ){
            for (hangPhanMuoi = 0; hangPhanMuoi < 10; hangPhanMuoi++){
                for (hangDonVi = 0;hangDonVi < 10; hangDonVi++){
                    if (hangPhanTram == 0){
                        if (hangPhanMuoi == 0){
                            System.out.println(hangDonVi+"^1=" + hangDonVi);
                        }
                        else {
                            if ((10*hangPhanMuoi + hangDonVi)==( Math.pow((double)hangPhanMuoi,2) + Math.pow((double)hangDonVi,2))){
                                System.out.println(hangPhanMuoi + "^2 + " +hangDonVi+"^2 =" + (10*hangPhanMuoi + hangDonVi));
                            }
                        }
                    }
                    else{
                        if ( (100*hangPhanTram + 10*hangPhanMuoi + hangDonVi) ==(Math.pow((double)hangPhanTram,3)+ Math.pow((double)hangPhanMuoi,3) + Math.pow((double)hangDonVi,3))){
                            System.out.println(hangPhanTram + "^3+" +hangPhanMuoi + "^3+" +hangDonVi+"^2="+(100*hangPhanTram+10*hangPhanMuoi + hangDonVi));
                        }
                    }
                }
            }
        }

    }
}
