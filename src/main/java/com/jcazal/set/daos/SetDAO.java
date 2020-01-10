package com.jcazal.set.daos;

import java.lang.annotation.Native;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jcazal.set.entitys.Set;
import com.jcazal.set.rest.CustomSet;

public interface SetDAO extends JpaRepository<Set, Long> {
	// public List<Set> getData(HashMap<String, Object> conditions);
	
	@Query(value = "SELECT id, ruc, dv, razon_social, case tipo when 'f' then 'Persona Fisica' when 'j' then 'Persona Juridica' end as tipo FROM contribuyentes where razon_social  ilike %:razon_social% or ruc ilike %:razon_social% order by razon_social asc",nativeQuery=true)
	public List<Set> findrazon_social(@Param("razon_social") String razon_social);

}
