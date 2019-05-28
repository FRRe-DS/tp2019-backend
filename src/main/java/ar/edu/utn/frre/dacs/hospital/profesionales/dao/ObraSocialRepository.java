/*
 * Copyright (C) 2015-2019 UTN-FRRe
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ar.edu.utn.frre.dacs.hospital.profesionales.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.utn.frre.dacs.hospital.profesionales.model.ObraSocial;

/**
 * Repositorio de Acceso a Datos para <code>ObraSocial</code>.
 * 
 * @author Dr. Jorge Villaverde
 * @version 1.0
 */
@Repository
public interface ObraSocialRepository extends JpaRepository<ObraSocial, Long>{

	/**
	 * Busca una Obra Social por el R
	 * @param nros
	 * @return
	 */
	Optional<ObraSocial> findByRnos(Integer rnos);

}