package cn.tf.csts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.tf.csts.entity.FilmInfo;
import cn.tf.csts.entity.PaginationBean;
import cn.tf.csts.service.FilmService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class FilmServiceTest {
	
	@Autowired
	private FilmService filmService;
	
	
	@Test
	public void test1(){
		PaginationBean<FilmInfo>  pb=filmService.listFilm(1+"",5+"");
		System.out.println(pb);
		
	}

}
