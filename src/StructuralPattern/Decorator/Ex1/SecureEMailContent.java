package StructuralPattern.Decorator.Ex1;

public class SecureEMailContent extends EMailContentDecorator {

    public SecureEMailContent(EMailContent eMailContent) {
        super(eMailContent);
    }

    @Override
    String getContent() {
        return encrypt();
    }

    private String encrypt(){
        return super.getContent() + " Encrypted";
    }
}
