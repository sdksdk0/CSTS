package cn.tf.csts.web.handler;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tf.csts.entity.FilmInfo;
import cn.tf.csts.entity.PaginationBean;
import cn.tf.csts.service.FilmService;

@Controller
@RequestMapping("/film")
public class FilmHandler {
	
	@Autowired
	private FilmService filmService;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	@ResponseBody
	public PaginationBean  listFilms(String page,String rows){
		/*LogManager.getLogger().debug("请求进来了");*/
		return filmService.listFilm(page,rows);
	}
	
	
	

}
