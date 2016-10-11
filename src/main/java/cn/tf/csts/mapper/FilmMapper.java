package cn.tf.csts.mapper;

import cn.tf.csts.entity.FilmInfo;
import cn.tf.csts.entity.PaginationBean;

public interface FilmMapper {

	public PaginationBean<FilmInfo> getPartFilm(PaginationBean<FilmInfo> pb);

}
