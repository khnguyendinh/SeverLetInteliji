package vn.vimass.service.crawler.viviet.object;

import com.google.gson.Gson;

/**
 * Created by KHOAND_ADMIN on 8/25/2017.
 */
public class ViVietSoDu {
    public String maGiaoDich;
    public String user;
    public long thoiGian;
    public String soTK;
    public String maNganHang;
    public String nguoiYeuCau;
    public int trangThai;
    public int VMApp;
    public long soDu;
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
