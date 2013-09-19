package com.aspose.cloud.words;

public class DocumentLink {
	private String Href ;
	private String Rel ;
	private Object Type ;
	private Object Title ;
    
    public String getHref(){return Href;}
    public String getRel(){return Rel;}
    public Object getType(){return Type;}
    public Object getTitle(){return Title;}
    
    public void setHref(String Href) {this.Href=Href;}
    public void setRel(String Rel) {this.Rel=Rel;}
    public void setType (Object Type) {this.Type=Type;}
    public void setTitle(Object Title) {this.Title=Title;}
}
