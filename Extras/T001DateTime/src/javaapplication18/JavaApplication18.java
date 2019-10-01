/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author anderson
 */
public class JavaApplication18 {

    //Dica de site: https://howtodoinjava.com/java/date-time/java-get-current-datetime-examples/
    public static void main(String[] args) {
        
        
        mostrarDataCalendar();
        mostratDataLocalDate();
        mostrarDataLocaleFormat();
                
        mostrarData();
    }
    
    public static void mostrarDataCalendar(){
        Calendar dataAtual = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
        System.out.println(dateFormat.format(dataAtual.getTime()));
    }
    
    public static void mostratDataLocalDate(){
        LocalDateTime dataAtual = LocalDateTime.now(); 
        String dataFormatada = dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - hh:mm:ss"));
        System.out.println(dataFormatada);
    }
    
    public static void mostrarDataLocaleFormat(){       
        Locale ptBR = new Locale("pt", "br");
        DateTimeFormatter  formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", ptBR);
        LocalDateTime date = LocalDateTime.now();
        String formattDate = date.format(formatter); 
        System.out.println(formattDate);
    }       
    
    public static void mostrarData () {
        Calendar data = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
        int ano = data.get(Calendar.YEAR);
        int mes = data.get(Calendar.MONTH+1); //Aqui obrigatóriamente terá que adicionar 1
        int dia = data.get(Calendar.DAY_OF_MONTH);
        int hora = data.get(Calendar.HOUR_OF_DAY);
        int minuto = data.get(Calendar.MINUTE);

        System.out.println(dia + "/" + mes + "/" + ano + " - " + hora + ":" + minuto);
   }
    
}
