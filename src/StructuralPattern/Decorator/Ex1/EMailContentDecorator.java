package StructuralPattern.Decorator.Ex1;

public class EMailContentDecorator extends EMailContent{

    private EMailContent eMailContent;

    public EMailContentDecorator(EMailContent eMailContent){
        this.eMailContent = eMailContent;
    }

    @Override
    String getContent() {
        return eMailContent.getContent();
    }
}
