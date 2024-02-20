package dto;

public class Commen {

	private int num;
	private String writer;
	private String content;
	private String regtime;
	private int hits;
	private int likes;

	public Commen(int num, String writer, String content, String regtime, int hits, int likes) {
		super();
		this.num = num;
		this.writer = writer;
		this.content = content;
		this.regtime = regtime;
		this.hits = hits;
		this.likes = likes;
	}

	public Commen(int num, String writer, String content) {
		super();
		this.num = num;
		this.writer = writer;
		this.content = content;
	}

	public Commen(String writer, String content) {
		super();
		this.writer = writer;
		this.content = content;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
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

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	@Override
	public String toString() {
		return "Commen [num=" + num + ", writer=" + writer + ", content=" + content + ", regtime=" + regtime + ", hits="
				+ hits + ", likes=" + likes + "]";
	}

}
