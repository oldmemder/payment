package ru.sbrf.payment.ibback.clientsbase;

import lombok.Getter;

@Getter
public class ClientItem {
    private String clientNumber;
    private Integer passWordHash;
    private FullName fullName;

    public ClientItem(String clientNumber, String passWord, FullName fullName) {
        this.clientNumber = clientNumber;
        this.passWordHash = passWord.hashCode();
        this.fullName = fullName;
    }

}

