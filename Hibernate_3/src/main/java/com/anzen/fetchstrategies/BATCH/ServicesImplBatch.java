package com.anzen.fetchstrategies.BATCH;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicesImplBatch implements ServicesBatch{

	@Autowired
	private DataBatchFetch dataBatchFetch;

	@Override
	public void consultaDatosBatch() {
		dataBatchFetch.consultaDatosBatch();
	}
	
}
