package com.anzen.fetchstrategies.SUBSELECT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServicesImplSubSelect implements ServicesSubSelect {
	
	@Autowired
	private DataSubSelectFetch dataSubSelectFetch;

	@Override
	public void consultaDatosSubSelect() {
		dataSubSelectFetch.consultaDatosSubSelect();
	}
	
}
