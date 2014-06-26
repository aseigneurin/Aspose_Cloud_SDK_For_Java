package com.aspose.cloud.slides;

import java.util.List;

public class Slide {
	private List<LinkResponse> links;
	public List<LinkResponse> getlinks(){return links;}
	public void setlinks(List<LinkResponse> links){this.links=links;}

	private Images Images;
	public Images getImages(){return Images;}
	public void setImages(Images Images){this.Images=Images;}

	private Placeholders Placeholders;
	public Placeholders getPlaceholders(){return Placeholders;}
	public void setPlaceholders(Placeholders Placeholders){this.Placeholders=Placeholders;}

	private Shapes Shapes;
	public Shapes getShapes(){return Shapes;}
	public void setShapes(Shapes Shapes){this.Shapes=Shapes;}

	private SlideTheme Theme;
	public SlideTheme getTheme(){return Theme;}
	public void setTheme(SlideTheme Theme){this.Theme=Theme;}

}
