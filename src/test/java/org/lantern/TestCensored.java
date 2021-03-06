package org.lantern;

import java.io.IOException;
import java.net.InetAddress;

public class TestCensored implements Censored {

    @Override
    public boolean isExportRestricted(String string) throws IOException {
        return false;
    }

    @Override
    public boolean isCountryCodeCensored(String cc) {
        return false;
    }

    @Override
    public boolean isCensored(Country country) {
        return true;
    }

    @Override
    public boolean isCensored() {
        return true;
    }

    @Override
    public boolean isCensored(InetAddress address) {
        return false;
    }

}
