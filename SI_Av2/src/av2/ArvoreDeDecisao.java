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
								//ver�o-masculino-tronco-casual
							}
							else{
								//ver�o-masculino-tronco-social
							}
						}
						else{
							if(parteDoCorpo.equals("perna")){
								if(estilo.equals("casual")){
									//ver�o-masculino-perna-casual
								}
								else{
									//ver�o-masculino-perna-social
								}
							}
							else{
								if(parteDoCorpo.equals("pes")){
									if(estilo.equals("casual")){
										//ver�o-masculino-pes-casual
									}
									else{
										//ver�o-masculino-pes-social
									}
								}
								else{
									if(estilo.equals("casual")){
										//ver�o-masculino-acessorio-casual
									}
									else{
										//ver�o-masculino-acessorio-social
									}
								}
							}
						}
					}
					else{
						if(parteDoCorpo.equals("tronco")){
							if(estilo.equals("casual")){
								//ver�o-feminino-tronco-casual
							}
							else{
								//ver�o-feminino-tronco-social
							}
						}
						else{
							if(parteDoCorpo.equals("perna")){
								if(estilo.equals("casual")){
									//ver�o-feminino-perna-casual
								}
								else{
									//ver�o-feminino-perna-social
								}
							}
							else{
								if(parteDoCorpo.equals("pes")){
									if(estilo.equals("casual")){
										//ver�o-feminino-pes-casual
									}
									else{
										//ver�o-feminino-pes-social
									}
								}
								else{
									if(estilo.equals("casual")){
										//ver�o-feminino-acessorio-casual
									}
									else{
										//ver�o-feminino-acessorio-social
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
								//ver�o-masculino-tronco-casual
							}
							else{
								//ver�o-masculino-tronco-social
							}
						}
						else{
							if(parteDoCorpo.equals("perna")){
								if(estilo.equals("casual")){
									//ver�o-masculino-perna-casual
								}
								else{
									//ver�o-masculino-perna-social
								}
							}
							else{
								if(parteDoCorpo.equals("pes")){
									if(estilo.equals("casual")){
										//ver�o-masculino-pes-casual
									}
									else{
										//ver�o-masculino-pes-social
									}
								}
								else{
									if(estilo.equals("casual")){
										//ver�o-masculino-acessorio-casual
									}
									else{
										//ver�o-masculino-acessorio-social
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
