package com.bolt.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.bolt.dao.BestSellerDAO;
import com.bolt.dbo.BestSeller;
import com.opensymphony.xwork2.ActionSupport;

public class BestSellerAction extends ActionSupport{
	
	private BestSellerDAO bestSellerDAO;
	
	public String allRecords(){
		HttpServletRequest request = ServletActionContext.getRequest();
		List<BestSeller> bestSellerList = bestSellerDAO.findAll();
		request.setAttribute("bestSellerList", bestSellerList);
		
		return SUCCESS;
	}

	public BestSellerDAO getBestSellerDAO() {
		return bestSellerDAO;
	}

	public void setBestSellerDAO(BestSellerDAO bestSellerDAO) {
		this.bestSellerDAO = bestSellerDAO;
	}
	
}
