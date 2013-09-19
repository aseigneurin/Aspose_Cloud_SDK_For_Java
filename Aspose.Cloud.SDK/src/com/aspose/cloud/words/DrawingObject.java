package com.aspose.cloud.words;
import java.util.List;

    public class DrawingObject
    {

        public DrawingObject() { }

        private LinkResponse link;
        public LinkResponse getlink(){return link;}
        public void setlink(LinkResponse link){this.link=link;}

        private float Height;
        public float getHeight(){return Height;}
        public void setHeight(float Height){this.Height=Height;}

        private LinkResponse ImageDataLink;
        public LinkResponse getImageDataLink(){return ImageDataLink;}
        public void setImageDataLink(LinkResponse ImageDataLink){this.ImageDataLink=ImageDataLink;}

        private LinkResponse OleDataLink;
        public LinkResponse getOleDataLink(){return OleDataLink;}
        public void setOleDataLink(LinkResponse OleDataLink){this.OleDataLink=OleDataLink;}

        private List<LinkResponse> RenderLinks;
        public List<LinkResponse> getRenderLinks(){return RenderLinks;}
        public void setRenderLinks(List<LinkResponse> RenderLinks){this.RenderLinks=RenderLinks;}

        private float Width;
        public float getWidth(){return Width;}
        public void setWidth(float Width){this.Width=Width;}


    }