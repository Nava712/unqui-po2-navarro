package ar.edu.unq.po2.test.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.EquipoDeTrabajo;
import ar.edu.unq.po2.tp3.PersonaEquipoTrabajo;

class TestEquipoDeTrabajo {
	private EquipoDeTrabajo equipo = new EquipoDeTrabajo("Machucales", new ArrayList<PersonaEquipoTrabajo>());
	private PersonaEquipoTrabajo persona1 = new PersonaEquipoTrabajo("Juan", "Perez", 32);
	private PersonaEquipoTrabajo persona2 = new PersonaEquipoTrabajo("Carla", "Dominguez", 30);
	private PersonaEquipoTrabajo persona3 = new PersonaEquipoTrabajo("Pablo", "Montanero", 28);
	private PersonaEquipoTrabajo persona4 = new PersonaEquipoTrabajo("Estela", "Pierro", 47);
	private PersonaEquipoTrabajo persona5 = new PersonaEquipoTrabajo("Facundo", "Lopez", 31);
	
	@BeforeEach
	public void setUp() {
		equipo.agregarPersona(persona1);
		equipo.agregarPersona(persona2);
		equipo.agregarPersona(persona3);
		equipo.agregarPersona(persona4);
		equipo.agregarPersona(persona5);
	}
	
	@Test
	public void promedioEdad() {
		assertEquals(33.0, equipo.promedioEdadEquipo());
	}
}
