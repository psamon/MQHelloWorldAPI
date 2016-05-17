/**
 * 
 */
package com.anz.MQHelloWorldAPI.compute;

import com.anz.MQHelloWorldAPI.transform.PreTransformBLSample;
import com.anz.common.compute.ComputeInfo;
import com.anz.common.compute.impl.CommonBlobTransformCompute;
import com.anz.common.compute.impl.ComputeUtils;
import com.anz.common.transform.ITransformer;
import com.ibm.broker.plugin.MbException;
import com.ibm.broker.plugin.MbMessage;
import com.ibm.broker.plugin.MbMessageAssembly;

/**
 * @author sanketsw
 *
 */
public class RequestTransformCompute extends CommonBlobTransformCompute {

	/* (non-Javadoc)
	 * @see com.anz.common.compute.impl.CommonJsonJsonTransformCompute#getTransformer()
	 */
	@Override
	public ITransformer<String, String> getTransformer() {
		return new PreTransformBLSample();
	}

	@Override
	public void prepareForTransformation(ComputeInfo metadata,
			MbMessageAssembly inAssembly, MbMessageAssembly outAssembly) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeAfterTransformation(ComputeInfo metadata,
			MbMessageAssembly inAssembly, MbMessageAssembly outAssembly) {
		
		
		try {
			ComputeUtils.setElementInTree((String) getUserDefinedAttribute("OUTPUT_QUEUE_MGR"), outAssembly.getLocalEnvironment(), "Destination", "MQ", "DestinationData", "queueManagerName");
			ComputeUtils.setElementInTree((String) getUserDefinedAttribute("OUTPUT_QUEUE"), outAssembly.getLocalEnvironment(), "Destination","MQ","DestinationData", "queueName" );
		} catch (MbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		super.executeAfterTransformation(metadata, inAssembly, outAssembly);
	}
	
	

}
