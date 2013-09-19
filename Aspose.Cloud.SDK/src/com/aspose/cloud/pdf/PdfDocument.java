package com.aspose.cloud.pdf;

public class PdfDocument {
	private LinkResponse[] Links;
	public LinkResponse[] getLinks(){return Links;}
	public void setLinks(LinkResponse[] Links){this.Links=Links;}

	private DocumentPropertiesEnvelop DocumentProperties;
	public DocumentPropertiesEnvelop getDocumentProperties(){return DocumentProperties;}
	public void setDocumentProperties(DocumentPropertiesEnvelop DocumentProperties){this.DocumentProperties=DocumentProperties;}

	private PagesEnvelop Pages;
	public PagesEnvelop getPages(){return Pages;}
	public void setPages(PagesEnvelop Pages){this.Pages=Pages;}

}
