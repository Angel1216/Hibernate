package com.anzen.fetchstrategies.BATCH;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerBatch {
	
	@Autowired
	private ServicesBatch servicesBatch;
	
	
	@RequestMapping(value="/dataBatchFetch")
	public void consultaDatosBatch(){
		servicesBatch.consultaDatosBatch();
	}
	
}
