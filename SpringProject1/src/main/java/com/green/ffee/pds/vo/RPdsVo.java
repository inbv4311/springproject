package com.green.ffee.pds.vo;

public class RPdsVo {
	// Fields
	// MBoard 게시물
	private  int     idx;
	private  String  title;
	private  String  cont;
	private  String  writer;
	private  String  regdate;
	private  int     readcount;
	
	// MBoard 답글관련
	private  int     bnum;
	private  int     lvl;
	private  int     step;
	private  int     nref;
	
	// 삭제 여부  :0 - 삭제되지 않은 글, 1 - 삭제된 글
	private  int     delnum;
		
	// Menus  메뉴관련 - 현재 메뉴 정보
	private  String  menu_id; 
	private  String  menu_name; 
	private  int     menu_seq;
	
	// 파일관련 - 목록(list)에 보여줄 조회된 파일 갯수
	private  int     filescount;
	
	// 페이징 관련    
	private  int     nowpage;          // 현재 페이지 정보
	private  int     prevnowpage;      // 이전 10개 클릭시 적용되는 nowpage
	private  int     nextnowpage;      // 다음 10개 클릭시 적용되는 nowpage
	
	private  int     totalcount;       // 전체 row 수  
	private  int     totalpagecount;   // 화면에 보여줄 페이지 수
	
	private  int     pagestartnum;     // 화면에 보여줄 페이지 시작 번호
	private  int     pageendnum;       // 화면에 보여줄 페이지 끝 번호
	private  int     pagegrpnum;       // 페이지 그룹 숫자
	
	private  int      pagecount;        // 1 페이지에 보여줄 자료라인수
	
	private  boolean  isshowpageprev;
	private  boolean  isshowpagenext;
	
	// Constructor
	
	public RPdsVo() {}

	public RPdsVo(int idx, String title, String cont, String writer, String regdate, int readcount, int bnum, int lvl,
			int step, int nref, int delnum, String menu_id, String menu_name, int menu_seq, int filescount, int nowpage,
			int prevnowpage, int nextnowpage, int totalcount, int totalpagecount, int pagestartnum, int pageendnum,
			int pagegrpnum, int pagecount, boolean isshowpageprev, boolean isshowpagenext) {
		super();
		this.idx = idx;
		this.title = title;
		this.cont = cont;
		this.writer = writer;
		this.regdate = regdate;
		this.readcount = readcount;
		this.bnum = bnum;
		this.lvl = lvl;
		this.step = step;
		this.nref = nref;
		this.delnum = delnum;
		this.menu_id = menu_id;
		this.menu_name = menu_name;
		this.menu_seq = menu_seq;
		this.filescount = filescount;
		this.nowpage = nowpage;
		this.prevnowpage = prevnowpage;
		this.nextnowpage = nextnowpage;
		this.totalcount = totalcount;
		this.totalpagecount = totalpagecount;
		this.pagestartnum = pagestartnum;
		this.pageendnum = pageendnum;
		this.pagegrpnum = pagegrpnum;
		this.pagecount = pagecount;
		this.isshowpageprev = isshowpageprev;
		this.isshowpagenext = isshowpagenext;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCont() {
		return cont;
	}

	public void setCont(String cont) {
		this.cont = cont;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public int getBnum() {
		return bnum;
	}

	public void setBnum(int bnum) {
		this.bnum = bnum;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public int getNref() {
		return nref;
	}

	public void setNref(int nref) {
		this.nref = nref;
	}

	public int getDelnum() {
		return delnum;
	}

	public void setDelnum(int delnum) {
		this.delnum = delnum;
	}

	public String getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}

	public String getMenu_name() {
		return menu_name;
	}

	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}

	public int getMenu_seq() {
		return menu_seq;
	}

	public void setMenu_seq(int menu_seq) {
		this.menu_seq = menu_seq;
	}

	public int getFilescount() {
		return filescount;
	}

	public void setFilescount(int filescount) {
		this.filescount = filescount;
	}

	public int getNowpage() {
		return nowpage;
	}

	public void setNowpage(int nowpage) {
		this.nowpage = nowpage;
	}

	public int getPrevnowpage() {
		return prevnowpage;
	}

	public void setPrevnowpage(int prevnowpage) {
		this.prevnowpage = prevnowpage;
	}

	public int getNextnowpage() {
		return nextnowpage;
	}

	public void setNextnowpage(int nextnowpage) {
		this.nextnowpage = nextnowpage;
	}

	public int getTotalcount() {
		return totalcount;
	}

	public void setTotalcount(int totalcount) {
		this.totalcount = totalcount;
	}

	public int getTotalpagecount() {
		return totalpagecount;
	}

	public void setTotalpagecount(int totalpagecount) {
		this.totalpagecount = totalpagecount;
	}

	public int getPagestartnum() {
		return pagestartnum;
	}

	public void setPagestartnum(int pagestartnum) {
		this.pagestartnum = pagestartnum;
	}

	public int getPageendnum() {
		return pageendnum;
	}

	public void setPageendnum(int pageendnum) {
		this.pageendnum = pageendnum;
	}

	public int getPagegrpnum() {
		return pagegrpnum;
	}

	public void setPagegrpnum(int pagegrpnum) {
		this.pagegrpnum = pagegrpnum;
	}

	public int getPagecount() {
		return pagecount;
	}

	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}

	public boolean isIsshowpageprev() {
		return isshowpageprev;
	}

	public void setIsshowpageprev(boolean isshowpageprev) {
		this.isshowpageprev = isshowpageprev;
	}

	public boolean isIsshowpagenext() {
		return isshowpagenext;
	}

	public void setIsshowpagenext(boolean isshowpagenext) {
		this.isshowpagenext = isshowpagenext;
	}

	@Override
	public String toString() {
		return "PdsVo [idx=" + idx + ", title=" + title + ", cont=" + cont + ", writer=" + writer + ", regdate="
				+ regdate + ", readcount=" + readcount + ", bnum=" + bnum + ", lvl=" + lvl + ", step=" + step
				+ ", nref=" + nref + ", delnum=" + delnum + ", menu_id=" + menu_id + ", menu_name=" + menu_name
				+ ", menu_seq=" + menu_seq + ", filescount=" + filescount + ", nowpage=" + nowpage + ", prevnowpage="
				+ prevnowpage + ", nextnowpage=" + nextnowpage + ", totalcount=" + totalcount + ", totalpagecount="
				+ totalpagecount + ", pagestartnum=" + pagestartnum + ", pageendnum=" + pageendnum + ", pagegrpnum="
				+ pagegrpnum + ", pagecount=" + pagecount + ", isshowpageprev=" + isshowpageprev + ", isshowpagenext="
				+ isshowpagenext + "]";
	}
	
	
}























