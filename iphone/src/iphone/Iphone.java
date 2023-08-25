package iphone;

public class Iphone {

	private int numeros;
	private String teclas;
	
	public Iphone() {
	}

	public int getNumeros() {
		return numeros;
	}

	public String getTeclas() {
		return teclas;
	}
	
	public static void main(String args[]) {
		
		NavegadorInternet.exibirPagina();
		NavegadorInternet.adicionaNovaAba();
		NavegadorInternet.atualizarPagina();
		
		System.out.println();
		
		ReprodutorMusical.selecionarMusica();
		ReprodutorMusical.tocar();
		ReprodutorMusical.pausar();
		
		System.out.println();
		
		AparelhoTelefonico.ligar();
		AparelhoTelefonico.atender();
		AparelhoTelefonico.iniciarCorreioVoz();
		
		
	}
}
