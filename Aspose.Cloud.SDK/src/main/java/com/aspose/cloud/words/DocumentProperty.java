package com.aspose.cloud.words;

    public class DocumentProperty 
    {
        public DocumentProperty() { }

        /// <summary>
        /// Resource BuiltIn Property
        /// </summary>
        private Boolean BuiltIn;
        public Boolean getBuiltIn(){return BuiltIn;}
        public void setBuiltIn(Boolean BuiltIn){this.BuiltIn=BuiltIn;}
        /// <summary>
        /// Resource Name Property
        /// </summary>
        private String Name;
        public String getName(){return Name;}
        public void setName(String Name){this.Name=Name;}

        /// <summary>
        /// Resource Value Property
        /// </summary>
        private String Value;
        public String getValue(){return Value;}
        public void setValue(String Value){this.Value=Value;}


        /// <summary>
        /// Link Response related to document properties
        /// <link href="http://api.saaspose.com/v1.0/words/TestProperties.doc/documentProperties/Author" rel="self" />
        /// </summary>
        private LinkResponse link;
        public LinkResponse getlink(){return link;}
        public void setlink(LinkResponse link){this.link=link;}


        public DocumentProperty(String propName, String propValue)
        {
            Name = propName;
            Value = propValue;
        }
    }