/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xoserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author michael
 */
public interface XOInterface extends Remote{
    
    public void Reset()throws RemoteException;
 
    public void changeValueM1()throws RemoteException;
    
    public void changeValueM2()throws RemoteException;
    
    public void changeValueM3()throws RemoteException;
    
    public void changeValueM4()throws RemoteException;
    
    public void changeValueM5()throws RemoteException;
    
}
