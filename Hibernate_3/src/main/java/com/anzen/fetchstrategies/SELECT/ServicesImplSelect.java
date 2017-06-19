package com.anzen.fetchstrategies.SELECT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServicesImplSelect implements ServicesSelect {

	@Autowired
	private DataSelectFetch dataSelectFetch;

	@Override
	public void consultaDatosSelect() {
		dataSelectFetch.consultaDatosSelect();
	}

}
