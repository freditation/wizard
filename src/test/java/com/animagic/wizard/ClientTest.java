package com.animagic.wizard;

import org.junit.Test;
import java.util.GregorianCalendar;

public class ClientTest {

    @Test
    void newClientTest() {
        Client client = new Client("Test Client");
        client.setClientDateOfBirth(new GregorianCalendar(1950, 6, 11));
        client.setHasPartner(true);
        client.setPartnerDateOfBirth(new GregorianCalendar(1960, 9, 24));
    }

}
