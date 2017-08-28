package vn.vimass.service.crawler.viviet.object;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

import vn.vimass.service.utils.DbUtil;

public class TableViVietNapTienDT {

    public final static String TABLE_NAME = "Vi_Viet_NapTien";


    public final static String maGiaoDich = "maGiaoDich";
    public final static String thoiGian = "thoiGian";
    public final static String nguoiYeuCau = "nguoiYeuCau";

    public final static String trangThai = "trangThai";
    public final static String VMApp = "VMApp";
    public final static String sdt = "sdt";
    public final static String soTien = "soTien";



    public static ViVietNapTien napDuLieu(ViVietNapTien item)
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
                        + "(maGiaoDich,thoiGian,nguoiYeuCau,"
                        +       "maNhaMang,trangThai,VMApp,sdt,soTien) values("
                        + "N'" + item.maGiaoDich + "',"
                        + item.thoiGian + ","
                        + "N'" + item.nguoiYeuCau + "',"
                        + item.maNhaMang + ","
                        +  item.trangThai+ ","
                        +  item.VMApp +","
                        + "N'"+ item.sdt+"',"
                        +  item.soTien
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
