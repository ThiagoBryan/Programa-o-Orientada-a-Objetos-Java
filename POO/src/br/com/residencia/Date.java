package br.com.residencia;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {

	public static void main(String[] args) throws IOException  {
		
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Date antes de formatar: " + date);
		System.out.println("Date depois de formatar: " + simpleDateFormat.format(date));
		
		
				//TEM QUE COLOCAR O ParseException NO METODO
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		String stx = "07/11/1978";
//		java.util.Date dataUsuario = simpleDateFormat.parse(stx);
//		System.out.println("Date digitado e formatado: " + dataUsuario);
				
		
		
		

	}

	}

