package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Board {

	private int num = 0;
	private String writer;
	private String title;
	private String content;
	private String regtime;
	private int hits = 0;

}