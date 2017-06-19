package com.anzen.fetchstrategies.JOIN;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicesImplJoin implements ServicesJoin {

	@Autowired
	private DataOuterJoinFetch dataOuterJoinFetch;

	@Autowired
	private DataFetchJoin dataFetchJoin;
	
	@Override
	public void consultaOuterJoinSelect() {
		dataOuterJoinFetch.consultaDatosOuterJoin();
	}



	@Override
	public void consultaJoinSelect() {
		dataFetchJoin.consultaDatosJoin();
	}
	
}
