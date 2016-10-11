package cn.tf.csts.entity;



public class FilmInfo {
	
	private Integer filmId;    
	private String filmName; 
	private FilmType filmType; 
	private String actor; 
	private  String director;
	private  String ticketPrice; 
	private  String ticketCount ;
	public Integer getFilmId() {
		return filmId;
	}
	public void setFilmId(Integer filmId) {
		this.filmId = filmId;
	}
	public String getFilmName() {
		return filmName;
	}
	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}
	
	public FilmType getFilmType() {
		return filmType;
	}
	public void setFilmType(FilmType filmType) {
		this.filmType = filmType;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getTicketCount() {
		return ticketCount;
	}
	public void setTicketCount(String ticketCount) {
		this.ticketCount = ticketCount;
	}
	@Override
	public String toString() {
		return "FilmInfo [filmId=" + filmId + ", filmName=" + filmName
				+ ", filmType=" + filmType + ", actor=" + actor + ", director="
				+ director + ", ticketPrice=" + ticketPrice + ", ticketCount="
				+ ticketCount + "]";
	}
	public FilmInfo(Integer filmId, String filmName, FilmType filmType,
			String actor, String director, String ticketPrice,
			String ticketCount) {
		super();
		this.filmId = filmId;
		this.filmName = filmName;
		this.filmType = filmType;
		this.actor = actor;
		this.director = director;
		this.ticketPrice = ticketPrice;
		this.ticketCount = ticketCount;
	}
	public FilmInfo() {
		super();
	}
	
	
	

}
