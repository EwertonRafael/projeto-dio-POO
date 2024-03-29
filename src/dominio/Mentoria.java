package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate data;

	public Mentoria() {
	}

	public Mentoria(LocalDate data) {
		super();
		this.data = data;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return " Mentoria: título = " + getTitulo() + ", descricao = " + getDescricao() + ", data = " + data + ".";
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO * 20d;
	}
}
