package com.aspose.cloud.words;

    public class DocumentProperty 
    {
        public DocumentProperty() { }

        /// <summary>
        /// Resource BuiltIn Property
        /// </summary>
        public Boolean BuiltIn ;

        /// <summary>
        /// Resource Name Property
        /// </summary>
        public String Name ;

        /// <summary>
        /// Resource Value Property
        /// </summary>
        public String Value ;

        /// <summary>
        /// Link Response related to document properties
        /// <link href="http://api.saaspose.com/v1.0/words/TestProperties.doc/documentProperties/Author" rel="self" />
        /// </summary>
        public LinkResponse link ;

        public DocumentProperty(String propName, String propValue)
        {
            Name = propName;
            Value = propValue;
        }
    }