package vn.vimass.service.crawler.viviet;

import java.util.Date;

import com.google.gson.Gson;

import VimassLib.util.VimassCommon;
import VimassLib.util.VimassData;
import VimassLib.util.VimassFileManager;
import vn.vimass.service.crawler.viviet.object.ObjectThanhToanGalaxy;
import vn.vimass.service.crawler.viviet.object.TKViViet;
import vn.vimass.service.crawler.viviet.object.TableNameViViet;
import vn.vimass.service.crawler.viviet.object.TableViVietNapTienDT;
import vn.vimass.service.crawler.viviet.object.TableViVietSoDu;
import vn.vimass.service.crawler.viviet.object.ViVietNapTien;
import vn.vimass.service.crawler.viviet.object.ViVietSoDu;


public class ViVietFunc {

	
	public static boolean status = false;
	
//	public static String getNameViViet(String idRap, String idPhim,
//			String idKhungGio, String urlPhim) {
//		String kq = "";
//		
//		System.out.println("getDanhSachVeCuaPhim start " + new Date().getTime());
//		if(!status)
//		{
//			status = true;
//			taoFileInputVe(idRap, idPhim, idKhungGio, urlPhim);
//			int nDem = 0;
//			while(nDem < 100)
//			{
//				String content = VimassFileManager.readFile(VimassData.ROOT_PATH + "output/" + "GALAXY_outputVe.txt");
//				if(content != null && content.length() > 20)
//				{
//					kq = content;
//					break;
//				}
//				VimassCommon.delay(1000);
//				nDem++;
//			}
//			status = false;
//		}
//		else
//		{
//			System.out.println("getDanhSachVeCuaPhim khong phuc vu ");
//		}
//		System.out.println("getDanhSachVeCuaPhim end " + new Date().getTime());
//		return kq;
//	}
//
//	private static void taoFileInputVe(String idRap, String idPhim,
//			String idKhungGio, String urlPhim) {
//		VimassCommon.createFolderVimass();
//		String content = 
//				idRap + "\t"
//				+ idPhim + "\t"
//				+ idKhungGio + "\t"
//				+ urlPhim
//				;
//		
//		VimassFileManager.writeFile(VimassData.ROOT_PATH + "input/" + "GALAXY_inputVe.txt",content, false);
//		
//		VimassFileManager.writeFile(VimassData.ROOT_PATH + "output/" + "GALAXY_outputVe.txt","", false);
//	}
//
//	public static String getDanhSachChoNgoiCuaPhim(String idRap, String idPhim,
//			String idKhungGio, String urlPhim, String dsVe) {
//		String kq = "";
//		System.out.println("getDanhSachChoNgoiCuaPhim start " + new Date().getTime());
//		if(!status)
//		{
//			status = true;
//			taoFileInputChoNgoi(idRap, idPhim, idKhungGio, urlPhim, dsVe);
//			int nDem = 0;
//			while(nDem < 100)
//			{
//				String content = VimassFileManager.readFile(VimassData.ROOT_PATH + "output/" + "GALAXY_outputChoNgoi.txt");
//				if(content != null && content.length() > 20)
//				{
//					kq = content;
//					break;
//				}
//				VimassCommon.delay(1000);
//				nDem++;
//			}
//			status = false;
//		}
//		else
//		{
//			System.out.println("getDanhSachChoNgoiCuaPhim khong phuc vu ");
//		}
//		System.out.println("getDanhSachChoNgoiCuaPhim end " + new Date().getTime());
//		return kq;
//	}
//	
//	private static void taoFileInputChoNgoi(String idRap, String idPhim,
//			String idKhungGio, String urlPhim, String dsVe) {
//		VimassCommon.createFolderVimass();
//		String content = 
//				idRap + "\t"
//				+ idPhim + "\t"
//				+ idKhungGio + "\t"
//				+ urlPhim + "\t"
//				+ dsVe;
//		
//		VimassFileManager.writeFile(VimassData.ROOT_PATH + "input/" + "GALAXY_inputChoNgoi.txt",content, false);
//		
//		VimassFileManager.writeFile(VimassData.ROOT_PATH + "output/" + "GALAXY_outputChoNgoi.txt","", false);
//	}
//	
//	public static String otp(String input) {
//		String kq = "";
//		System.out.println("otp start " + new Date().getTime());
//		VimassCommon.createFolderVimass();
//		String content = input;
//		
//		VimassFileManager.writeFile(VimassData.ROOT_PATH + "input/" + "OTP_ThanhToan_GALAXY.txt",content, false);
//		System.out.println("otp end " + new Date().getTime());
//		return kq;
//	}
//
//	public static String datVePhim(String input) {
//		
//		try
//		{
//			ObjectThanhToanGalaxy item = new Gson().fromJson(input, ObjectThanhToanGalaxy.class);
//			if(item != null && item.maGiaoDich != null)
//			{
//				TableNameViViet.napDuLieu(item);
//			}
//		}
//		catch(Exception e)
//		{
//			
//		}
//		return "";
//	}

	public static String getNameViViet(String maGiaoDich, String user, long thoiGian, String soTK, String maNganHang,
			String nguoiYeuCau, int trangThai, int vMApp) {
		try
		{
			TKViViet item = new TKViViet();
			item.maGiaoDich = maGiaoDich;
			item.user = user;
			item.thoiGian = thoiGian;
			item.soTK = soTK;
			item.maNganHang = maNganHang;
			item.nguoiYeuCau = nguoiYeuCau;
			item.trangThai = trangThai;
			item.VMApp = vMApp;
			
			if(item != null && item.maGiaoDich != null)
			{
				TableNameViViet.napDuLieu(item);
			}
		}
		catch(Exception e)
		{
			
		}
		return "success";
	}

	public static String getSoDuViViet(String maGiaoDich, String user, long thoiGian, String soTK, String maNganHang,
			String nguoiYeuCau, int trangThai, int vMApp) {
		try
		{
			ViVietSoDu item = new ViVietSoDu();
			item.maGiaoDich = maGiaoDich;
			item.user = user;
			item.thoiGian = thoiGian;
			item.soTK = soTK;
			item.maNganHang = maNganHang;
			item.nguoiYeuCau = nguoiYeuCau;
			item.trangThai = trangThai;
			item.VMApp = vMApp;
			
			if(item != null && item.maGiaoDich != null)
			{
				TableViVietSoDu.napDuLieu(item);
			}
		}
		catch(Exception e)
		{
			return "fail So DƯ";
		}
		return "success So Du";
	}

	public static String getNapDTViViet(String maGiaoDich, long thoiGian, String nguoiYeuCau, int trangThai, String sdt,int maNhaMang,
			int soTien, int vMApp) {
		try
		{
			ViVietNapTien item = new ViVietNapTien();
			item.maGiaoDich = maGiaoDich;
			item.thoiGian = thoiGian;
			item.nguoiYeuCau = nguoiYeuCau;
			item.sdt = sdt;
			item.maNhaMang = maNhaMang;
			item.soTien = soTien;
			item.trangThai = trangThai;
			item.VMApp = vMApp;
			
			if(item != null && item.maGiaoDich != null)
			{
				TableViVietNapTienDT.napDuLieu(item);
			}
		}
		catch(Exception e)
		{
			return "fail Nap Dthoai";
		}
		return "success Nap DTHOAI";
	}
}
