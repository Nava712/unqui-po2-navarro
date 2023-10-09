package ar.edu.unq.po2.tp6;

public class SolicitudPersonal extends SolicitudDeCredito {

	@Override
	public int solicitudDeCredito(Cliente cliente, int monto, int plazoEnMeses) {
		boolean ingresosAnualesMayoresA15000 = cliente.getSueldoNetoAnual() >= 15000;
		boolean montoNoMayorAIngresosMensuales = monto < (cliente.getSueldoNetoMensual() * 0.7);
		
		if (ingresosAnualesMayoresA15000 && montoNoMayorAIngresosMensuales) {
			return monto / plazoEnMeses;
		} else { 
			return 0;
		}
	}

}
