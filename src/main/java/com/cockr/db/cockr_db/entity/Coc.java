package com.cockr.db.cockr_db.entity;

import javax.persistence.Entity;
import com.cockr.db.cockr_db.entity.base.CocBase;

@Entity
public class Coc extends CocBase {

    public Coc() {}

    public Coc(String id) {
        this.set_id(Long.valueOf(id));
    }

	//OVERRIDE HERE YOUR CUSTOM MAPPER
	
	
}
