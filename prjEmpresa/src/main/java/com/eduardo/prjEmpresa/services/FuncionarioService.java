package com.eduardo.prjEmpresa.services;

import java.util.List;
import java.util.Optional;
import com.eduardo.prjEmpresa.entities.Funcionario;
import com.eduardo.prjEmpresa.repositories.FuncionarioRepository;

	public class FuncionarioService {
		private final FuncionarioRepository funcionarioRepository;
		 
		 public FuncionarioService(FuncionarioRepository funcionarioRepository) {
		    this.funcionarioRepository = funcionarioRepository;
		 }
		 
		 public Funcionario getFuncionarioById(Long funcodigo) {
		        return funcionarioRepository.findById(funcodigo).orElse(null);
		    }
		 
		 public Funcionario saveFuncionario(Funcionario funcionario){
		    return funcionarioRepository.save(funcionario);
		 } 
		 
		 public List<Funcionario> getAllFuncionario(){
		    return funcionarioRepository.findAll();
		 }

		    public void deleteFuncionario(Long funcodigo) {
		        funcionarioRepository.deleteById(funcodigo);
		        
		    }
		 // fazendo o update do jogo com o optional
		 	public Funcionario updateFuncionario(Long funcodigo, Funcionario novoFuncionario) {
		         Optional<Funcionario> funcionarioOptional = funcionarioRepository.findById(funcodigo);
		         if (funcionarioOptional.isPresent()) {
		         	Funcionario funcionarioExistente = funcionarioOptional.get();
		            	funcionarioExistente.setfunnome(novoFuncionario.getfunnome());
		            	funcionarioExistente.setFunnascimento(novoFuncionario.getFunnascimento());
		            	funcionarioExistente.setFunsalario(novoFuncionario.getFunsalario());
		             return funcionarioRepository.save(funcionarioExistente); 
		         } else {
		             return null; 
		         }
		     }
		    
	}

