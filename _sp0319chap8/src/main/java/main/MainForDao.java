package main;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppCtx;
import spring.Member;
import spring.MemberDao;

public class MainForDao {

	private static Logger LOGGER = LoggerFactory.getLogger(MainForDao.class);

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

		MemberDao dao = ctx.getBean(MemberDao.class);
		List<Member> list = dao.selectAll();

		Member member2 = new Member("eee@korea.com", "5555", "EEE", null);
		dao.insert2(member2);
		LOGGER.info("─────INSERT()─────");
		LOGGER.info("새로 입력한 회원의 ID: {}", member2.getId());

//		Member member2 = new Member("aaa@korea.com", "5678", "이순신", null);
//		dao.update(member2);
//		LOGGER.info("─────UDPATE()─────");

		LOGGER.info("─────count()─────");
		int cnt = dao.count();
		LOGGER.info("총 인원 수 : {}", cnt);

		LOGGER.info("─────selectAll()─────");
		for (Member member : list) {
			LOGGER.info(member.toString());
		}

		Member member3 = dao.selectByEmail3("hana@korea.com");
//		LOGGER.info("{}", member);
		LOGGER.info("─────selectByEmail3─────");
		if (member3 != null) {
			LOGGER.info("아이디 : {}, 이메일 : {}, 패스워드 : {}, 이름 : {}, 등록일 : {}", member3.getId(), member3.getEmail(),
					member3.getPassword(), member3.getName(), member3.getRegisterDateTime());
		} else {
			LOGGER.info("NULL이여");
		}
		ctx.close();
	}
}