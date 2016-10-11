package cn.tf.csts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tf.csts.entity.FilmInfo;
import cn.tf.csts.entity.PaginationBean;
import cn.tf.csts.mapper.FilmMapper;
import cn.tf.csts.service.FilmService;

@Service
public class FilmServiceImpl implements FilmService {
	
	@Autowired
	private FilmMapper  filmMapper;
	

	@Override
	public PaginationBean<FilmInfo> listFilm(String page, String rows) {
		int pageSize=10;
		int currPage=1;
		if(page!=null){
			currPage=Integer.parseInt(page);	
		}
		if(rows!=null){
			pageSize=Integer.parseInt(rows);	
		}
		
		PaginationBean<FilmInfo>  pb=new PaginationBean<FilmInfo>(pageSize,currPage);
		return filmMapper.getPartFilm(pb);
	}

}
