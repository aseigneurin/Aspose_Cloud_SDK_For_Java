package com.aspose.cloud.slides;

import java.util.List;

public class Theme {
	private List<LinkResponse> links;
	public List<LinkResponse> getlinks(){return links;}
	public void setlinks(List<LinkResponse> links){this.links=links;}

	private ThemeColorScheme ColorScheme;
	public ThemeColorScheme getColorScheme(){return ColorScheme;}
	public void setColorScheme(ThemeColorScheme ColorScheme){this.ColorScheme=ColorScheme;}

	private ThemeFontScheme FontScheme;
	public ThemeFontScheme getFontScheme(){return FontScheme;}
	public void setFontScheme(ThemeFontScheme FontScheme){this.FontScheme=FontScheme;}

	private ThemeFormatScheme FormatScheme;
	public ThemeFormatScheme getFormatScheme(){return FormatScheme;}
	public void setFormatScheme(ThemeFormatScheme FormatScheme){this.FormatScheme=FormatScheme;}

	private String Name;
	public String getName(){return Name;}
	public void setName(String Name){this.Name=Name;}

}
