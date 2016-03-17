package br.com.qiinfo.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExecutaComandoShell {

	private String comando;

	
	public ExecutaComandoShell() {

	}

	public String executarComando(String comando) {
		this.comando = comando;

		String retorno = "";
		try {
			// Tenta executar um comando
			Runtime runtime = Runtime.getRuntime();
			Process p = runtime.exec(this.comando);

			InputStream is = p.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			// lê a resposta do comando linha por linha
			String line;
			while ((line = br.readLine()) != null) {
				retorno += line + "\n";
			}			

		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}

		this.comando = new String();
		
		return retorno;	
	}
}
