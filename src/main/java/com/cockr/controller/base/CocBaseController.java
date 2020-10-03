package com.cockr.controller.base;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.ResponseEntity;
import org.modelmapper.ModelMapper;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.springframework.security.access.annotation.Secured;
import org.springframework.beans.factory.annotation.Autowired;
import com.cockr.db.cockr_db.service.CocService;
import com.cockr.db.cockr_db.entity.Coc;
import com.cockr.db.cockr_db.dtos.CocDto;

//IMPORT RELATIONS


public class CocBaseController {
    
    @Autowired
	CocService cocService;

	

	@Autowired
	private ModelMapper modelMapper;



//CRUD METHODS



/*
 * CUSTOM SERVICES
 * 
 *	These services will be overwritten and implemented in  Custom.js
 */


	private CocDto convertToDto(Coc coc) {
		CocDto cocDto = modelMapper.map(coc, CocDto.class);
		return cocDto;
	}
}
