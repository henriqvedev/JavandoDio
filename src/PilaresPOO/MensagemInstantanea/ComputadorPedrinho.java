package PilaresPOO.MensagemInstantanea;

public class ComputadorPedrinho {
    public static void main (String[] args){
        System.out.println("MSN");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("FB");
        Facebook fcb = new Facebook();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("TLG");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
