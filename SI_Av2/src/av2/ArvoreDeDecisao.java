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
								System.out.println("Regata, Blusa e Camisa");//ver�o-masculino-tronco-casual
							}
							else{
								System.out.println("Blusa social e Blazer");//ver�o-masculino-tronco-social
							}
						}
						else{
							if(parteDoCorpo.equals("perna")){
								if(estilo.equals("casual")){
									System.out.println("Bermuda e short");//ver�o-masculino-perna-casual
								}
								else{
									System.out.println("Cal�a social e Cal�a Jeans Black");//ver�o-masculino-perna-social
								}
							}
							else{
								if(parteDoCorpo.equals("pes")){
									if(estilo.equals("casual")){
										System.out.println("T�nis, chinelo e percata.");//ver�o-masculino-pes-casual
									}
									else{
										System.out.println("Sapato social e sapat�nis.");//ver�o-masculino-pes-social
									}
								}
								else{
									if(estilo.equals("casual")){
										System.out.println("Bon�, cord�o e �culos escuro.");//ver�o-masculino-acessorio-casual
									}
									else{
										System.out.println("Gravata, rel�gio, cinto e suspens�rio.");//ver�o-masculino-acessorio-social
									}
								}
							}
						}
					}
					else{
						if(parteDoCorpo.equals("tronco")){
							if(estilo.equals("casual")){
								System.out.println("Jardineira, vestido curto, blusa, camisa, regata, e etc..");//ver�o-feminino-tronco-casual
							}
							else{
								System.out.println("Blusa social, vestido longo e blazer");//ver�o-feminino-tronco-social
							}
						}
						else{
							if(parteDoCorpo.equals("perna")){
								if(estilo.equals("casual")){
									System.out.println("Short, saia, bermuda, sarouel, e etc..");//ver�o-feminino-perna-casual
								}
								else{
									System.out.println("Cal�a social, saia longa, tubinho, e etc..");//ver�o-feminino-perna-social
								}
							}
							else{
								if(parteDoCorpo.equals("pes")){
									if(estilo.equals("casual")){
										System.out.println("Chinelo, sand�lia, sapatilha, aspargatas, rasteirinha, e etc..");//ver�o-feminino-pes-casual
									}
									else{
										System.out.println("Salto e crocs.");//ver�o-feminino-pes-social
									}
								}
								else{
									if(estilo.equals("casual")){
										System.out.println("Brinco, cord�o, rel�gio, pulseira, cinta e etc");//ver�o-feminino-acessorio-casual
									}
									else{
										System.out.println("Brinco, bolsa, cord�o, rel�gio, pulseira, cinta e etc");//ver�o-feminino-acessorio-social
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
									System.out.println("Cal�a moletom e cal�a jeans.");//inverno-masculino-perna-casual
								}
								else{
									System.out.println("Cal�a social.");//inverno-masculino-perna-social
								}
							}
							else{
								if(parteDoCorpo.equals("pes")){
									if(estilo.equals("casual")){
										System.out.println("T�nis, bota.");//inverno-masculino-pes-casual
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
										System.out.println("Rel�gio.");//inverno-masculino-acessorio-social
									}
								}
							}
						}
					}
					else{
						if(parteDoCorpo.equals("tronco")){
							if(estilo.equals("casual")){
								System.out.println("Casaco, casaco de l�, jaqueta");//inverno-feminino-tronco-casual
							}
							else{
								System.out.println("Casaco, sobre-tudo");//inverno-feminino-tronco-social
							}
						}
						else{
							if(parteDoCorpo.equals("perna")){
								if(estilo.equals("casual")){
									System.out.println("Cal�a moletom, cal�a jeans");//inverno-feminino-perna-casual
								}
								else{
									System.out.println("Cal�a jeans, cal�a social");//inverno-feminino-perna-social
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
										System.out.println("Touca (alguns tipos), colar, luva, rel�gio, anel");//inverno-feminino-acessorio-social
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
