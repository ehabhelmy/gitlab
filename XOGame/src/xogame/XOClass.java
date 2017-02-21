/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogame;

import Network.XOClient;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ehab
 */
public class XOClass extends UnicastRemoteObject implements XOClient{
    XOGame application;

    public XOClass(XOGame application) throws RemoteException{
        this.application = application;
    }
    
    
    @Override
    public void reset() throws RemoteException {

    }

    @Override
    public void changeM1(String s) throws RemoteException {
     
    }

    @Override
    public void changeM2(String s) throws RemoteException {
        
    }

    @Override
    public void changeM3(String s) throws RemoteException {
        
    }

    @Override
    public void changeM4(String s) throws RemoteException {
       
    }

    @Override
    public void changeM5(String s) throws RemoteException {
        
    }

    @Override
    public void changeM6(String s) throws RemoteException {
        
    }

    @Override
    public void changeM7(String s) throws RemoteException {
        
    }

    @Override
    public void changeM8(String s) throws RemoteException {
       
    }

    @Override
    public void changeM9(String s) throws RemoteException {
        
    }
    
}
