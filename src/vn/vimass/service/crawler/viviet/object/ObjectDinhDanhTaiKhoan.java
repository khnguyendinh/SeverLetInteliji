package vn.vimass.service.crawler.viviet.object;

import com.google.gson.Gson;

/**
 * Created by KHOAND_ADMIN on 8/19/2017.
 */
public class ObjectDinhDanhTaiKhoan {
    public String maGiaoDich;
    public String user;
    public long thoiGian;



    public String soTK;
    public String tenTK;
    public String maNganHang;
    public String soCMND;
    public String tenCMND;

    public String tenTKSearch;

    public String tenCMNDSearch;

    public String nguoiYeuCau;
    public int trangThai;
    public String moTa;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
