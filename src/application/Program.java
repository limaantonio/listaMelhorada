package application;

import java.util.ArrayList;
import java.util.List;

import entities.Cliente;

public class Program {

	public static void main(String[] args) {
		
		List<Cliente> clientes = new ArrayList<>();
		
		//Adiciona alguns cliente.
		clientes.add(new Cliente("José"));
		clientes.add(new Cliente("Maria"));
		clientes.add(new Cliente("Pedro"));
		
		System.out.println("Clientes cadastrados");
		
		for(Cliente cliente : clientes) {
			System.out.println(cliente);
		}
		
		//Removendo Pedro:
		Cliente c = clientes.stream().filter(x ->x.getNome() == "Pedro").findFirst().orElse(null);
		clientes.remove(c);
		
		System.out.println("Clientes após a remoção");
		for(Cliente cliente : clientes) {
			System.out.println(cliente);
		}
		
	}

}
