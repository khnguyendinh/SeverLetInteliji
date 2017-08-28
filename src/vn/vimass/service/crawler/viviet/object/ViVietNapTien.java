package vn.vimass.service.crawler.viviet.object;

import com.google.gson.Gson;

/**
 * Created by KHOAND_ADMIN on 8/25/2017.
 */
public class ViVietNapTien {
    public String maGiaoDich;
    public long thoiGian;
    public String nguoiYeuCau;
    public int maNhaMang;
    public int trangThai;
    public int VMApp;
    public String sdt;
    public int soTien;
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
