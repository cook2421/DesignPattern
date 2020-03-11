package StructuralPattern.Decorator.Ex1;

public class ExternalEMailContent extends EMailContentDecorator{

    public ExternalEMailContent(EMailContent eMailContent) {
        super(eMailContent);
    }

    @Override
    String getContent() {
        return addDisclaimer();
    }

    private String addDisclaimer(){
        return super.getContent() + " Company Disclaimer";
    }
}
