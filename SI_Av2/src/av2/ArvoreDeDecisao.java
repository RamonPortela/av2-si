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
					if(sexo.equals("masculino")){
						if(parteDoCorpo.equals("tronco")){
							if(estilo.equals("casual")){
								System.out.println("Regata, Blusa e Camisa");//verão-masculino-tronco-casual
							}
							else{
								System.out.println("Blusa social e Blazer");//verão-masculino-tronco-social
							}
						}
						else{
							if(parteDoCorpo.equals("perna")){
								if(estilo.equals("casual")){
									System.out.println("Bermuda e short");//verão-masculino-perna-casual
								}
								else{
									System.out.println("Calça social e Calça Jeans Black");//verão-masculino-perna-social
								}
							}
							else{
								if(parteDoCorpo.equals("pes")){
									if(estilo.equals("casual")){
										System.out.println("Tênis, chinelo e percata.");//verão-masculino-pes-casual
									}
									else{
										System.out.println("Sapato social e sapatênis.");//verão-masculino-pes-social
									}
								}
								else{
									if(estilo.equals("casual")){
										System.out.println("Boné, cordão e óculos escuro.");//verão-masculino-acessorio-casual
									}
									else{
										System.out.println("Gravata, relógio, cinto e suspensório.");//verão-masculino-acessorio-social
									}
								}
							}
						}
					}
					else{
						if(parteDoCorpo.equals("tronco")){
							if(estilo.equals("casual")){
								System.out.println("Jardineira, vestido curto, blusa, camisa, regata, e etc..");//verão-feminino-tronco-casual
							}
							else{
								System.out.println("Blusa social, vestido longo e blazer");//verão-feminino-tronco-social
							}
						}
						else{
							if(parteDoCorpo.equals("perna")){
								if(estilo.equals("casual")){
									System.out.println("Short, saia, bermuda, sarouel, e etc..");//verão-feminino-perna-casual
								}
								else{
									System.out.println("Calça social, saia longa, tubinho, e etc..");//verão-feminino-perna-social
								}
							}
							else{
								if(parteDoCorpo.equals("pes")){
									if(estilo.equals("casual")){
										System.out.println("Chinelo, sandália, sapatilha, aspargatas, rasteirinha, e etc..");//verão-feminino-pes-casual
									}
									else{
										System.out.println("Salto e crocs.");//verão-feminino-pes-social
									}
								}
								else{
									if(estilo.equals("casual")){
										System.out.println("Brinco, cordão, relógio, pulseira, cinta e etc");//verão-feminino-acessorio-casual
									}
									else{
										System.out.println("Brinco, bolsa, cordão, relógio, pulseira, cinta e etc");//verão-feminino-acessorio-social
									}
								}
							}
						}
					}
				}
				else{
					if(sexo.equals("masculino")){
						if(parteDoCorpo.equals("tronco")){
							if(estilo.equals("casual")){
								System.out.println("Casaco, camisa moletom e camisa de manga longa.");//inverno-masculino-tronco-casual
							}
							else{
								System.out.println("Terno e sobretudo");//inverno-masculino-tronco-social
							}
						}
						else{
							if(parteDoCorpo.equals("perna")){
								if(estilo.equals("casual")){
									System.out.println("Calça moletom e calça jeans.");//inverno-masculino-perna-casual
								}
								else{
									System.out.println("Calça social.");//inverno-masculino-perna-social
								}
							}
							else{
								if(parteDoCorpo.equals("pes")){
									if(estilo.equals("casual")){
										System.out.println("Tênis, bota.");//inverno-masculino-pes-casual
									}
									else{
										System.out.println("Sapato.");//inverno-masculino-pes-social
									}
								}
								else{
									if(estilo.equals("casual")){
										System.out.println("Luva, gorro.");//inverno-masculino-acessorio-casual
									}
									else{
										System.out.println("Relógio.");//inverno-masculino-acessorio-social
									}
								}
							}
						}
					}
					else{
						if(parteDoCorpo.equals("tronco")){
							if(estilo.equals("casual")){
								System.out.println("Casaco, casaco de lã, jaqueta");//inverno-feminino-tronco-casual
							}
							else{
								System.out.println("Casaco, sobre-tudo");//inverno-feminino-tronco-social
							}
						}
						else{
							if(parteDoCorpo.equals("perna")){
								if(estilo.equals("casual")){
									System.out.println("Calça moletom, calça jeans");//inverno-feminino-perna-casual
								}
								else{
									System.out.println("Calça jeans, calça social");//inverno-feminino-perna-social
								}
							}
							else{
								if(parteDoCorpo.equals("pes")){
									if(estilo.equals("casual")){
										System.out.println("Tenis, botas");//inverno-feminino-pes-casual
									}
									else{
										System.out.println("Botas e cano alto, saltos");//inverno-feminino-pes-social
									}
								}
								else{
									if(estilo.equals("casual")){
										System.out.println("Touca, colar, luva, anel");//inverno-feminino-acessorio-casual
									}
									else{
										System.out.println("Touca (alguns tipos), colar, luva, relógio, anel");//inverno-feminino-acessorio-social
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
