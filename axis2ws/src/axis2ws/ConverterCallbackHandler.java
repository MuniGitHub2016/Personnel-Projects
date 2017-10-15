
/**
 * ConverterCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */

    package axis2ws;

    /**
     *  ConverterCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ConverterCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ConverterCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ConverterCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for celsiusTofarenheit method
            * override this method for handling normal response from celsiusTofarenheit operation
            */
           public void receiveResultcelsiusTofarenheit(
                    axis2ws.ConverterStub.CelsiusTofarenheitResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from celsiusTofarenheit operation
           */
            public void receiveErrorcelsiusTofarenheit(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for farenheitTocelsius method
            * override this method for handling normal response from farenheitTocelsius operation
            */
           public void receiveResultfarenheitTocelsius(
                    axis2ws.ConverterStub.FarenheitTocelsiusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from farenheitTocelsius operation
           */
            public void receiveErrorfarenheitTocelsius(java.lang.Exception e) {
            }
                


    }
    