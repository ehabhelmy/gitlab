/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Network;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author ehab
 */
public interface XOClient extends Remote {
    public void reset() throws RemoteException;
    public void changeM1(String s) throws RemoteException;
    public void changeM2(String s) throws RemoteException;
    public void changeM3(String s) throws RemoteException;
    public void changeM4(String s) throws RemoteException;
    public void changeM5(String s) throws RemoteException;
    public void changeM6(String s) throws RemoteException;
    public void changeM7(String s) throws RemoteException;
    public void changeM8(String s) throws RemoteException;
    public void changeM9(String s) throws RemoteException;
}
