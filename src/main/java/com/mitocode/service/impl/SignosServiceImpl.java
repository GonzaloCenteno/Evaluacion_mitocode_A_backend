package com.mitocode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mitocode.model.Signos;
import com.mitocode.repo.ISignosRepo;
import com.mitocode.service.ISignosService;

@Service
public class SignosServiceImpl implements ISignosService{
	
	@Autowired
	private ISignosRepo signoRepo;

	@Override
	public Signos registrar(Signos obj) {
		return signoRepo.save(obj);
	}

	@Override
	public Signos modificar(Signos obj) {
		return signoRepo.save(obj);
	}

	@Override
	public List<Signos> listar() {
		return signoRepo.findAll();
	}

	@Override
	public Signos leerPorId(Integer id) {
		Optional<Signos> op = signoRepo.findById(id);
		return op.isPresent() ? op.get() : new Signos();
	}

	@Override
	public boolean eliminar(Integer id) {
		signoRepo.deleteById(id);
		return true;
	}

	@Override
	public Page<Signos> listarSignos(Pageable pageable) {
		return signoRepo.findAll(pageable);
	}

}
