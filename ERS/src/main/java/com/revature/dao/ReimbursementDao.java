package com.revature.dao;

import java.util.List;

import com.revature.models.Reimbursement;

public interface ReimbursementDao {
	public List<Reimbursement> getAllReimbursements();

	public Reimbursement getReimbursementById(int id);

	public int createReimbursement(Reimbursement r);

	public int updateReimbursement(Reimbursement r);

	public int deleteReimbursement(Reimbursement r);
}
