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
 * @author michael
 */
public interface XOInterface extends Remote {

    public void Reset() throws RemoteException;

    public void changeValueM1(String value) throws RemoteException;

    public void changeValueM6(String value) throws RemoteException;

    public void changeValueM7(String value) throws RemoteException;

    public void changeValueM8(String value) throws RemoteException;

    public void changeValueM9(String value) throws RemoteException;

    public void changeValueM2(String s) throws RemoteException;

    public void changeValueM3(String s) throws RemoteException;

    public void changeValueM4(String s) throws RemoteException;

    public void changeValueM5(String s) throws RemoteException;

}
