package br.com.ses_sender.services;

public class SESEmail {
  private String bodyText;
  private String bodyHTML;
  
  
    public SESEmail (String bodyText, String bodyHTML) {
    this.bodyText = bodyText;
    this.bodyHTML = bodyHTML;
    }
     public String getBodyText() {
        return bodyText;
     }

      public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
      }

     public String getBodyHTML() {
      return bodyHTML;
    }

    public void setBodyHTML(String bodyHTML) {
      this.bodyHTML = bodyHTML;
   }

}
