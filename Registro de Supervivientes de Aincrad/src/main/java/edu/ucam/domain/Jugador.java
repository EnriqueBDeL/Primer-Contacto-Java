package edu.ucam.domain;

public class Jugador {

	private String nickname;
	private int nivel;
	private String gremio;
	private boolean vivo = true;
	
	
	
	public Jugador(String nickname, int nivel, String gremio) {
		
		this.nickname = nickname;
		this.nivel = nivel;
		this.gremio = gremio;
		
	}

	
	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getGremio() {
		return gremio;
	}

	public void setGremio(String gremio) {
		this.gremio = gremio;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
	
	
}
