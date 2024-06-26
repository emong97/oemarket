package oe.market.board.vo;

public class OeBoardVO {
	private String bnum;
	private String oid;
	private String btitle;
	private String bphoto;
	private String bcontent;
	private String bprice;
	private String insertdate;
	private String updatedate;
	private String deleteyn;
	
	// 페이징 이동 필드
	private String pageSize;
	private String groupSize;
	private String curPage;
	private String totalCount;
	
	// 조회수 필드
	private int bhit;

	
	public OeBoardVO() {
		
	}
	


	public OeBoardVO(String bnum, String oid, String btitle, String bphoto, String bcontent, String bprice,
			String insertdate, String updatedate, String deleteyn, String pageSize, String groupSize, String curPage,
			String totalCount) {
		
		this.bnum = bnum;
		this.oid = oid;
		this.btitle = btitle;
		this.bphoto = bphoto;
		this.bcontent = bcontent;
		this.bprice = bprice;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
		this.deleteyn = deleteyn;
		this.pageSize = pageSize;
		this.groupSize = groupSize;
		this.curPage = curPage;
		this.totalCount = totalCount;
	}



	public OeBoardVO(String bnum, String oid, String btitle, String bphoto, String bcontent, String bprice,
			String insertdate, String updatedate, String deleteyn) {
		
		this.bnum = bnum;
		this.oid = oid;
		this.btitle = btitle;
		this.bphoto = bphoto;
		this.bcontent = bcontent;
		this.bprice = bprice;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
		this.deleteyn = deleteyn;
	}



	public OeBoardVO(String bnum, String oid, String btitle, String bphoto, String bcontent, String bprice,
			String insertdate, String updatedate, String deleteyn, String pageSize, String groupSize, String curPage,
			String totalCount, int bhit) {
		
		this.bnum = bnum;
		this.oid = oid;
		this.btitle = btitle;
		this.bphoto = bphoto;
		this.bcontent = bcontent;
		this.bprice = bprice;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
		this.deleteyn = deleteyn;
		this.pageSize = pageSize;
		this.groupSize = groupSize;
		this.curPage = curPage;
		this.totalCount = totalCount;
		this.bhit = bhit;
	}


	public String getBnum() {
		return bnum;
	}


	public void setBnum(String bnum) {
		this.bnum = bnum;
	}


	public String getOid() {
		return oid;
	}


	public void setOid(String oid) {
		this.oid = oid;
	}


	public String getBtitle() {
		return btitle;
	}


	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}


	public String getBphoto() {
		return bphoto;
	}


	public void setBphoto(String bphoto) {
		this.bphoto = bphoto;
	}


	public String getBcontent() {
		return bcontent;
	}


	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}


	public String getBprice() {
		return bprice;
	}


	public void setBprice(String bprice) {
		this.bprice = bprice;
	}


	public String getInsertdate() {
		return insertdate;
	}


	public void setInsertdate(String insertdate) {
		this.insertdate = insertdate;
	}


	public String getUpdatedate() {
		return updatedate;
	}


	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}


	public String getDeleteyn() {
		return deleteyn;
	}


	public void setDeleteyn(String deleteyn) {
		this.deleteyn = deleteyn;
	}


	public String getPageSize() {
		return pageSize;
	}


	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}


	public String getGroupSize() {
		return groupSize;
	}


	public void setGroupSize(String groupSize) {
		this.groupSize = groupSize;
	}


	public String getCurPage() {
		return curPage;
	}


	public void setCurPage(String curPage) {
		this.curPage = curPage;
	}


	public String getTotalCount() {
		return totalCount;
	}


	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}


	public int getBhit() {
		return bhit;
	}


	public void setBhit(int bhit) {
		this.bhit = bhit;
	}
	
	
}