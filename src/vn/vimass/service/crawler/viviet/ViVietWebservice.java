package vn.vimass.service.crawler.viviet;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/vi_viet")
@Produces("application/json;charset=utf-8")
public class ViVietWebservice {

	@GET
	@Path("/test")
	public String test() {
		return "RUNNING OK";
	}

	@GET
	@Path("/getNameViViet")
	public String getNameViViet(@QueryParam("maGiaoDich") final String maGiaoDich,
			@QueryParam("user") final String user,
			@QueryParam("thoiGian") final long thoiGian,
			@QueryParam("soTK") final String soTK,
			@QueryParam("maNganHang") final String maNganHang,
			@QueryParam("nguoiYeuCau") final String nguoiYeuCau,
			@QueryParam("trangThai") final int trangThai,
			@QueryParam("VMApp") final int VMApp) {
		return ViVietFunc.getNameViViet(maGiaoDich, user, thoiGian, soTK , maNganHang,nguoiYeuCau ,trangThai ,VMApp );
	}
	@GET
	@Path("/getSoDuViViet")
	public String getSoDuViViet(@QueryParam("maGiaoDich") final String maGiaoDich,
			@QueryParam("user") final String user,
			@QueryParam("thoiGian") final long thoiGian,
			@QueryParam("soTK") final String soTK,
			@QueryParam("maNganHang") final String maNganHang,
			@QueryParam("nguoiYeuCau") final String nguoiYeuCau,
			@QueryParam("trangThai") final int trangThai,
			@QueryParam("VMApp") final int VMApp) {
		return ViVietFunc.getSoDuViViet(maGiaoDich, user, thoiGian, soTK , maNganHang,nguoiYeuCau ,trangThai ,VMApp );
	}
	@GET
	@Path("/getNapDTViViet")
	public String getNapDTViViet(@QueryParam("maGiaoDich") final String maGiaoDich,
			@QueryParam("thoiGian") final long thoiGian,
			@QueryParam("nguoiYeuCau") final String nguoiYeuCau,
			@QueryParam("trangThai") final int trangThai,
			@QueryParam("maNhaMang") final int maNhaMang,
			@QueryParam("sdt") final String sdt,
			@QueryParam("soTien") final int soTien,
			@QueryParam("VMApp") final int VMApp) {
		return ViVietFunc.getNapDTViViet(maGiaoDich, thoiGian,nguoiYeuCau ,trangThai ,sdt,maNhaMang,soTien,VMApp );
	}
	

//	@GET
//	@Path("/getDanhSachChoNgoiCuaPhim")
//	public String getDanhSachChoNgoiCuaPhim(@QueryParam("idRap") final String idRap,
//			@QueryParam("idPhim") final String idPhim,
//			@QueryParam("idKhungGio") final String idKhungGio,
//			@QueryParam("urlPhim") final String urlPhim,
//			@QueryParam("dsVe") final String dsVe) {
//		return ViVietFunc.getDanhSachChoNgoiCuaPhim(idRap, idPhim, idKhungGio, urlPhim, dsVe);
//	}
//	
//	
//	@POST
//	@Path("/datVePhim")
//	public String datVePhim(String input) {
//		return GalaxyFunc.datVePhim(input);
//	}
//	
//	@GET
//	@Path("/otp")
//	public String otp(@QueryParam("input") final String input) {
//		return GalaxyFunc.otp(input);
//	}
}