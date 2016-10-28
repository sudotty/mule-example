package sin13cos14.mule.training;

/**
 * Created by sin13cos14 on 2016/10/28  16:13.
 */
public class MoneyRequest {

    private String sender;
    private String receiver;
    private String senderAccount;
    private String receiverAccount;
    private String origin;
    private String destination;
    private String amount;
    private String originCurreny;
    private String destCurreny;
    private String authCode;
    private String partnerCode;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSenderAccount() {
        return senderAccount;
    }

    public void setSenderAccount(String senderAccount) {
        this.senderAccount = senderAccount;
    }

    public String getReceiverAccount() {
        return receiverAccount;
    }

    public void setReceiverAccount(String receiverAccount) {
        this.receiverAccount = receiverAccount;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getOriginCurreny() {
        return originCurreny;
    }

    public void setOriginCurreny(String originCurreny) {
        this.originCurreny = originCurreny;
    }

    public String getDestCurreny() {
        return destCurreny;
    }

    public void setDestCurreny(String destCurreny) {
        this.destCurreny = destCurreny;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getPartnerCode() {
        return partnerCode;
    }

    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }

}