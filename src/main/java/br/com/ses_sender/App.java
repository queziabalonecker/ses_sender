package br.com.ses_sender;


import br.com.ses_sender.services.SESService;

public class App 
{
    public static void main( String[] args )
    {
		SESService.sendMessage("danilo.aparecido.santos@gmail.com", "Email de teste");
    }
}
