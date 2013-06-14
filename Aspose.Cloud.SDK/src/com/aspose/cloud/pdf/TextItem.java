/**
 * 
 */
package com.aspose.cloud.pdf;

import java.lang.String;
/**
 * @author Mudassir
 *
 */
/// <summary>
/// represents a single text item
/// </summary>
public class TextItem
{
    public TextItem() { }

 //   public List<LinkResponse> Links { get; set; }
    private TextFormat Format;
    private String Text;
    
    public TextFormat getTextFormat(){return Format;}
    public String getText(){return Text;}

}