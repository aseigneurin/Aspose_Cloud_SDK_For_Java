package com.aspose.cloud.words;

    public class DocumentResponse extends com.aspose.cloud.common.BaseResponse
    {
        /// <summary>
        /// Document Properties response
        /// </summary>
    	private DocumentPropertiesResponse DocumentProperties;
    	public DocumentPropertiesResponse getDocumentProperties(){return DocumentProperties;}
    	public void setDocumentProperties(DocumentPropertiesResponse DocumentProperties){this.DocumentProperties=DocumentProperties;}


        /// <summary>
        /// Document Property response
        /// </summary>
    	private DocumentProperty DocumentProperty;
    	public DocumentProperty getDocumentProperty(){return DocumentProperty;}
    	public void setDocumentProperty(DocumentProperty DocumentProperty){this.DocumentProperty=DocumentProperty;}

    }