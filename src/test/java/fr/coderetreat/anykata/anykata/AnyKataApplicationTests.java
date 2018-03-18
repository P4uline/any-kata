package fr.coderetreat.anykata.anykata;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnyKataApplicationTests {

	@Autowired
	private SomeBean someBean;
	
	@Test
	public void contextLoads() {
		
		Assertions.assertThat(someBean).isNotNull();
	}

}
