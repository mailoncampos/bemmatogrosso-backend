package br.com.bemmatogrosso.domain.shared.repository;

public interface Repository {
	
	public void criar(Object object);
	
	public void editar(Object object);
	
	public void excluir(Long id);
	
	public void buscarPorId(Long id);
		
}
