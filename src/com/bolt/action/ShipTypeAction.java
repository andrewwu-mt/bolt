package com.bolt.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.bolt.dao.ShipTypeDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ShipTypeAction extends ActionSupport{
	
	
	private ShipTypeDAO shipTypeDAO;
	
	public String allRecords(){
		List shipTypeList = shipTypeDAO.findAll();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("shipTypeList", shipTypeList);
		
		return SUCCESS;
	}

	public ShipTypeDAO getShipTypeDAO() {
		return shipTypeDAO;
	}

	public void setShipTypeDAO(ShipTypeDAO shipTypeDAO) {
		this.shipTypeDAO = shipTypeDAO;
	}
	
	
	
	
	

}
