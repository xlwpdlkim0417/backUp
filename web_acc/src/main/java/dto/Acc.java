package dto;

import java.util.List;

public class Acc {
	int num;
	int day;
	int month;
	int year;
	String trname;
	String dlname;
	String mulname;

	public Acc(int day, int month, int year, String trname, String dlname, String mulname) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.trname = trname;
		this.dlname = dlname;
		this.mulname = mulname;
	}

	public Acc(int num, int day, int month, int year, String trname, String dlname, String mulname) {
		super();
		this.num = num;
		this.day = day;
		this.month = month;
		this.year = year;
		this.trname = trname;
		this.dlname = dlname;
		this.mulname = mulname;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTrname() {
		return trname;
	}

	public void setTrname(String trname) {
		this.trname = trname;
	}

	public String getDlname() {
		return dlname;
	}

	public void setDlname(String dlname) {
		this.dlname = dlname;
	}

	public String getMulname() {
		return mulname;
	}

	public void setMulname(String mulname) {
		this.mulname = mulname;
	}

}