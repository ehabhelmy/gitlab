/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xoserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author michael
 */
public class XoService extends UnicastRemoteObject implements XOInterface{

    public XoService() throws RemoteException{
    }
    
//    Ehab's methods

    @Override
    public void Reset() throws RemoteException {
        
    }

    @Override
    public void changeValueM1(String value) throws RemoteException {
        
    }

    @Override
    public void changeValueM6(String value) throws RemoteException {
        
    }

    @Override
    public void changeValueM7(String value) throws RemoteException {
       
    }

    @Override
    public void changeValueM8(String value) throws RemoteException {
        
    }

    @Override
    public void changeValueM9(String value) throws RemoteException {
         
    }
    
    //end Ehab
    
    //michael

    @Override
    public void changeValueM2(String s) throws RemoteException {
        
    }

    @Override
    public void changeValueM3(String s) throws RemoteException {
    
    }

    @Override
    public void changeValueM4(String s) throws RemoteException {
    
    }

    @Override
    public void changeValueM5(String s) throws RemoteException {
   
    }
    
    //end michael
    
}
