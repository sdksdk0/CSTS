package cn.tf.csts.service;

import cn.tf.csts.entity.FilmInfo;
import cn.tf.csts.entity.PaginationBean;

public interface FilmService {
	
	PaginationBean<FilmInfo> listFilm(String page, String rows);



}
