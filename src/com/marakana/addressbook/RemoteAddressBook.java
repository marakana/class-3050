
package com.marakana.addressbook;

import java.net.InetSocketAddress;
import java.util.List;

public class RemoteAddressBook implements AddressBook {

    private RemoteAddressBook(InetSocketAddress inetSocketAddress) {
        throw new UnsupportedOperationException("TODO: Implement me!!!");
    }

    @Override
    public Contact getByEmail(String email) throws AddressBookException {
        throw new UnsupportedOperationException("TODO: Implement me!!!");
    }

    @Override
    public List<Contact> getAll() throws AddressBookException {
        throw new UnsupportedOperationException("TODO: Implement me!!!");
    }

    @Override
    public void store(Contact contact) throws AddressBookException {
        throw new UnsupportedOperationException("TODO: Implement me!!!");
    }

    @Override
    public void deleteByEmail(String email) throws AddressBookException {
        throw new UnsupportedOperationException("TODO: Implement me!!!");
    }

    @Override
    public void close() throws AddressBookException {
        throw new UnsupportedOperationException("TODO: Implement me!!!");
    }
}