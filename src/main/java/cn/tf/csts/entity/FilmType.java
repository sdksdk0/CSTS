package cn.tf.csts.entity;

public class FilmType {
	
	  
	private Integer typeId;
	private String typeName;
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	@Override
	public String toString() {
		return "FilmType [typeId=" + typeId + ", typeName=" + typeName + "]";
	}
	public FilmType(Integer typeId, String typeName) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
	}
	public FilmType() {
		super();
	}
	
	  
	  

}
