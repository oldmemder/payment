package ru.sbrf.payment.SBfront;

public class SBOL {
    private String addrHost;
    private String addrIP;
    private int port;
    private String protocol;
//    private SBOLuser currentUser;

    public static void main(String[] args) {
        SBOLuser currentUser = new SBOLuser();
    }

    public void pay(String addrHost, String addrIP, int port, String protocol) {
        this.addrHost=addrHost;
        this.addrIP=addrIP;
        this.port=port;
        this.protocol=protocol;
    }

}
