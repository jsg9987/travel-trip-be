package com.ssafy.travelTune.mybatis;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.TransactionManager;


import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class ConfigTest {
	
	@Autowired
	DataSource ds; // Connection 관리 - HikariCP
	
	@Autowired
	SqlSessionTemplate template; // 실제로 SQL 실행
	
	@Autowired
	TransactionManager tm; // 트랜잭션 관리자(All or Nothing)
	
	@Test
	public void dataSourceTest() throws Exception {
		// DataSource 설정 확인
		assertNotNull(ds);
		log.debug("connection: {}", ds.getClass().getName());
		
		assertNotNull(template);
	}
}
