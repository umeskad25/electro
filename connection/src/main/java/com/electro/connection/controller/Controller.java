package com.electro.connection.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.electro.connection.entity.TypeConnection;
import com.electro.connection.entity.VoltageLevel;
import com.electro.connection.jpa.SaveConnection;
import com.electro.connection.jpa.VoltageLevelRepo;

@RestController
public class Controller {

	
	@Autowired
	SaveConnection saveConnection;
	
	@Autowired
	VoltageLevelRepo voltageLevelRepo;
	
	@Autowired
	com.electro.connection.serviceImpl.TypeConnectionServiceImpl typeConnectionServiceImpl;
	
	@GetMapping(value = "/saveList/{id}")
	public ResponseEntity<String> ConnectionList(@PathVariable Long id) {
		
		Optional<TypeConnection> t = saveConnection.findById(id);
		
		TypeConnection t1 = new TypeConnection();
		t1 = t.get();
		return ResponseEntity.status(HttpStatus.OK).body(t1.getConnectionType());
	}
	
	@GetMapping(value = "/VoltageLevel/{id}")
	public ResponseEntity<String> voltageLevel(@PathVariable Long id) {
		
		Optional<VoltageLevel> t = voltageLevelRepo.findById(id);
		
		VoltageLevel t1 = new VoltageLevel();
		t1 = (VoltageLevel) t.get();
		return ResponseEntity.status(HttpStatus.OK).body(t1.getLevel());
	}
	
	
	
	
	
	@GetMapping(value = "/typeConnection")
	public ResponseEntity<List<TypeConnection>> typeConnection() {
//		List<VoltageLevel>
		List<TypeConnection> list = typeConnectionServiceImpl.getTyprOfCOnnection();
		System.out.println(list);
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
	@GetMapping(value = "/VoltageLevel")
	public ResponseEntity<List<VoltageLevel>> voltageLevelAll() {
		
		List<VoltageLevel> t = voltageLevelRepo.findAll();
		System.out.println(t);
		
		return ResponseEntity.status(HttpStatus.OK).body(t);
	}
	
	@PostMapping(value = "/VoltageLevelAdd")
	public ResponseEntity<String> voltageLevelAdd(@RequestBody VoltageLevel v) {
		
		VoltageLevel t = voltageLevelRepo.save(v);
		
		
		return ResponseEntity.status(HttpStatus.OK).body("Voltage level added succesfully ");
	}
}
