package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import boardservice.BoardDeleteOne;
import boardservice.BoardGetNumRecords;
import boardservice.BoardInsertOne;
import boardservice.BoardSelectList;
import boardservice.BoardSelectOne;
import boardservice.BoardUpdateOne;
import controller.MyController;
import dao.BoardDao;
import dao.MemberDao;
import memberservice.DeleteOne;
import memberservice.GetNumRecords;
import memberservice.InsertOne;
import memberservice.SelectList;
import memberservice.SelectMember;
import memberservice.SelectOne;
import memberservice.UpdateOne;

@Configuration
public class ControllerConfig {

	@Bean
	public MyController myController() {
		return new MyController();
	}

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	public GetNumRecords getNumRecords() {
		return new GetNumRecords();
	}

	@Bean
	public SelectList selectList() {
		return new SelectList();
	}

	@Bean
	public SelectOne selectOne() {
		return new SelectOne();
	}

	@Bean
	public SelectMember selectMember() {
		return new SelectMember();
	}

	@Bean
	public InsertOne insertOne() {
		return new InsertOne();
	}

	@Bean
	public UpdateOne updateOne() {
		return new UpdateOne();
	}

	@Bean
	public DeleteOne deleteOne() {
		return new DeleteOne();
	}

	@Bean
	public BoardDao boardDao() {
		return new BoardDao();
	}

	@Bean
	public BoardGetNumRecords boardGetNumRecords() {
		return new BoardGetNumRecords();
	}

	@Bean
	public BoardSelectList boardSelectList() {
		return new BoardSelectList();
	}

	@Bean
	public BoardSelectOne boardSelectOne() {
		return new BoardSelectOne();
	}

	@Bean
	public BoardInsertOne boardInsertOne() {
		return new BoardInsertOne();
	}

	@Bean
	public BoardUpdateOne boardUpdateOne() {
		return new BoardUpdateOne();
	}

	@Bean
	public BoardDeleteOne boardDeleteOne() {
		return new BoardDeleteOne();
	}

}
