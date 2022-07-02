package com.electro.connection.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electro.connection.entity.TypeConnection;
import com.electro.connection.jpa.TypeConnectionRepo;
import com.electro.connection.service.TypeConnectionService;
@Service
public class TypeConnectionServiceImpl implements TypeConnectionService{

	@Autowired
	TypeConnectionRepo typeConnectionRepo;
	
	@Override
	public List<TypeConnection> getTyprOfCOnnection(){
		
		List<TypeConnection>  t =	typeConnectionRepo.findAll();
		
		return t;
	}
	
}
