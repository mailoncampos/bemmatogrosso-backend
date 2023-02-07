package br.com.bemmatogrosso.domain.shared.repository;

public interface RepositoryBemMatoGrosso {
	
	public <T> void criar(T object);
	
	public <T> void editar(T object);
	
	public void excluir(Long id);
	
	public <T> T buscarPorId(Long id);
		
}
