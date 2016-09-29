package av2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArvoreDeDecisao {
	
	private static void selecionaRoupa(){
		File dados = new File("dados.txt");
		FileReader fr;		
		
		try {
			fr = new FileReader(dados);
			BufferedReader br = new BufferedReader(fr);
			
			String estacaoDoAno;
			String sexo;
			String parteDoCorpo;
			String estilo;
			int preco;
			
			String linha = "";
			
			while((linha=br.readLine()) != null){
				String[] informacao = linha.split(",");
				estacaoDoAno = informacao[0].trim();
				sexo = informacao[1].trim();
				parteDoCorpo = informacao[2].trim();
				estilo = informacao[3].trim();
				preco = Integer.parseInt(informacao[4].trim());
				
				if(estacaoDoAno.equals("verao")){
					if(sexo.equals("masulino")){
						if(parteDoCorpo.equals("tronco")){
							if(estilo.equals("casual")){
								//verão-masculino-tronco-casual
							}
							else{
								//verão-masculino-tronco-social
							}
						}
						else{
							if(parteDoCorpo.equals("perna")){
								if(estilo.equals("casual")){
									//verão-masculino-perna-casual
								}
								else{
									//verão-masculino-perna-social
								}
							}
							else{
								if(parteDoCorpo.equals("pes")){
									if(estilo.equals("casual")){
										//verão-masculino-pes-casual
									}
									else{
										//verão-masculino-pes-social
									}
								}
								else{
									if(estilo.equals("casual")){
										//verão-masculino-acessorio-casual
									}
									else{
										//verão-masculino-acessorio-social
									}
								}
							}
						}
					}
					else{
						if(parteDoCorpo.equals("tronco")){
							if(estilo.equals("casual")){
								//verão-feminino-tronco-casual
							}
							else{
								//verão-feminino-tronco-social
							}
						}
						else{
							if(parteDoCorpo.equals("perna")){
								if(estilo.equals("casual")){
									//verão-feminino-perna-casual
								}
								else{
									//verão-feminino-perna-social
								}
							}
							else{
								if(parteDoCorpo.equals("pes")){
									if(estilo.equals("casual")){
										//verão-feminino-pes-casual
									}
									else{
										//verão-feminino-pes-social
									}
								}
								else{
									if(estilo.equals("casual")){
										//verão-feminino-acessorio-casual
									}
									else{
										//verão-feminino-acessorio-social
									}
								}
							}
						}
					}
				}
				else{
					if(sexo.equals("masulino")){
						if(parteDoCorpo.equals("tronco")){
							if(estilo.equals("casual")){
								//verão-masculino-tronco-casual
							}
							else{
								//verão-masculino-tronco-social
							}
						}
						else{
							if(parteDoCorpo.equals("perna")){
								if(estilo.equals("casual")){
									//verão-masculino-perna-casual
								}
								else{
									//verão-masculino-perna-social
								}
							}
							else{
								if(parteDoCorpo.equals("pes")){
									if(estilo.equals("casual")){
										//verão-masculino-pes-casual
									}
									else{
										//verão-masculino-pes-social
									}
								}
								else{
									if(estilo.equals("casual")){
										//verão-masculino-acessorio-casual
									}
									else{
										//verão-masculino-acessorio-social
									}
								}
							}
						}
					}
					else{
						if(parteDoCorpo.equals("tronco")){
							if(estilo.equals("casual")){
								//inverno-feminino-tronco-casual
							}
							else{
								//inverno-feminino-tronco-social
							}
						}
						else{
							if(parteDoCorpo.equals("perna")){
								if(estilo.equals("casual")){
									//inverno-feminino-perna-casual
								}
								else{
									//inverno-feminino-perna-social
								}
							}
							else{
								if(parteDoCorpo.equals("pes")){
									if(estilo.equals("casual")){
										//inverno-feminino-pes-casual
									}
									else{
										//inverno-feminino-pes-social
									}
								}
								else{
									if(estilo.equals("casual")){
										//inverno-feminino-acessorio-casual
									}
									else{
										//inverno-feminino-acessorio-social
									}
								}
							}
						}
					}					
				}
			}
			
			
		} catch (FileNotFoundException e) {
			System.err.println("Erro na leitura do arquivo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	
}
