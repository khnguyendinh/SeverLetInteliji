package vn.vimass.service.crawler.viviet.object;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

import vn.vimass.service.utils.DbUtil;

public class TableViVietSoDu {

    public final static String TABLE_NAME = "Vi_Viet_SoDu";


    public final static String maGiaoDich = "maGiaoDich";
    public final static String user = "user";
    public final static String thoiGian = "thoiGian";
    public final static String soTK = "soTK";
    public final static String maNganHang = "maNganHang";
    public final static String nguoiYeuCau = "nguoiYeuCau";

    public final static String trangThai = "trangThai";
    public final static String tenTK = "tenTK";
    public final static String VMApp = "VMApp";
    public final static String soDu = "soDu";


    public static ViVietSoDu napDuLieu(ViVietSoDu item)
    {
        if(item != null)
        {
//            item.thoiGian = new Date().getTime();


            PreparedStatement statement = null;
            Connection connect = null;
            try {
                if (connect == null) {
                    connect = DbUtil.getConnect(DbUtil.URL, DbUtil.USER, DbUtil.PASS);
                }
                String strSql = "insert into "
                        + TABLE_NAME
                        + "(maGiaoDich,user,thoiGian,soTK,maNganHang,nguoiYeuCau,"
                        +       "trangThai,VMApp) values("
                        + "N'" + item.maGiaoDich + "',"
                        + "N'" + item.user + "',"
                        + item.thoiGian + ","
                        + "N'" + item.soTK + "',"
                        + "N'" + item.maNganHang + "',"
                        + "N'" + item.nguoiYeuCau + "',"
                        + "" + item.trangThai+ ","
                        +  item.VMApp
                        + ");";

               
                statement = (PreparedStatement) connect
                        .prepareStatement(strSql);
                int kqRun = statement.executeUpdate();
               
                connect.close();
            } catch (Exception e) {
                e.printStackTrace();
               
            }
        }
        return item;
    }
}
