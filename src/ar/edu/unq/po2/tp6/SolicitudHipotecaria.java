package ar.edu.unq.po2.tp6;

public class SolicitudHipotecaria extends SolicitudDeCredito {

	@Override
	public int solicitudDeCredito(Cliente cliente, int monto, int plazoEnMeses) {
		Propiedad propiedadEnGarantia = cliente.getPropiedad();
		boolean montoNoMayorAIngresosMensuales = monto < (cliente.getSueldoNetoMensual() * 0.5);
		boolean montoNoMayorAValorDePropiedad = monto < (propiedadEnGarantia.getValorFiscal() * 0.7);
		boolean esMenorA65años = cliente.getEdad() < 65;
		
		if (montoNoMayorAIngresosMensuales && montoNoMayorAValorDePropiedad && esMenorA65años) {
			return monto / plazoEnMeses;
		} else {
			return 0;
		}
	}

}
