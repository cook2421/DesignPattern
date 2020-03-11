package StructuralPattern.Decorator.Ex1;

public class BasicEMailContent extends EMailContent{

    private String content;


    public BasicEMailContent(String content){
        this.content = content;
    }

    @Override
    String getContent() {
        return content;
    }
}
