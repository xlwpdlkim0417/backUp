package dto;

public class newBoard {
	private int num;
	private String title;
	private String content;
	private String regtime;
	private String name;
	private int hits;
	private int memberno;
	
	
	
	public newBoard(int num,String title, String content) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
	}
	public newBoard(String title, String content, int memberno) {
		super();
		this.title = title;
		this.content = content;
		this.memberno = memberno;
	}
	public newBoard(int num,String title, String content, String regtime, int memberno, String name) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.regtime = regtime;
		this.memberno = memberno;
		this.name = name;
	}

	public newBoard(int num, String title, String content, String regtime, int hits, int memberno, String name) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.regtime = regtime;
		this.hits = hits;
		this.memberno = memberno;
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMemberno() {
		return memberno;
	}

	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegtime() {
		return regtime;
	}

	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}



}
