
/**
 * Lnmo_checkout_ServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package ns;

/**
 * Lnmo_checkout_ServiceCallbackHandler Callback class, Users can extend this
 * class and implement their own receiveResult and receiveError methods.
 */
public abstract class Lnmo_checkout_ServiceCallbackHandler {

	protected Object clientData;

	/**
	 * User can pass in any object that needs to be accessed once the
	 * NonBlocking Web service call is finished and appropriate method of this
	 * CallBack is called.
	 * 
	 * @param clientData
	 *            Object mechanism by which the user can pass in user data that
	 *            will be avilable at the time this callback is called.
	 */
	public Lnmo_checkout_ServiceCallbackHandler(Object clientData) {
		this.clientData = clientData;
	}

	/**
	 * Please use this constructor if you don't want to set any clientData
	 */
	public Lnmo_checkout_ServiceCallbackHandler() {
		this.clientData = null;
	}

	/**
	 * Get the client data
	 */

	public Object getClientData() {
		return clientData;
	}

	/**
	 * auto generated Axis2 call back method for transactionStatusQuery method
	 * override this method for handling normal response from
	 * transactionStatusQuery operation
	 */
	public void receiveResulttransactionStatusQuery(ns.TransactionStatusResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from transactionStatusQuery operation
	 */
	public void receiveErrortransactionStatusQuery(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for lNMOResult method override this
	 * method for handling normal response from lNMOResult operation
	 */
	public void receiveResultlNMOResult(ns.ResponseMsg result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from lNMOResult operation
	 */
	public void receiveErrorlNMOResult(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for confirmTransaction method
	 * override this method for handling normal response from confirmTransaction
	 * operation
	 */
	public void receiveResultconfirmTransaction(ns.TransactionConfirmResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from confirmTransaction operation
	 */
	public void receiveErrorconfirmTransaction(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for processCheckOut method override
	 * this method for handling normal response from processCheckOut operation
	 */
	public void receiveResultprocessCheckOut(ns.ProcessCheckOutResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from processCheckOut operation
	 */
	public void receiveErrorprocessCheckOut(java.lang.Exception e) {
	}

}
