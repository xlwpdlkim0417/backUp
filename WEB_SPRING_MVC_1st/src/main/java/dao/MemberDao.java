package dao;

import java.sql.*;
import java.util.*;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import dto.Member;

@Service
public class MemberDao {
	private JdbcTemplate jdbcTemplate;

	public MemberDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int count() {
		Integer count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM MEMBER", Integer.class);
		return count;
	}

	public String memberName(int memberno) {
		return jdbcTemplate.queryForObject("SELECT NAME FROM MEMBER WHERE MEMBERNO = ?", String.class, memberno);
	}

	public void insert(Member member) {
		jdbcTemplate.update("INSERT INTO MEMBER (id, pw, name) VALUES (?, ?, ?)", member.getId(), member.getPw(),
				member.getName());
	}

	public void update(Member member) {
		jdbcTemplate.update("UPDATE MEMBER SET PW = ?, NAME = ? WHERE MEMBERNO = ?", member.getPw(), member.getName(),
				member.getMemberno());
	}

	public void delete(int memberno) {
		jdbcTemplate.update("DELETE FROM MEMBER WHERE MEMBERNO = ?", memberno);
	}

	public List<Member> selectAll() {
		List<Member> results = jdbcTemplate.query("SELECT * FROM MEMBER", new RowMapper<Member>() {

			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				Member dto = new Member(rs.getInt("memberno"), rs.getString("id"), rs.getString("pw"),
						rs.getString("name"));
				return dto;
			}

		});
		return results;
	}

	public List<Member> selectAll2() {
		List<Member> results = jdbcTemplate.query("SELECT * FROM MEMBER", (ResultSet rs, int rowNum) -> {
			Member dto = new Member(rs.getInt("memberno"), rs.getString("id"), rs.getString("pw"),
					rs.getString("name"));
			return dto;
		});
		return results;
	}

	public Member selectForLogin(String id, String pw) {
		Member member = null;
		jdbcTemplate.queryForObject("SELECT * FROM MEMBER WHERE ID = ? AND PW = ?", String.class, id, pw);
		return member;
	}
}