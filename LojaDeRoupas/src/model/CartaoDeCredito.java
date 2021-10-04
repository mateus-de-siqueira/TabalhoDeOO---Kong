//package
package model;

import java.util.*;

//class
public class CartaoDeCredito{
	
	//scanner
	private Scanner sc = new Scanner(System.in);
	
	//attribute 
	private String bandeira;
	private String numeroDoCartao;
	private String codigoDeSeguranca;
	private String dataNasc;
	private int mesDataVenc;
	private int anoDataVenc;

	//constructor
	public CartaoDeCredito(String c, String b, String n, String d, int m, int a) {
		
		codigoDeSeguranca = c;
		bandeira = b;
		numeroDoCartao = n;
		dataNasc = d;
		mesDataVenc = m;
		anoDataVenc = a;
	}
	

	public String toString() {
		return 	  "\n"+"bandeira do cart�o  = " + bandeira
				+ "\n"+"N�mero do cart�o    = " + numeroDoCartao 
				+ "\n"+"C�digo de seguran�a = "+ codigoDeSeguranca 
				+ "\n"+"Data de cria��o     = " + dataNasc 
				+ "\n"+"M�s de vencimento   = " + mesDataVenc 
				+ "\n"+"Ano de vencimento   = "+ anoDataVenc + "\n";
	}


	
	//method construction

	public ArrayList<String>  cadastrar(ArrayList<String> data_cartao, String c, String b, String n, String d, int m, int a) { 
		
		CartaoDeCredito cartao = new CartaoDeCredito(
				c,
				b,
				n,
				d,
				m,
				a
				);
		
			data_cartao.add(cartao.codigoDeSeguranca);
			data_cartao.add(cartao.bandeira); 
			data_cartao.add(cartao.numeroDoCartao); 
	        data_cartao.add(cartao.dataNasc);
			
			String mesDataVenc_string = Integer.toString(cartao.mesDataVenc);
			data_cartao.add(mesDataVenc_string);
			
			String anoDataVenc_string = Integer.toString(cartao.anoDataVenc);
			data_cartao.add(anoDataVenc_string);
			
			return data_cartao;
			
		}

		public void visualizar(ArrayList<String> data_cartao, String codigoDeSeguranca) {
			
			int position = data_cartao.indexOf(codigoDeSeguranca);
			
			if(data_cartao.contains(codigoDeSeguranca)) {
				
				System.out.println(
						
						"INFORMA��ES DO CART�O"+"\n"+
						"codigoDeSeguranca: " + data_cartao.get(position)+"\n"+
						"Bandeira: " + data_cartao.get(position+1)+"\n"+
						"N�mero do cart�o: " + data_cartao.get(position+2)+"\n"+
						"Data de cria��o: " + data_cartao.get(position+3)+"\n"+
						"Mes de vencimento: " + data_cartao.get(position+4)+"\n"+
						"Ano de vencimento: " + data_cartao.get(position+5)+"\n"
						
						);
				}
				
			else {
				
				System.out.println("Cart�o n�o cadastrado!");	}
			
		}
		

		public void editar(ArrayList<String> data_cartao, String seg_cod) {
			
			int position = data_cartao.indexOf(seg_cod);
			
			data_cartao.remove(position);
			data_cartao.remove(position);
			data_cartao.remove(position);
			data_cartao.remove(position);
			data_cartao.remove(position);
			data_cartao.remove(position);

			data_cartao.add(seg_cod);
			
			System.out.println("Informe a bandeira do seu cart�o: " + "\n");
			String bandeira = sc.nextLine();
			data_cartao.add(bandeira);
			System.out.println("Informe o n�mero do seu cart�o: " + "\n");
			String num = sc.nextLine();
			data_cartao.add(num);
			System.out.println("Informe a data de expedi��o do seu cart�o: " + "\n");
			String new_dataNasc_string = sc.nextLine();
			data_cartao.add(new_dataNasc_string);
			System.out.println("Digite o mes de vencimento do seu cart�o: " + "\n");
			String new_mesDataVenc_string = sc.nextLine();
			data_cartao.add(new_mesDataVenc_string);
			System.out.println("Digite o ano de vencimento do seu cart�o: " + "\n");
			String new_anoDataVenc_string = sc.nextLine();
			data_cartao.add(new_anoDataVenc_string);
			
			System.out.println("Dados atualizados com sucesso!");
			
			
		}


		public void deletar(ArrayList<String> data_cartao, String seg_cod) {
			
			// deleting registration
			
			int position = data_cartao.indexOf(seg_cod);
			
			data_cartao.remove(position);
			data_cartao.remove(position);
			data_cartao.remove(position);
			data_cartao.remove(position);
			data_cartao.remove(position);
			data_cartao.remove(position);
			
			System.out.println("Cart�o removido com sucesso!");
		}

		//getters and setters
		public String getBandeira() {
			return bandeira;
		}

		public void setBandeira(String bandeira) {
			this.bandeira = bandeira;
		}

		public String getNumeroDoCartao() {
			return numeroDoCartao;
		}

		public void setNumeroDoCartao(String numeroDoCartao) {
			this.numeroDoCartao = numeroDoCartao;
		}

		public String getCodigoDeSeguranca() {
			return codigoDeSeguranca;
		}

		public void setCodigoDeSeguranca(String codigoDeSeguranca) {
			this.codigoDeSeguranca = codigoDeSeguranca;
		}

		public String getDataNasc() {
			return dataNasc;
		}

		public void setDataNasc(String dataNasc) {
			this.dataNasc = dataNasc;
		}

		public int getMesDataVenc() {
			return mesDataVenc;
		}

		public void setMesDataVenc(int mesDataVenc) {
			this.mesDataVenc = mesDataVenc;
		}

		public int getAnoDataVenc() {
			return anoDataVenc;
		}

		public void setAnoDataVenc(int anoDataVenc) {
			this.anoDataVenc = anoDataVenc;
		}
		
}
