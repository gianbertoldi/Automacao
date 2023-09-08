package validations;

import static org.junit.Assert.assertEquals;

public class GenericValidations {

	public void validationTextoEsperadoAtual(String txtEsperado, String txtAtual) {
		assertEquals(txtEsperado, txtAtual, "Texto estão Diferentes");
	}
}
