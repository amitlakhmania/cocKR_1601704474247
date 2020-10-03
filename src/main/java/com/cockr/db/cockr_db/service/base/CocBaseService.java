package com.cockr.db.cockr_db.service.base;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;


import com.cockr.db.cockr_db.entity.Coc;

import com.cockr.db.cockr_db.repositories.CocRepository;

@Service
@Transactional
public class CocBaseService {

	
	@Autowired
	CocRepository cocRepository;


    // CRUD METHODS
    

}
