package vn.vimass.service.crawler.viviet.object;

import com.google.gson.Gson;

public class ObjectThanhToanGalaxy {

    public String maGiaoDich;
    public String idRap ;
    public String idPhim ;
    public String idKhungGio ;
    public String idViDat ;
    public String dsCho;
    public String urlRutGon ;
    public String dsSoLuongVe ;
    public String thongTinDatVeThanhCong ;
    public double soTien ;
    public long thoiGian ;
    public int trangThai ;
    public int VMApp;
    public String user ;
    public String OTP ;
    
    
    
    @Override
    public String toString() {
    	return new Gson().toJson(this);
    }
}
