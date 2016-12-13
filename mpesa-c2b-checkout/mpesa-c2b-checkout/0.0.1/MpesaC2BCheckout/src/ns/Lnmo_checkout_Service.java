
/**
 * Lnmo_checkout_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package ns;

/*
 *  Lnmo_checkout_Service java interface
 */

public interface Lnmo_checkout_Service {

	/**
	 * Auto generated method signature
	 * 
	 * @param transactionStatusRequest2
	 * 
	 * @param checkOutHeader3
	 * 
	 */

	public ns.TransactionStatusResponse transactionStatusQuery(

			ns.TransactionStatusRequest transactionStatusRequest2, ns.CheckOutHeader checkOutHeader3)
			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @param transactionStatusRequest2
	 * 
	 * @param checkOutHeader3
	 * 
	 */
	public void starttransactionStatusQuery(

			ns.TransactionStatusRequest transactionStatusRequest2, ns.CheckOutHeader checkOutHeader3,

			final ns.Lnmo_checkout_ServiceCallbackHandler callback)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @param resultMsg5
	 * 
	 */

	public ns.ResponseMsg lNMOResult(

			ns.ResultMsg resultMsg5) throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @param resultMsg5
	 * 
	 */
	public void startlNMOResult(

			ns.ResultMsg resultMsg5,

			final ns.Lnmo_checkout_ServiceCallbackHandler callback)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @param transactionConfirmRequest7
	 * 
	 * @param checkOutHeader8
	 * 
	 */

	public ns.TransactionConfirmResponse confirmTransaction(

			ns.TransactionConfirmRequest transactionConfirmRequest7, ns.CheckOutHeader checkOutHeader8)
			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @param transactionConfirmRequest7
	 * 
	 * @param checkOutHeader8
	 * 
	 */
	public void startconfirmTransaction(

			ns.TransactionConfirmRequest transactionConfirmRequest7, ns.CheckOutHeader checkOutHeader8,

			final ns.Lnmo_checkout_ServiceCallbackHandler callback)

			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature
	 * 
	 * @param processCheckOutRequest10
	 * 
	 * @param checkOutHeader11
	 * 
	 */

	public ns.ProcessCheckOutResponse processCheckOut(

			ns.ProcessCheckOutRequest processCheckOutRequest10, ns.CheckOutHeader checkOutHeader11)
			throws java.rmi.RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @param processCheckOutRequest10
	 * 
	 * @param checkOutHeader11
	 * 
	 */
	public void startprocessCheckOut(

			ns.ProcessCheckOutRequest processCheckOutRequest10, ns.CheckOutHeader checkOutHeader11,

			final ns.Lnmo_checkout_ServiceCallbackHandler callback)

			throws java.rmi.RemoteException;

	//
}
