package com.electricity.bill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electricity.bill.entity.bill;
import com.electricity.bill.service.billService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class billController {
	
	@Autowired(required = false)
	private billService billservice;
	
	@GetMapping("/bill")
	public ResponseEntity<List<bill>> listAllBills(){
		List<bill> lists = this.billservice.getAllBills();
		return ResponseEntity.ok(lists);
	}
	
	
	@PostMapping("/bill/save" )
	public ResponseEntity<bill> saveBill(@RequestBody bill billl){
		
		bill bills = this.billservice.saveBillDetails(billl);
		
		return new ResponseEntity<bill>(bills, HttpStatus.CREATED);
	}
	@GetMapping("/bill/{id}")
	public ResponseEntity<bill> getBillById(@PathVariable("id") Long billId){
		bill billbyid = this.billservice.getBillById(billId);
		return ResponseEntity.ok(billbyid);
	}
	
	@PutMapping("/bill/{id}")
	public ResponseEntity<bill> updateBill(@PathVariable("id") Long id, @RequestBody bill billl){
		bill billupdate = this.billservice.updateBill(id, billl);
		return new ResponseEntity<bill>(billupdate, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/bill/{id}")
	public void deleteBill(@PathVariable("id") Long id){
		this.billservice.deleteBill(id);
		
	}
	
	
	
}
