package MapAgendaEventos;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {

	private Map<LocalDate,Evento> eventoMap;

	public AgendaEventos() { this.eventoMap = new HashMap<>(); }
	
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		eventoMap.put(data, new Evento(nome, atracao));
	}

	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
		System.out.println(eventoTreeMap);
	} 
	
	public void proximoEvento() {
		//Set<LocalDate> dataSet = eventoMap.keySet();
		//Collection<Evento> values = eventoMap.values();
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximaData = null;
		Evento proximoEvento  = null;
		Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
		
		for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
			if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				proximaData = entry.getKey();
				proximoEvento = entry.getValue();
				System.out.println("O proximo evento: " + proximoEvento + " acontecera em " + proximaData);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		
		agendaEventos.adicionarEvento(LocalDate.of(2024,7,31), "Evento 1", "Atracao 1");
		agendaEventos.adicionarEvento(LocalDate.of(2024,5,2), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024,6,1), "Evento 3", "Atracao 3");

        agendaEventos.exibirAgenda();
        
		agendaEventos.proximoEvento();
		
		
		
	}
}
