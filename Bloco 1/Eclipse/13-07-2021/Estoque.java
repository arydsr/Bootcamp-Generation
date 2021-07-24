package br.com.generation.collection2;

public class Estoque {

		private String sku;  
		private String descricao; 
		private int quantidade; 
		private double valorUni;
		
		public String getSku() {
			return sku;
		}
		public void setSku(String sku) {
			this.sku = sku;
		}
		public String getItem() {
			return descricao;
		}
		public void setItem(String item) {
			this.descricao = item;
		}
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		public double getValorUni() {
			return valorUni;
		}
		public void setValorUni(double valorUni) {
			this.valorUni = valorUni;
		}
		
		public Estoque(String sku, String descricao, int quantidade, double valorUni) {
			super();
			this.sku = sku;
			this.descricao = descricao;
			this.quantidade = quantidade;
			this.valorUni = valorUni;
		} 
		
		public String toString() {
			return "|SKU: " + this.sku + " | Descrição: " + this.descricao + " | Quantidade: " + 
		this.quantidade + " | Valor unit: " + this.valorUni + "|";
		}
		
	}